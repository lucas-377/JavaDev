package br.com.mjv.oficina.registros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author B4TMAN
 * 
 * Controller para a requisição da url de registro de defeitos veiculares.
 *
 */

@Controller
public class registrosController {

	@RequestMapping("/registros")
	public String registros() {
		return "registros";
	}
}