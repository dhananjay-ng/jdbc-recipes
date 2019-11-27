package com.pluralsight.corejdbc.m6c2;

public class MainClass {

	public static void main(String[] args) throws Exception {
		try {

			ProductComponent comp = new ProductComponent();

			comp.listProductsBy("Motorcycles");

		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}
	}
}
