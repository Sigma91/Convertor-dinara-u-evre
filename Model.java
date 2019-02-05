package Zadatak2;

public class Model {

	int a;
	double kupovniKurs,srednjiKurs,prodajniKurs;
	double kupovni = 118.03;
	double srednji = 118.39;
	double prodajni = 118.74;
	
 public void konvertorKupovnog() {
	 kupovniKurs = a / kupovni;

 }
 
 public void konvertorSrednjeg() {
	 srednjiKurs = a / srednji;
 }
	
 public void konvertorProdajnog() {
	 prodajniKurs = a / prodajni;
 }
	
public void ispisKursa() {
	System.out.println("Kupovni iznos evra je: "+ kupovniKurs);
	System.out.println("Srednji iznos evra je: " + srednjiKurs);
	System.out.println("Prodajni iznos evra je: " + prodajniKurs);
}
	
	
	
	
	
}
