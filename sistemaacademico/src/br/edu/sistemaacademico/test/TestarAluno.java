package br.edu.sistemaacademico.test;

import java.util.List;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import br.edu.sistemaacademico.dao.AlunoDao;
import br.edu.sistemaacademico.entity.Aluno;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestarAluno {

	@Test
	public void CadastrarAluno() {
		
		Aluno a = new Aluno();	
		a.setId(null);
		a.setNome("Cleverson");
		a.setMatricula("31402");
		
		new AlunoDao().salvar(a);
		
		Assert.assertEquals(true, a.getId() != null);
	}
	
	@Test
	public void listarAluno() {
		
		List<Aluno> alunos = new AlunoDao().listar();
		
		Assert.assertEquals(true, alunos.size() > 0);
	}
}
