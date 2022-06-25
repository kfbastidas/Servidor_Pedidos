package app.unicauca.cdu.services;

import java.util.List;

import app.unicauca.cdu.models.ImageModel;
import app.unicauca.cdu.models.Usuario;

public interface IUsuarioService {
	
	public Usuario findById(long id);
	public List<Usuario> findAll();
	public Usuario save(Usuario usuario);
	public List<Usuario> saveAll(List<Usuario> usuarios);
	public Usuario edit(long id, Usuario usuario);
	public boolean remove(long id);
	
}
