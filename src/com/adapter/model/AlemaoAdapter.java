package com.adapter.model;

import com.adapter.impl.Alemao;
import com.adapter.impl.Chines;

public class AlemaoAdapter implements Chines {

	Alemao alemao;

	public AlemaoAdapter(Alemao alemao) {
		this.alemao = alemao;
	}

	public void falar() {
		alemao.falarEmAlemao();
	}

	public void escrever() {
		alemao.escreverEmAlemao();
	}

	public void falarEmChines() {
		System.out.println("Falar em Chines");
	}

	public void escreverEmChines() {
		System.out.println("Escrever em Chines");
	}
}