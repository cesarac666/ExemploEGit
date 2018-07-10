package controller;

public class SoController {
	
	public SoController() {
		super();
	}

	public String os() {
		// retorno o tipo de sistema ( linux, windows, etc )
		return System.getProperty("os.name");
		
	}
}
