package com.sapient.service;

public class NokiaLumia extends Nokia1100 {
	public void captureImage() {
		System.out.println("Capture image");
	}

	public void browseNet() {
		System.out.println("Browse internet");
	}
/*Overriding*/
public void doConverse(){
	System.out.println("do converse 4G");
}

public void doConverse2g(){
	super.doConverse();
}

}
