package com.example.Gym.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gym.Model.Aluno;
import com.example.Gym.Service.AlunoService;


@RestController
@RequestMapping("/aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("/new")
	public ResponseEntity<Aluno> criarAluno(@RequestBody Aluno aluno){
		return alunoService.criarAluno(aluno);
	}
	
	@GetMapping
	public List<Aluno> listarAlunos(){
		return alunoService.listarAlunos();
	}
	
	@GetMapping("/{alunoId}")
	public Optional<Aluno> listarUmAluno(@PathVariable long alunoId){
		return alunoService.listarUmAluno(alunoId);
	}
	
	@PutMapping
	public void editarAluno(@RequestBody Aluno aluno) {
		alunoService.editarAluno(aluno);
	} 
	
	@DeleteMapping(value = "/{alunoId}")
	public void deletarAluno(@PathVariable long alunoId) {
		alunoService.deletarAluno(alunoId);
	}
}
