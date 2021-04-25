package supermenu;

import java.util.Scanner;

import json.ArchivoJson;
import objetos.Tarjeta;

public class SuperMenu {

	public static void main(String[] args) {
		
		boolean menu = true;
		ArchivoJson archivo = new ArchivoJson();
		
		Modelo modelo = null;
		try {
			modelo = archivo.abrirJSON("base");
			
		
		while(menu) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ingrese 1 para buscar datos de una tarjeta");
		System.out.println("ingrese 2 para validar operacion");
		System.out.println("ingrese 3 para validar tarjeta");
		System.out.println("ingrese 4 para comparar tarjetas");
		System.out.println("ingrese 5 para obtener tasa");
		System.out.println("ingrese 6 para salir");
		int opcion = scanner.nextInt();
		switch(opcion) {
		case(1):{
			System.out.flush();
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
			System.out.flush();
			int tarjeta = 0;
			int monto = 0;
			System.out.println("ingrese numero de tarjeta");
			 try {
				tarjeta = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("tarjeta invalida");
				break;
			}
			System.out.println("ingrese monto");
			 try {
				monto = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("monto invalido");
				break;
			}
				if (modelo.validarOperacion(monto, tarjeta)) {
					System.out.println("operacion valida");
				}
				else {
					System.out.println("operacion invalida");
				}
			
		}
		case(3):{
			System.out.flush();
			int tarjeta;
			System.out.println("ingrese numero de tarjeta");
			try{
				tarjeta = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("ingrese un numero valido");
				break;
			}
			if(modelo.existeTarjeta(tarjeta)) {
				boolean ret = modelo.validarTarjeta(tarjeta);
				if(ret)System.out.println("la tarjeta es valida");
				else System.out.println("la tarjeta no es valida");
			}
			else {
				System.out.println("la tarjeta no existe");
				break;
			}
		}
		case(4):{
			System.out.flush();
			int tarjeta1;
			int tarjeta2;
			System.out.println("ingrese numero de tarjeta1");
			try{
				tarjeta1 = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("ingrese un numero valido");
				break;
			}
			System.out.println("ingrese numero de tarjeta2");
			try{
				tarjeta2 = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("ingrese un numero valido");
				break;
			}
			if(tarjeta1 == tarjeta2) System.out.println("las tarjetas son iguales");
			
			else System.out.println("las tarjetas NO son iguales");
			
			break;
		}
		case(5):{
			System.out.flush();
			float monto = 0;
			String marca;
			
			System.out.println("ingrese monto");
			 try {
				monto =(float) scanner.nextInt();
			} catch (Exception e) {
				System.out.println("monto invalido");
				break;
			}
			System.out.println("ingrese marca"); 
			marca = scanner.next();
			marca = marca.toUpperCase();
			float tasa = Modelo.calcularTasa(monto, marca) ;
			
			if(tasa != 0) System.out.println("la tasa de la operacion es: " + tasa);
			else System.out.println("la marca ingresada no es conocida");
			 
		}
		case(6):{
			System.out.flush();
			menu = false;
		}
		}
		}
		} catch (Exception e1) {
			System.out.println("no se encontro la base");
		}
		
		

	}

}
