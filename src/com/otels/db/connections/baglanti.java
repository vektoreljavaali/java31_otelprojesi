package com.otels.db.connections;

public class baglanti {

	// 0- Baðlantý kapalý
	// 1- Baðlantý açýk
	private static int durum =0;
	
	public void baglan(String dbadi) {
		try {
			durum=1;
			System.out.println(dbadi+" Veri tabanýna baðlanýldý");	
		} catch (Exception hata) {
			System.out.println("Bir Hata Oluþtu...");
			System.out.println("Lütfen sistem yöneticinize baþvurun.");
		}
	
	}

	public static int getDurum() {
		return durum;
	}
	
	
	
}
