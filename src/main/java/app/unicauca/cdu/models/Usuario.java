package app.unicauca.cdu.models;

public class Usuario {
	
	private String facultad;
	private String programa;
    private Long codigo;
    private Long identificacion;
    private String nombres;
    private String apellidos;
    private String usuario;
	private ImageModel image;
	public Usuario() {
		
	}
	

	public Usuario(String facultad, String programa, Long codigo, Long identificacion, String nombres, String apellidos,
			String usuario, ImageModel image) {
		super();
		this.facultad = facultad;
		this.programa = programa;
		this.codigo = codigo;
		this.identificacion = identificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.usuario = usuario;
		this.image = image;
	}

	public ImageModel getImage() {
		return image;
	}

	public void setImage(ImageModel image) {
		this.image = image;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getFacultad() {
		return facultad;
	}

	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Usuario [facultad=" + facultad + ", programa=" + programa + ", codigo=" + codigo + ", identificacion="
				+ identificacion + ", nombres=" + nombres + ", apellidos=" + apellidos + ", usuario=" + usuario + "]";
	}

	public Usuario clone() {
		Usuario user = new Usuario(this.facultad,this.programa,this.codigo,this.identificacion,this.nombres,this.apellidos,this.usuario,null);
		if (this.image!=null) {
			user.setImage(new ImageModel(this.image.getName(), this.image.getType(), this.image.getPicByte().clone()));
		}
		return user;
	}

	
	
}
