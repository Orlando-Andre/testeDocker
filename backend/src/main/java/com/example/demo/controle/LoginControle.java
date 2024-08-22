package com.example.demo.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.service.LoginService;


@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginControle {

	@Autowired
	private LoginService loginService;
	
	
	//Pesquisar com dois atributos
	@PostMapping(path="/",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuario> pesquisaUsuario(@RequestBody Usuario user){
		return (List<Usuario>) loginService.getAllUsuarioByNomeAndSenha(user);
	}
}
