package Zadatak2;

import java.util.Scanner;

public class Menjacnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner unos = new Scanner(System.in);
    System.out.println("Unesite iznos dinara:");
    Model menjac = new Model();
    menjac.a=unos.nextInt();
    
    menjac.konvertorKupovnog();
    menjac.konvertorSrednjeg();
    menjac.konvertorProdajnog();
    menjac.ispisKursa();
		
		
		
	}

}
