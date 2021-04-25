package creador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import json.ArchivoJson;
import objetos.*;
import supermenu.*;
public class Creador {

	public static void main(String[] args) {
		
		Modelo modelo;
		
		List<Operacion> operaciones = new ArrayList<Operacion>();
		List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();
		List<Persona> personas = new ArrayList<Persona>();
		
		
		Persona persona1 = new Persona("julian rodriguez",38888871);
		Persona persona2 = new Persona("pablo tamashiro",38888871);
		Persona persona3 = new Persona("ivan pupkin",38888871);
		
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		
		Tarjeta tarjeta1 = new Tarjeta(123456, 7, 2026, persona1, Marca.VISA);
		Tarjeta tarjeta2 = new Tarjeta(123457, 7, 2023, persona1, Marca.AMEX);
		Tarjeta tarjeta3 = new Tarjeta(123458, 7, 2019, persona2, Marca.VISA);
		Tarjeta tarjeta4 = new Tarjeta(123459, 7, 2015, persona2, Marca.NARA);
		Tarjeta tarjeta5 = new Tarjeta(123465, 7, 2020, persona3, Marca.NARA);
		Tarjeta tarjeta6 = new Tarjeta(123423, 7, 2024, persona3, Marca.AMEX);
		
		tarjetas.add(tarjeta1);
		tarjetas.add(tarjeta2);
		tarjetas.add(tarjeta3);
		tarjetas.add(tarjeta4);
		tarjetas.add(tarjeta5);
		tarjetas.add(tarjeta6);
		
		Operacion operacion1 = new Operacion(tarjeta1, 240);
		Operacion operacion2 = new Operacion(tarjeta1, 200);
		Operacion operacion3 = new Operacion(tarjeta2, 20);
		Operacion operacion4 = new Operacion(tarjeta2, 50);
		Operacion operacion5 = new Operacion(tarjeta3, 40);
		Operacion operacion6 = new Operacion(tarjeta3, 90);
		Operacion operacion7 = new Operacion(tarjeta4, 40);
		Operacion operacion8 = new Operacion(tarjeta4, 80);
		Operacion operacion9 = new Operacion(tarjeta5, 240);
		Operacion operacion10 = new Operacion(tarjeta5, 200);
		Operacion operacion11 = new Operacion(tarjeta6, 200);
		Operacion operacion12 = new Operacion(tarjeta6, 800);
		
		operaciones.add(operacion1);
		operaciones.add(operacion2);
		operaciones.add(operacion3);
		operaciones.add(operacion4);
		operaciones.add(operacion5);
		operaciones.add(operacion6);
		operaciones.add(operacion7);
		operaciones.add(operacion8);
		operaciones.add(operacion9);
		operaciones.add(operacion10);
		operaciones.add(operacion11);
		operaciones.add(operacion12);
		
		modelo = new Modelo(personas,tarjetas,operaciones);
		ArchivoJson archivo = new ArchivoJson();
		try {
			archivo.guardarJSON(modelo, "base");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
