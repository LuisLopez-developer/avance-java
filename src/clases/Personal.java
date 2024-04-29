package clases;

import java.sql.Date;

public class Personal {
    private String dni;
    private String ap_paterno;
    private String ap_materno;
    private String nombre;
    private char genero;
    private Date fecha_nacimiento;
    private float sueldo;

    public Personal() {
    }

    public Personal(String dni, String ap_paterno, String ap_materno, String nombre, char genero, Date fecha_nacimiento, float sueldo) {
        this.dni = dni;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.nombre = nombre;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getAp_paterno() {
        return this.ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return this.ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Date getFecha_nacimiento() {
        return this.fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
   
    
    
}
