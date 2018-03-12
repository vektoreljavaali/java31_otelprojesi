package com.otels.db.entity;

import com.otels.db.connections.baglanti;
import com.otels.db.crud.crudtblmusteri;
import com.otels.models.tblmusteri;

public class runner {

	public static void main(String[] args) {
		
		tblmusteri musteri = new tblmusteri();
		
		musteri.setAd("Muhammet");
		musteri.setSoyad("Hoca");
		musteri.setId(1);
		musteri.setTckimlik("55555555555");
		musteri.setAdres("Ankara");
		
		crudtblmusteri DB = new crudtblmusteri();
		baglanti bg = new baglanti();
		bg.baglan("oracle");
		DB.kaydet(musteri);

	}

}
