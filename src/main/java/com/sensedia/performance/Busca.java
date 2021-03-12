package com.sensedia.performance;

public interface Busca<K, V extends Buscavel<K, V>> {

	Busca<K, V> adicionar(V valor);

	V buscar(K chave);

}
