package supermenu;

import java.util.Scanner;

import objetos.Tarjeta;

public class SuperMenu {

	public static void main(String[] args) {
		
		Modelo modelo = null ;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese 1 para buscar datos de una tarjeta");
		System.out.println("ingrese 2 para validar operacion");
		System.out.println("ingrese 3 para validar tarjeta");
		System.out.println("ingrese 4 para comparar tarjetas");
		System.out.println("ingrese 5 para obtener tasa");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case(1):{
			
			System.out.println("ingrese numero de tarjeta");
			int tarjeta = scanner.nextInt();
			Tarjeta ret = modelo.getTarjeta(tarjeta);
			System.out.println(ret.toString());
		}
		case(2):{
			
		}
		case(3):{
			
		}
		case(4):{
			
		}
		case(5):{
			
		}
		}
		
		

	}

}
