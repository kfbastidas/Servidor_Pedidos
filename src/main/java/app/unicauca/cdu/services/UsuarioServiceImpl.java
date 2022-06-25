package app.unicauca.cdu.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.unicauca.cdu.models.ImageModel;
import app.unicauca.cdu.models.Usuario;
import app.unicauca.cdu.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private UsuarioRepository servicioAccesoBaseDatos;

	@Override
	public Usuario findById(long id) {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.findAll();
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.save(usuario);
	}

	@Override
	public List<Usuario> saveAll(List<Usuario> usuarios) {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.saveAll(usuarios);
	}

	@Override
	public Usuario edit(long id, Usuario usuario) {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.edit(id, usuario);
	}

	@Override
	public boolean remove(long id) {
		// TODO Auto-generated method stub
		return this.servicioAccesoBaseDatos.remove(id);
	}


}
