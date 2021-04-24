package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import supermenu.Modelo;

public class ArchivoJson {
	public void guardarJSON(Modelo modelo,String archivo) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(modelo);
		
		try {
			FileWriter writer = new FileWriter(archivo);
			writer.write(json);
			writer.close();
		} catch (IOException e1) {
			e1.printStackTrace();
			}
		}
	public Modelo abrirJSON(String archivo){
		Gson gson = new Gson();
		Modelo ret = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));		
			ret = gson.fromJson(br, Modelo.class);
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return ret;
	}
}
	
