package py.edu.facitec.hibernatespringtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.edu.facitec.hibernatespringtaller.dao.ClienteDao;
import py.edu.facitec.hibernatespringtaller.model.Cliente;

@Transactional
@Controller
public class ClienteController {

	
			@Autowired // Para indicar los puntos de inyeccion dentro de una clase
			private ClienteDao clienteDao;
			@RequestMapping(value="/clientes",method=RequestMethod.POST)
			public String registrar(Cliente cliente){
				System.out.println("Registrando el clientes "+cliente);
				clienteDao.save(cliente);
				
				//pagina a retornar
				return "/clientes/ok";
			}
			
			@RequestMapping("/clientes/formulario")
			public String formulario(){
				        //carpeta  //pagina
				return "/clientes/formulario";
			}
}
