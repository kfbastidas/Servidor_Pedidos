package app.unicauca.cdu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.unicauca.cdu.models.Hamburguesa;
import app.unicauca.cdu.services.IHamburguesaService;

@RestController
@RequestMapping("/api")
public class HamburguesaRestController {

    @Autowired
    private IHamburguesaService hambService;

    @GetMapping("/hamburguesas/{id}")
    public List<Hamburguesa> findById(@PathVariable Integer id) {
        List<Hamburguesa> lista = hambService.findById(id);
        if(!lista.isEmpty()){
            System.out.println("Enviando pedido al servidor");
        }
        return lista;
    }

    @PostMapping("/hamburguesas")
    public Hamburguesa create(@RequestBody Hamburguesa hamb) {
        Hamburguesa objHamburguesa = null;
        objHamburguesa = hambService.save(hamb);
        return objHamburguesa;
    }
    
}
