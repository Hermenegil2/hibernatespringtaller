package py.edu.facitec.hibernatespringtaller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
			
		@RequestMapping("/")
		public String index(){
			System.out.println("Cargando la Pagina de Bienvenida");
			
			return "hello-world";
		}
}
