package estudos;

import java.util.ArrayList;
import java.util.Scanner;

public class execeções {
//to-do the list to-do
//para criar um array em java, basta usar a sintaxe tipodevar[] name = new tipo[quantidade]
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList();
		do {
			System.out.println("Qual a sua tarefa?");
			String tare = sc.nextLine();
			tarefas.add(tare);
			for (String taref : tarefas) {
				System.out.println(taref);
			}
			System.out.println("Quer continuar? (S/N)");
		} while (sc.nextLine().equalsIgnoreCase("S"));
		
	}
}
