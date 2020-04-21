package com.example.Gym.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Gym.Model.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository <Aluno, Long> {

}
