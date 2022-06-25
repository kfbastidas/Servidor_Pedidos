package app.unicauca.cdu.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.unicauca.cdu.models.Hamburguesa;
import app.unicauca.cdu.repositories.HamburguesaRepository;

@Service
public class HamburguesaServiceImpl implements IHamburguesaService{
	
	@Autowired
	private HamburguesaRepository servicioAccesoBaseDatos;
	
	@Override
	public List<Hamburguesa> findById(int mesa) {
		return this.servicioAccesoBaseDatos.findById(mesa);
	}

	@Override
	public Hamburguesa save(Hamburguesa hamburguesa) {
		return this.servicioAccesoBaseDatos.save(hamburguesa);
	}

}
