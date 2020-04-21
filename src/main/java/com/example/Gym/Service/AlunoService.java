package com.example.Gym.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Gym.Model.Aluno;
import com.example.Gym.Repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;

	public ResponseEntity<Aluno> criarAluno(Aluno aluno) {
		Aluno criarAluno = alunoRepository.save(aluno);
		return new ResponseEntity<Aluno> (criarAluno,HttpStatus.OK);
	}
	
	public List<Aluno> listarAlunos(){
		return alunoRepository.findAll();
	}

	public Optional<Aluno> listarUmAluno(long alunoId) {
		return alunoRepository.findById(alunoId);
	}

	public ResponseEntity<?> editarAluno(Aluno aluno) {
		Aluno criarAluno = alunoRepository.save(aluno);
		return new ResponseEntity<Aluno> (criarAluno,HttpStatus.OK);
	}

	public void deletarAluno(long alunoId) {
		alunoRepository.deleteById(alunoId);
	}
	

}
