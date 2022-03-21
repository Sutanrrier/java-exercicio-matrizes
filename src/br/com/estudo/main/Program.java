package br.com.estudo.main;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int m, n;
		int numero;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quantidade de linhas e colunas da matriz: ");
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] matriz = new int[m][n];
		
		//Popular a matriz com numeros
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número ao qual deseja encontra na matriz: ");
		numero = sc.nextInt();
		
		//Buscar na matriz occorrências de um número
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == numero) {
					System.out.println("Encontrado na Posição " + i + ", " + j);
					//Mostra, se existir, os seus parentes a esquerda, direita, cima e baixo
					if(j > 0) {
						System.out.println("A sua Esquerda: " + matriz[i][j-1]);
					}
					if(j < matriz[i].length-1) {
						System.out.println("A sua Direita: " + matriz[i][j+1]);
					}
					if(i > 0) {
						System.out.println("Acima dele: " + matriz[i-1][j]);
					}
					if(i < matriz.length-1) {
						System.out.println("Abaixo dele: " + matriz[i+1][j]);
					}
				}
			}
			System.out.println();
		}
		
	}
}
