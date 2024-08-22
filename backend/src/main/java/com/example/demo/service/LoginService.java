package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.LoginDao;
import com.example.demo.modelo.Usuario;


@Component
public class LoginService {

	@Autowired
	private LoginDao loginDao;
	
	public List<Usuario> getAllUsuarioByNomeAndSenha(Usuario user){
		return (List<Usuario>) loginDao.findUsuarioByNomeAndSenha(user.getNome(), user.getSenha());
	}
}
