package esVettori;

import java.util.concurrent.ThreadLocalRandom;

public class gestione {

	public int[] generaVett(int vett[], int lungo) {
		int[] vetto = new int[lungo];
		for (int j = 0; j < lungo; j++) {
			vetto[j] = ThreadLocalRandom.current().nextInt(0, 20);
		}
		return vetto;
	}

	public void showVett(int vett[], int lungo) {
		System.out.println("Ecco il vettore generato: ");
		for (int j = 0; j < lungo; j++) {
			System.out.print(vett[j] + "  ");
		}
		System.out.println(" ");
	}

	/*
	 * public void coppiaVett (int vett[], int lungo) { int [] copiaVett =
	 * vett.clone(); int temp = 0; int conta = 0;
	 * System.out.println("Ecco il vettore copia: "); for (int i = 0; i <
	 * vett.length; i ++) { System.out.print(copiaVett[i] + " "); }
	 * System.out.println(" "); for (int j = 0; j < vett.length; j++) { temp =
	 * copiaVett[j]; if (temp == copiaVett[j + 1]) { conta++;
	 * System.out.println("Coppia di numeri: " + temp); } else if (conta != 2) {
	 * System.out.println("Ci sono 3 numeri in coppia o nessuna coppia"); } temp =
	 * copiaVett[j + 1]; } }
	 */

	/*
	 * public void coppiaVett(int vett[], int lungo) { int[] copiaVett =
	 * vett.clone(); int temp = 0; int conta = 0; boolean flag = false;
	 * System.out.println(" "); for (int k = 0; k < vett.length; k++) { temp =
	 * copiaVett[k]; for (int i = 0; i < vett.length - k; i++) { if (temp ==
	 * copiaVett[k + 1]) { conta++; } } } if (conta == 2) { flag = true; } else if
	 * (conta != 2) { flag = false; } if (flag == true) {
	 * System.out.println("La coppia di numeri comprende: " + temp); } else {
	 * System.out.println("Coppia di 3 numeri o nessuna coppia presente"); } }
	 */

	public void coppiaVett(int vett[], int lungo) {
		int[] copiaVett = new int[lungo];
		int temp;
		int cont = 0;
		for (int i = 0; i < lungo; i++) {
			copiaVett[i] = vett[i];
			for (int j = i + 1; j < lungo; j++) {
				if (copiaVett[i] == vett[j]) {
				cont++;
				}
			}
		}
		if (cont == 1) {
		System.out.println("C'è esattamente una coppia");
		}
	}
	

}
