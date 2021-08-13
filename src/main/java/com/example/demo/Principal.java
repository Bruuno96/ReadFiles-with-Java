package com.example.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

		public static void main(String[] args) {
			
			try {
				
				System.out.println("Escrevendo em um arquivo texto...");
				Manipulador_de_Arquivo.escritor("C:\\Users\\PC\\OneDrive\\Área de Trabalho\\demo\\temp.txt");
				
				System.out.println("\n\n");
				System.out.println("Lendo o arquivo...");
				Manipulador_de_Arquivo.leitor("C:\\Users\\PC\\OneDrive\\Área de Trabalho\\demo\\temp.txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	
	
	
	
	
	}


