package esVettori;

import java.util.*;

public class avvia {
	
	public static void println(Object string) {
		System.out.println(string);
	}

	public static void printf(Object string) {
		System.out.print(string);
	}

	public static void main(String[] args) {

		gestione mio = new gestione();
		Scanner sc = new Scanner(System.in);
		int scelta;
		int lungo = 0;
		int vett[] = null;
		do {
			println("Benvenuto. Seleziona ciò che vuoi fare: ");
			println("0. Uscita dal programma");
			println("1. Genera il vettore");
			println("2. Esegui controllo coppia numeri in vettore");
			println("3. ");
			println("4. ");
			println("5. ");
			println("6. ");
			scelta = sc.nextInt();

			switch (scelta) {

			case 1:
				try {
					do {
						printf("Inserisci la lunghezza del vettore (compreso tra 5 e 20): ");
						lungo = sc.nextInt();
					} while (lungo < 5 || lungo > 20);
				} catch (InputMismatchException e) {
					println("Errore: " + e);
					return;
				}

				vett = mio.generaVett(vett, lungo);
				mio.showVett(vett, lungo);
				println("");
				break;
			case 2:
				mio.showVett(vett, lungo);
				mio.coppiaVett(vett, lungo);
				println("");
				break;
			case 3:
				mio.showVett(vett, lungo);
				println("");
				break;
			case 4:
				mio.showVett(vett, lungo);
				println("");
				break;
			case 5:
				mio.showVett(vett, lungo);
				println("");
				break;
			case 6:
				mio.showVett(vett, lungo);
				println("");
				break;
			}
		} while (scelta != 0);
	}
		
		
	}
