package app.unicauca.cdu.services;

import java.util.List;

import app.unicauca.cdu.models.Hamburguesa;

public interface IHamburguesaService {
	
	public List<Hamburguesa> findById(int mesa);
	public Hamburguesa save(Hamburguesa hamburguesa);
}
