package com.otels.db.connections;

import java.util.ArrayList;


public interface ICRUD {

	public void kaydet(Object o);
	public void duzenle(Object o);
	public void sil(long id );
	public ArrayList<Object> listele();
	
}
