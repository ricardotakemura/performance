package com.sensedia.performance.impl;

import java.util.HashMap;
import java.util.Map;

import com.sensedia.performance.Busca;
import com.sensedia.performance.Buscavel;

public class BuscaPorHashImpl<K,V extends Buscavel<K, V>> implements Busca<K, V> {
	
	private Map<K,V> valores;
	
	public BuscaPorHashImpl() {
		valores = new HashMap<K, V>();
	}

	public Busca<K,V> adicionar(V valor) {
		valores.put(valor.obterChave(), valor);
		return this;
	}

	public V buscar(K chave) {
		return valores.get(chave);
	}

	@Override
	public String toString() {
		return "Busca por hash";
	}

}
