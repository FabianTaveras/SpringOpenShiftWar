package com.mycompany.springbootopenshift.resources;

//import com.collectionWeb.model.entity.Cliente;
//import com.collectionWeb.pageUtil.PageUtil;
//import com.collectionWeb.services.ClienteImplentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerViews {
//
//
//    @RequestMapping("lista")
//    public String sayHello(){
//        return ("Hello, SpringBoot on Wildfly");
//    }


    @RequestMapping("lista")//, method = RequestMethod.GET)
    public String listaClientes() {
        
//        Pageable pageable = PageRequest.of(page,3);
//        Page<Cliente> clientePage = clienteService.findAll(pageable);
//        PageUtil<Cliente> pageUtil = new PageUtil<>("/lista",clientePage);
//        model.addAttribute("titulo", "Lista Clientes");
//        model.addAttribute("cliente", clientePage/*clienteService.findAll()*/);
//        model.addAttribute("page", pageUtil);
        return ("clientes x2");
    }
}