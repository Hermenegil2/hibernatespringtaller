package py.edu.facitec.hibernatespringtaller.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.edu.facitec.hibernatespringtaller.dao.ProductoDAO;
import py.edu.facitec.hibernatespringtaller.model.Producto;

@Transactional
@Controller
public class ProductoController {
			@Autowired
			
			private ProductoDAO productodao;
			
			@RequestMapping(value="/productos",method=RequestMethod.POST)
			public String registrar(Producto producto){
				productodao.save(producto);
				return "/clientes/ok";
			}
			
			@RequestMapping("/productos/formulario")
			private String formulario(){
				
				return "/productos/formulario";
			}
}
