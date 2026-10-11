package Aportaciones;

public class Pacientes { // Clase para recoger los datos de cada uno de los pacientes. Lo principal es ver el sexo y si han confirmado

    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    private boolean confirmado;

    public Pacientes(String nombre, String apellido, int edad, String sexo, boolean confirmado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.confirmado = confirmado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean isConfirmado() {
        return confirmado;
    }
}

