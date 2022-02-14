package controller;

import java.util.Scanner;
import interfaces.*;

public class MainController implements IMainControler{
	IView view;
	@Override
	public void run() {
		Scanner teclado=new Scanner(System.in);
		int option=-1;
		
		do {
		
			showMainMenu();
			option=view.readMainMenuOption();
			switchMain(option);
		
		}while(option!=5);
	}
	
	/*
	 * muestra el menu principal de acciones
	 */
	private void showMainMenu() {
		
		view.ShowMainMenu();
		
	}
	
	/*
	 *ejecuta una de las opciones disponibles del 
	 *menu principal en funcion del valor de option
	 * 
	 * @param option: valor leido por teclado despues
	 * del menu
	 */
	private void switchMain(int option) {
		String name="";
		
		switch(option) {
		
			case 1: 
				
				addDrink();
			
			break;
		
			case 2: 
				
				searchDrink(name);
				
			break;
			
			case 3:
			
				getDrink(name);
		
			break;
			
			case 4:
				
				
		
		
		
		}
		
	}
	
	
	/*
	 * ejecuta la accion de añadir una nueva  bebida, para
	 * tomar los datos hace iso de SecundaryController
	 * @return
	 */
	private boolean addDrink() {
		
		return false;
		
	}
	
	/*
	 * busca y devuelve la nenida dada por el nombre  
	 * @param name: nombre de la bebida a buscar
	 * @return la bebifa o null en caso de no existir
	 */
	private IDrink searchDrink(String name) {
		
		return null;
	}
	
	/*
	 *busca, devuelve y elimina del almacen la bebida dada por el nombre
	 * 
	 * @return
	 */
	
	
	/*
	 * actualiza la bebida con los nuevos datos 
	 * @param drink
	 * @return
	 */
	private boolean updateDrink(IDrink drink) {
		
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	private float getHowMuch() {
		
		
		return 0;
	}
	
	private IDrink getDrink(String name) {
		
		return null;
	}
	
}
