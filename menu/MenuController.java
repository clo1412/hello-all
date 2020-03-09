package menu;

import creature.Principal;

public class MenuController {

	public MenuController() {}
	
	public void caseMenu1() {
		System.out.println("Introduce el número a insertar");
		Principal.doubleInputController();
		Principal.aReales.add(Principal.dob);
	}
	
	public void caseMenu2() {
		System.out.println("Introduce el número a buscar");
		Principal.doubleInputController();
		if (Principal.aReales.contains(Principal.dob)) {
			Principal.onum = Principal.aReales.indexOf(Principal.dob);
			System.out.println("El número" + Principal.dob  + "está en la posición " + Principal.onum);
		} else {
			System.out.println("El número " + Principal.dob + "no se encuentra en la lista.");
		}
	}

	public void caseMenu3() {
		System.out.println("Introduce el número a modificar");
		Principal.doubleInputController();
		if (Principal.aReales.contains(Principal.dob)) {
			Principal.onum = Principal.aReales.indexOf(Principal.dob);
			System.out.println("Introduce el número nuevo");
			Principal.doubleInputController();
			Principal.aReales.set(Principal.onum, Principal.dob);
		} else {
			System.out.println("El número " + Principal.dob + "no se encuentra en la lista.");
		}
	}
	
	public void caseMenu4() {
		System.out.println("Introduce el número a borrar");
		Principal.doubleInputController();
		if (Principal.aReales.contains(Principal.dob))
			Principal.aReales.remove(Principal.dob);
		else {
			System.out.println("No existe el número a borrar");
		}
	}
	
	public void caseMenu5() {
		System.out.println("Introduce una posición a insertar");
		Principal.integerInputController(Principal.ONUM_INPUT);
		if (Principal.onum < Principal.aReales.size()) {
			System.out.println("Introduce el número a insertar");
			Principal.doubleInputController();
			Principal.aReales.add(Principal.onum, Principal.dob);
		} else {
			System.out.println("No se puede insertar en esa posición");
		}
	}
	
	
	
}
