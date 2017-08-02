package br.edu.sistemaacademico.padrao;

import java.util.List;

public interface ISistemaacademico<T> {
	
	public void salvar(T t);
	public void excluir(T t);
	public void alterar(T t);	
	public List<T> listar();	
}
