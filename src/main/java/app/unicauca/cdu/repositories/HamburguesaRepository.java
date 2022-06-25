package app.unicauca.cdu.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import app.unicauca.cdu.models.Hamburguesa;

@Service
public class HamburguesaRepository {

    private HashMap<Integer, List<Hamburguesa>> pedidos;

    public HamburguesaRepository() {
        this.pedidos = new HashMap();
    }

    public List<Hamburguesa> findById(int mesa) {
        System.out.println("Invocando a listar hamburguesas por mesa ");
        List<Hamburguesa> listAux = new ArrayList<Hamburguesa>();

        if (pedidos.get(mesa) != null) {
            listAux = pedidos.get(mesa);
        }
        return listAux;
    }
    
    public Hamburguesa save(Hamburguesa hamburguesa) {
        System.out.println("Invocando a registrar Hamburguesa ");
        List<Hamburguesa> listHamburguesas = new ArrayList<>();
        Hamburguesa objHamburguesa = null;
        if (pedidos.isEmpty() || pedidos.get(hamburguesa.getMesa()) == null) {
            //Cuando arranca el sistema
            listHamburguesas.add(hamburguesa);
            pedidos.put(hamburguesa.getMesa(), listHamburguesas);
            objHamburguesa = hamburguesa;
        } else if (pedidos.get(hamburguesa.getMesa()) != null) {
            //Cuando ya existen hamburguesas con el numero de mesa y se agrega una nueva hamburguesa
            pedidos.get(hamburguesa.getMesa()).add(hamburguesa);
            objHamburguesa = hamburguesa;
        }

        if (objHamburguesa != null) {
            System.out.println("Nueva hamburguesa registrada");
        }

        return objHamburguesa;
    }

}
