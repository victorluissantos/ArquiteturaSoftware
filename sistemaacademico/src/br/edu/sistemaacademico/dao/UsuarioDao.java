package br.edu.sistemaacademico.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.sistemaacademico.entity.Usuario;
import br.edu.sistemaacademico.padrao.ISistemaacademico;

public class UsuarioDao implements ISistemaacademico<Usuario>{

	private List<Usuario> usuario = new ArrayList<>();
	
	public UsuarioDao() {
		
	}
	
	@Override
	public void salvar(Usuario usuario) {
		this.usuario.add(usuario);
	}
	
	@Override
	public void excluir(Usuario usuario) {
		for (int i = 0; i < this.usuario.size(); i++) {
			if (this.usuario.get(i) == usuario) {
				this.usuario.remove(i);
			}
		}
	}
	
	@Override
	public void alterar(Usuario t) {
		// TODO Auto-generated method stub
		
	}	
	
	@Override
	public List<Usuario> listar() {
		return usuario;
	}
}