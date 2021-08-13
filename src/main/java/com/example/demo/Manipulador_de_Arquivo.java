package com.example.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manipulador_de_Arquivo {

public static void leitor(String path) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(path));
		String linha = "";
		while(true) {
			if (linha != null) {
				System.out.println(linha);
			}
			else 
				break;
			linha = br.readLine();
			}
		
			br.close();
		}
	
		public static void escritor(String path) throws IOException{
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			String linha = "";
			Scanner in = new Scanner(System.in);
			System.out.println("Escreva algo: ");
			linha = in.nextLine();
			bw.append(linha);
			bw.close();
			
		}
}
