package br.com.douglas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.douglas.model.Pessoa;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@GetMapping("/nome-completo")
	public Pessoa getNomePessoa() {
		return new Pessoa("Douglas", "Silva");
	}
	
}
