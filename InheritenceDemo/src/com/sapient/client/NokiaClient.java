package com.sapient.client;

import com.sapient.service.NokiaLumia;

public class NokiaClient {
	public static void main(String args[]){
		NokiaLumia mobile = new NokiaLumia();
		mobile.doConverse();
		mobile.sensSms();
		mobile.captureImage();
		mobile.browseNet();
		mobile.doConverse2g();
		
	}

}
