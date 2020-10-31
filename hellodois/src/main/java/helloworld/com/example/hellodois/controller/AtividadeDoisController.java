package helloworld.com.example.hellodois.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hellodois")
public class AtividadeDoisController {
	@GetMapping
	public String atvdois() {
		return "Orientação ao Futuro e Atenção aos detalhes";
		
	}
}
