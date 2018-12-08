package br.com.projetos.libertadores;


import java.util.Scanner;

public class Libertadores {
	
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
			
			jogo();
				
		}
		
		public static void jogo() {
			
			String time1 = "", time2 = "", a;
			
			int[] placar = new int[4]; int j = 0;
			int[] pontos = new int[2];
			int[] placarPenaltis = new int[2]; 
			
				
			for(int i = 1; i <= 2; i++ ) {
				
				if(i == 1) {
				System.out.print("Digite o primeiro time ");
				time1 = input.nextLine().toUpperCase().trim(); 
									
				System.out.println(" ");
				
				System.out.print("Digite o segundo time ");
				time2 = input.nextLine().toUpperCase().trim();
				
				System.out.println("");
								
			
				
				System.out.print("Digite o placar do " + i + "° jogo ");
				placar[j] = input.nextInt();
				
				a = input.next();
				
				placar[j+1] = input.nextInt();
				
								
				if(placar[j] < placar[j+1])
				pontos[0] += 3;
					
				
				
				else if(placar[j] == placar[j+1]) {
					pontos[0] += 1;
					pontos[1] +=1;
					
				}
				else pontos[1] += 3;
				
				j = 2;
				
				
							
		}
				
				else {
					System.out.print("Digite o placar do " + i + "° jogo ");
					placar[j+1] = input.nextInt();
					
					a = input.next();
					
					placar[j] = input.nextInt();
					
										
					if(placar[j] > placar[j+1])
					pontos[1] += 3;
						
					
					
					else if(placar[j] == placar[j+1]) {
						pontos[0] += 1;
						pontos[1] +=1;
				}
					else pontos[0] += 3;
					
			}
		
		}
			
			System.out.println("");
			
						
				if(pontos[0] > pontos[1]) System.out.println(time1 + " Avançou");
				
				else if(pontos[0] < pontos[1]) System.out.println(time2 + " Avançou");
				
				else if(pontos[0] == pontos[1]) {
					System.out.println(placar[0] > placar[3] ? time1 + " Avançou": time2 + " Avançou"); 
				}
				
				else {
					if(placar[2] > placar[1]) System.out.println(time1 + " Avançou");
					
					else if(placar[2] < placar[1]) System.out.println(time2 + " Avançou");
					
					else {
												
						System.out.println("Penaltis");
						
						System.out.println("");
						
						System.out.print("Digite o placar dos penaltis ");
						placarPenaltis[0] = input.nextInt();
						
						a = input.next();
						
						placarPenaltis[1] = input.nextInt();
						
						System.out.println("");
						
						if(placarPenaltis[0] > placarPenaltis[1]) System.out.println(time2 + " Avançou");
						
						else System.out.println(time1 + " Avançou");
						
					}
				}
			
			
		}	
}

