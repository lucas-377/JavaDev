package br.com.mjv.oficina.veiculo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de cadastro dos veiculos.
 *
 */

@Controller
public class veiculoController {

	@RequestMapping("/cadastrar-veiculo")
	public String veiculo() {
		return "cadastrar-veiculo";
	}
}