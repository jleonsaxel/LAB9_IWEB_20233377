package pe.edu.pucp.lab9.dto;
import java.sql.Date;
public class PrestamoDto {
    private String usuario;
    private String titulo;
    private Date fechaPrestamo;
    private Date fechaLimite;
}

public String getUsuario() {
    return usuario;
}

public void setUsuario(String usuario) {
    this.usuario = usuario;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo){
    this.titulo = titulo;
}

public Date getFechaPrestamo(){
    return fechaPrestamo;
}

public Date getFechaLimite(){
    return fechaLimite;
}

public void setFechaLimite(Date fechaLimite){
    this.fechaLimite = fechaLimite;
}