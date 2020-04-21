package com.example.Gym.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Gym.Model.Funcionario;
import com.example.Gym.Repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	public ResponseEntity<Funcionario> criarFuncionario(Funcionario funcionario){
		Funcionario criarFuncionario = funcionarioRepository.save(funcionario);
		return new ResponseEntity<Funcionario> (criarFuncionario,HttpStatus.OK);
	}
	
	public List<Funcionario> listarFuncionarios(){
		return funcionarioRepository.findAll();
	}
	
	public void deletarFuncionario(long funcionarioId) {
		funcionarioRepository.deleteById(funcionarioId);
	}
	
	public ResponseEntity<?> editarFuncionario(Funcionario funcionario){
		Funcionario criarFuncionario = funcionarioRepository.save(funcionario);
		return new ResponseEntity<Funcionario> (criarFuncionario,HttpStatus.OK);
	}
	
	
}
