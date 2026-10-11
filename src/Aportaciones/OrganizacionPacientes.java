package Aportaciones;

import java.util.ArrayList;
import java.util.List;

public class OrganizacionPacientes {
	
	// Creación de dos listas. Una para hombres y otra para mujeres. Recorres el array que representa todos los pacientes y vas añadiendo en fucnión de si cumplen la condición

	private List<Pacientes> hombres = new ArrayList<>();
    private List<Pacientes> mujeres = new ArrayList<>();

    public void separarPacientes(Pacientes[] pacientes) {

        // Limpiamos las listas por si el método se ejecuta otra vez
        hombres.clear();
        mujeres.clear();

        // Recorremos el array de pacientes
        for (int i = 0; i < pacientes.length; i++) {
            Pacientes paciente = pacientes[i];
            // Solo incluimos a los pacientes confirmados
            if (paciente != null && paciente.isConfirmado()) {
                if (paciente.getSexo().equalsIgnoreCase("Hombre")) {
                    hombres.add(paciente);
                } else if (paciente.getSexo().equalsIgnoreCase("Mujer")) {
                    mujeres.add(paciente);
                }
            }
        }
    }

    public List<Pacientes> getHombres() {
        return hombres;
    }

    public List<Pacientes> getMujeres() {
        return mujeres;
    }
}