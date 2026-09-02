package ifrn.pi.eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ifrn.pi.eventos.models.Evento;
import ifrn.pi.eventos.repositories.EventoRepository;

@Controller
@RequestMapping("/eventos")
public class EventosController {

	@Autowired
	private EventoRepository er;

	@GetMapping("/form")
	public String form() {
		return "eventos/formEvento";
	}

	@PostMapping
	public String adicionar(Evento evento) {
		er.save(evento);
		return "eventos/evento-adicionado";
	}
}
