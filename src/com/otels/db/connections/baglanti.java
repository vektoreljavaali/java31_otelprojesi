package com.otels.db.connections;

public class baglanti {

	// 0- Ba�lant� kapal�
	// 1- Ba�lant� a��k
	private static int durum =0;
	
	public void baglan(String dbadi) {
		try {
			durum=1;
			System.out.println(dbadi+" Veri taban�na ba�lan�ld�");	
		} catch (Exception hata) {
			System.out.println("Bir Hata Olu�tu...");
			System.out.println("L�tfen sistem y�neticinize ba�vurun.");
		}
	
	}

	public static int getDurum() {
		return durum;
	}
	
	
	
}
