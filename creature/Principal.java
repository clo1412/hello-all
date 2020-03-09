package creature;

import java.util.ArrayList;
import java.util.Scanner;

import menu.MenuController;

public class Principal extends Human{

	private static final int EXIT_VALUE = 6;
	private static final int NUM_INPUT = 0;
	public static final int ONUM_INPUT = 1;
	static Scanner teclado;
	public static int num, onum;
	public static double dob;
	public static ArrayList<Double> aReales;
	MenuController menuController;
	
	public Principal() {
		variableInitialization();
		do{
			showMenu();
			integerInputController(NUM_INPUT);
			
			switch (num){
				case 1:
					menuController.caseMenu1();
					break;
					
				case 2:
					menuController.caseMenu2();
					break;	
					
				case 3:
					menuController.caseMenu3();
					break;
					
				case 4:
					menuController.caseMenu4();
					break;
					
				case 5:
					menuController.caseMenu5();
					break;
					
				case 6:					
					System.out.println("Número erroneo.");
					break;
			}
			showAllData();
		} while (num != EXIT_VALUE);
	}

	private void variableInitialization() {
		menuController = new MenuController();
		teclado = new Scanner(System.in);
		aReales = new ArrayList<Double>();
		num = onum = 0;
		dob = 0;
	}
	
	private void showAllData() {
		for (Double d : aReales) {
			System.out.println(d);
		}
	}

	public static void doubleInputController() {
		dob = Double.parseDouble(teclado.nextLine());
	}

	public static void integerInputController(int isNum) {
		if(isNum == NUM_INPUT){			
			num = Integer.parseInt(teclado.nextLine());
		}else{			
			onum = Integer.parseInt(teclado.nextLine());
		}
	}

	private void showMenu() {
		System.out.println("soy el master");
		System.out.println("Soy rama2");
		System.out.println("Introduce una opción:");
		System.out.println("1 Inserta un número");
		System.out.println("2 Buscar un número");
		System.out.println("3 Modificar un número");
		System.out.println("4 Borrar un número");
		System.out.println("5 Inserta un número en un posición dada");
		System.out.println("6 Salir");
		System.out.println("Introduce numero ");
	}

}
