package br.com.fiap.tads.rm94548.ddd.fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		boolean menu = true;
		while (menu) {
			System.out.println("==============-FIBONACCI-==============");
			System.out.println("1. Gerar o en�simo n�mero usando a f�rmula fechada");
			System.out.println("2. Gerar o en�simo n�mero usando a f�rmula recursiva");
			System.out.println("3. Gerar uma lista com a sequ�ncia at� o en�simo termo");
			System.out.println("0. Sair");
			String opcao = in.nextLine();
			
			switch (opcao) {
			
			case "1":
				System.out.println("Digite o en�simo termo: ");
				int num = Integer.parseInt(in.nextLine());
				System.out.println("O termo de n�mero " + num + " � " + formulaFechada(num));
				break;
			case "2":
				System.out.println("Digite o en�simo termo: ");
				num = Integer.parseInt(in.nextLine());
				System.out.println("O termo de n�mero " + num + " � " + formulaRecursiva(num));
				break;
			case "3":
				System.out.println("Digite at� qual en�simo termo a lista deve ir: ");
				num = Integer.parseInt(in.nextLine());
				long[] sequencia = new long[num];
				for (int i = 1; i <= num; i++) {
					sequencia[i-1] = formulaFechada(i);
					System.out.println(sequencia[i-1]);
				}
				break;
			case "0":
				System.out.println("O macaco est� acenando. Tchau!");
				menu = false;
				break;
			default:
				System.out.println("Escolha uma op��o v�lida.");
			}
		}
		
		in.close();
	}
	/**
	 * Utiliza da formula recursiva [F(n) = F(n-1) + F(n-2) para n>=1] para
	 * encontrar o n�mero na posi��o desejada da sequ�ncia
	 * @param enesimo a posi��o do n�mero na sequ�ncia de Fibonacci
	 * @return o en�simo termo requerido
	 */
	static long formulaRecursiva(int enesimo) {
		long fn = 0;
		long ultimo = 1, penultimo = 1;
		if (enesimo == 1 || enesimo == 2) {
			fn = 1;
		} else {
			for (int i = 3; i<= enesimo; i++) {
				fn = ultimo + penultimo;
				penultimo = ultimo;
				ultimo = fn;
			}
		}
		return fn;
	}
	/**
	 * Utiliza da formula fechada para encontrar o n�mero na posi��o desejada na sequ�ncia
	 * @param enesimo a posi��o do n�mero na sequ�ncia de Fibonacci
	 * @return o en�simo termo requerido
	 */
	static long formulaFechada(int enesimo) {
		double raizCinco = Math.sqrt(5);
		double fn = 1.0/raizCinco*Math.pow((1.0/2.0+raizCinco/2.0), enesimo)-1.0/raizCinco*Math.pow((1.0/2.0-raizCinco/2.0), enesimo);
		return Math.round(fn);
	}
}
