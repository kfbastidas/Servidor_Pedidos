package app.unicauca.cdu.repositories;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import app.unicauca.cdu.models.ImageModel;
import app.unicauca.cdu.models.Usuario;

@Service
public class UsuarioRepository {

    private HashMap<Long, Usuario> usuarios;
    
    public UsuarioRepository() {
        this.usuarios = new HashMap<Long, Usuario>();
        this.cargarUsuarios();
    }
    
    private void cargarUsuarios() {
    	this.usuarios.put(1059362874L, new Usuario("Facultad de Artes", "Artes Plásticas", 100916010573L, 1059362874L, "JHAN CARLOS", "ACOSTA CHILITO", "jcchilito",null));
    }

    public List<Usuario> findAll(){
    	List<Usuario> v_usuarios = new ArrayList<Usuario>();
    	for (Map.Entry<Long, Usuario> entry : this.usuarios.entrySet()) {
			v_usuarios.add(entry.getValue());	
		}
    	//System.out.println("Invocando findAll usuarios");
    	return v_usuarios;
    }
    
    public Usuario findById(long id) {
        //System.out.println("Invocando findById");
        Usuario v_usuario = this.usuarios.get(id);
        if (v_usuario == null) {
            v_usuario = new Usuario();
        }
        return v_usuario;
    }
    
    public Usuario save(Usuario usuario) {
        if(this.usuarios.get(usuario.getIdentificacion())==null) {
        	this.usuarios.put(usuario.getIdentificacion(), usuario);
        	return usuario;
        }else {
        	return new Usuario("", "", -1L, -1L, "", "", "",null);
        }
    }
    
    public Usuario edit(long id,Usuario usuario) {
        if(this.usuarios.get(id)!=null) {
        	this.usuarios.remove(id);
        	this.usuarios.put(usuario.getIdentificacion(), usuario);
        	return usuario;
        }else {
        	return new Usuario("", "", -1L, -1L, "", "", "",null);
        }
    }
    
    public List<Usuario> saveAll(List<Usuario> listaUsuarios){
    	for (Usuario usuario : listaUsuarios) {
			this.usuarios.put(usuario.getIdentificacion(), usuario);
		}
    	return listaUsuarios;
    }
    
    public boolean remove(long id) {
    	return this.usuarios.remove(id)!=null;
    }

}
