package py.edu.facitec.hibernatespringtaller.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.hibernatespringtaller.controller.HomeController;
import py.edu.facitec.hibernatespringtaller.controller.UtilidadController;
import py.edu.facitec.hibernatespringtaller.dao.ClienteDao;
import py.edu.facitec.hibernatespringtaller.dao.ProductoDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,ClienteDao.class,ProductoDAO.class}) 
			public class AppWebConfiguration extends WebMvcConfigurerAdapter { 
			@Bean
			public InternalResourceViewResolver internalResourceViewResolver() { 
				InternalResourceViewResolver resolver =new InternalResourceViewResolver(); 
				resolver.setPrefix("/WEB-INF/views/"); 
				resolver.setSuffix(".jsp");
				
				
				return resolver; }
			
			// Habilitar requisiciones para recursos estaticos.  CSS Y JAVASCRIPT ETC
			@Override
			public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
			configurer.enable();
			}
}