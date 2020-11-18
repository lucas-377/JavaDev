package br.com.mjv.oficina.defeitos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de cadastro dos defeitos.
 *
 */

@Controller
public class defeitosController {

	@RequestMapping("/cadastrar-defeitos")
	public String defeitos() {
		return "cadastrar-defeitos";
	}
}