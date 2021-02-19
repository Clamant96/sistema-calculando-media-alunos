package sistema_medias;

import java.util.Scanner;

public class TabelaMedias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
			Tabela para armazenar nomes de alunos e suas respectivas notas e a media final
			matriz[linha][coluna] -> [linha][coluna]
			nome n1 n2 n3 n4 media
		*/
		
		String[][] matriz = new String[2][6];
		String nome, nota;
		double media = 0.0;
		
		Scanner entradaString = new Scanner(System.in);
		

		for (int linha = 0; linha < matriz.length; linha++) {
			System.out.print("Ola, qual seu nome: ");
			nome = entradaString.nextLine();
			
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				
				matriz[linha][coluna] = nome;

				if(coluna >= 1 && coluna <= 4){
					System.out.print("Nota "+ (coluna) +": ");
					nota = entradaString.nextLine();
					
					matriz[linha][coluna] = nota;

				}else if(coluna == 5){
					for(int j = 1; j < matriz[linha].length; j++){
						
						if(j <= 4 ){
							media = media + Double.parseDouble(matriz[linha][j]);
						}
					}
					
					media = media / (matriz[linha].length - 2);
					matriz[linha][coluna] = Double.toString(media);
				}
				
				media = 0;
				
			}
		}

		System.out.println("");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {

				switch(j){
					case 0:
						System.out.println("Nome: "+ matriz[i][j]);
					break;

					case 5:
						System.out.println("Media: "+ matriz[i][j]);
					break;

				}

			}
		}	

	}

}
