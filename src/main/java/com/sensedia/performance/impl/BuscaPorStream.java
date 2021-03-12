package com.sensedia.performance.impl;

import java.util.ArrayList;
import java.util.List;

import com.sensedia.performance.Busca;
import com.sensedia.performance.Buscavel;

public class BuscaPorStream<K,V extends Buscavel<K, V>> implements Busca<K, V> {
	
	private List<V> valores;
	
	public BuscaPorStream() {
		valores = new ArrayList<V>();
	}

	public Busca<K,V> adicionar(V valor) {
		valores.add(valor);
		return this;
	}

	public V buscar(K chave) {
		return valores.stream().filter((item) -> {
			return chave.equals(item.obterChave());
		}).findFirst().orElseThrow();
	}

	@Override
	public String toString() {
		return "Busca por stream";
	}

}
