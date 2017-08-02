package br.edu.sistemaacademico.dao;

import java.util.List;
import java.util.ArrayList;

import br.edu.sistemaacademico.entity.Aluno;

public class AlunoDao {

	public AlunoDao() {
		
	}
	
	static List<Aluno> alunos = new ArrayList<Aluno>();
	static Long counter = 0l;
	
	public void salvar(Aluno a)
	{
		a.setId(counter);
		alunos.add(a);
		counter++;
	}
	
	public List<Aluno> listar() {
		return alunos;
	}
}
