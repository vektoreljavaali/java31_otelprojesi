package com.otels.db.crud;

import java.util.ArrayList;

import com.otels.db.connections.ICRUD;
import com.otels.db.connections.baglanti;
import com.otels.models.tblmusteri;

public class crudtblmusteri implements ICRUD{

	@Override
	public void kaydet(Object o) {
		try {
			tblmusteri musteri = (tblmusteri)o;
			if(baglanti.getDurum()==1) {
			System.out.println("m��teri Kay�t Edildi");	
			}
			else {
				System.out.println("Dikkat! VeriTaban� ba�lant�s� a��k de�il");
			}
			
			
		} catch (Exception e) {
			System.out.println("Hata: M��teri tipinde bir veri g�nderiniz.");
		}
		
		
	}

	@Override
	public void duzenle(Object o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sil(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Object> listele() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
