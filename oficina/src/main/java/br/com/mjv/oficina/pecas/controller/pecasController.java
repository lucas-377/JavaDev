package br.com.mjv.oficina.pecas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de cadastro das peças.
 *
 */

@Controller
public class pecasController {

	@RequestMapping("/cadastrar-pecas")
	public String pecas() {
		return "cadastrar-pecas";
	}
}