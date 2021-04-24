package supermenu;

import java.util.Scanner;

import json.ArchivoJson;
import objetos.Tarjeta;

public class SuperMenu {

	public static void main(String[] args) {
		
		ArchivoJson archivo = new ArchivoJson();
		
		Modelo modelo = null;
		try {
			modelo = archivo.abrirJSON("base");
			
		
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese 1 para buscar datos de una tarjeta");
		System.out.println("ingrese 2 para validar operacion");
		System.out.println("ingrese 3 para validar tarjeta");
		System.out.println("ingrese 4 para comparar tarjetas");
		System.out.println("ingrese 5 para obtener tasa");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case(1):{
			int tarjeta;
			Tarjeta ret;
			System.out.println("ingrese numero de tarjeta");
			try{
				tarjeta = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("ingrese un numero valido");
				break;
			}
			try {
			ret = modelo.getTarjeta(tarjeta);
			}
			catch(Exception e) {
				System.out.println("tarjeta no encontrada");
				break;
			}
			System.out.println(ret.toString());
		}
		case(2):{
			int tarjeta = 0;
			int monto = 0;
			System.out.println("ingrese numero de tarjeta");
			 try {
				tarjeta = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("tarjeta invalida");
			}
			System.out.println("ingrese monto");
			 try {
				monto = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("monto invalido");
			}
				if (modelo.validarOperacion(monto, tarjeta)) {
					System.out.println("operacion valida");
				}
				else {
					System.out.println("operacion invalida");
				}
			
		}
		case(3):{
			
		}
		case(4):{
			
		}
		case(5):{
			
		}
		case(6):{
			
		}
		}
		}
		} catch (Exception e1) {
			System.out.println("no se encontro la base");
		}
		
		

	}

}
