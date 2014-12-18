package com.adapter.app;

import com.adapter.impl.Chines;
import com.adapter.model.AlemaoAdapter;
import com.adapter.model.AlemaoNato;
import com.adapter.model.ChinesNato;

public class ProtocoloComunicacao {

	public static void main(String[] args) {
		AlemaoNato alemaoNato = new AlemaoNato();
		ChinesNato chinesNato = new ChinesNato();
		Chines alemaoAdapter = new AlemaoAdapter(alemaoNato);
		
		alemaoNato.falarEmAlemao();
		alemaoNato.escreverEmAlemao();
		
		chinesNato.falarEmChines();
		chinesNato.escreverEmChines();
		
		alemaoAdapter.falarEmChines();
		alemaoAdapter.escreverEmChines();
	}
}