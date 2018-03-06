package com.demoklis.java_study;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
/**
 * 根据传过来的class获取当前class包以及子文件的所有class文件，并加载到jvm
 * @author demoklis
 *
 */
public class ReadAndLoadClass2VM {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Class> c=new ArrayList<Class>();
		String packageName=App.class.getPackage().getName();
		ClassLoader cl=Thread.currentThread().getContextClassLoader();
		String path=packageName.replace(".", "/");
		Enumeration<URL> resources=cl.getResources(path);
		List<File> dirs=new ArrayList<File>();
		while(resources.hasMoreElements()) {
			URL url=resources.nextElement();
			dirs.add(new File(url.getFile()));
		}
		for(File f:dirs) {
			c.addAll(getClasses(f, packageName));
		}
		System.out.println(c);
	}
	
	public static Collection<Class> getClasses(File directory,String packageName) throws ClassNotFoundException{
		List<Class> returnVal=new ArrayList<Class>();
		if(!directory.exists()) {
			return returnVal;
		}
		File[] f=directory.listFiles();
		for(File t:f) {
			if(t.isDirectory()) {
				assert !t.getName().contains(".");
				returnVal.addAll(getClasses(t, packageName+"."+t.getName()));
			}else if(t.getName().endsWith(".class")){
				returnVal.add(Class.forName(packageName+"."+t.getName().substring(0, t.getName().length()-6)));
			}
		}
		return returnVal;
	}
}
