package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Usuario;


public interface LoginDao extends CrudRepository<Usuario,Integer> {

	List<Usuario>findUsuarioByNomeAndSenha(String nome, String senha);
}
