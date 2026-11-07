package Aportaciones;

import java.util.ArrayList;

public class RegistroPacientes {
	private ArrayList<PacienteIdentificado> listaPacientes;

    public RegistroPacientes() {
        listaPacientes = new ArrayList<>();
    }

    public void registrarPaciente(PacienteIdentificado paciente) {
        listaPacientes.add(paciente);
    }
    
    public void mostrarPacientes() {
        for (int i = 0; i < listaPacientes.size(); i++) {
            PacienteIdentificado paciente = listaPacientes.get(i);
            System.out.println("Código: " + paciente.getCodigo());
            System.out.println("Nombre: " + paciente.getNombre());
        }
    }
    public PacienteIdentificado buscarPaciente(String codigo) {
        for (PacienteIdentificado paciente : listaPacientes) {
            if (codigo.equals(paciente.getCodigo())) {
                return paciente;
            }
        }
        return null;
    }
}
