package view;

import controller.SoController;

public class Main {
	
	public static void main(String[] args) {
		SoController soController = new SoController();
		String mySO = soController.os() + " / " + soController.version();
		
		System.out.println("SO="+ mySO);
		
		
	}

}
