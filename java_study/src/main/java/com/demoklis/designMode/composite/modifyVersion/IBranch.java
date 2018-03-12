package com.demoklis.designMode.composite.modifyVersion;

import java.util.ArrayList;

public interface IBranch {

	public void addSubordinate(ICorp corp);
	
	public ArrayList<ICorp> getSubordinate();
}
