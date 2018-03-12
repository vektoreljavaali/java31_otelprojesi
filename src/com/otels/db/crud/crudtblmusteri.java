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
			System.out.println("müþteri Kayýt Edildi");	
			}
			else {
				System.out.println("Dikkat! VeriTabaný baðlantýsý açýk deðil");
			}
			
			
		} catch (Exception e) {
			System.out.println("Hata: Müþteri tipinde bir veri gönderiniz.");
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
