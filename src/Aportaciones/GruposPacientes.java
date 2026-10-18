package Aportaciones;

import java.util.ArrayList;
import java.util.List;

public class GruposPacientes {

	private List<Pacientes> tratamiento = new ArrayList<>();
	private List<Pacientes> control = new ArrayList<>();

	// Método para asignar los pacientes a los grupos
	public void asignarPacientes(Pacientes[] pacientes) {

	// Vaciamos las listas antes de realizar la asignación
	tratamiento.clear();
	control.clear();

	// Variable que indica a qué grupo corresponde el paciente
	boolean grupoTratamiento = true;

	// Recorremos todos los pacientes del array
	for (int i = 0; i < pacientes.length; i++) {
		Pacientes paciente = pacientes[i];
	// Comprobamos que el paciente existe y está confirmado
		if (paciente != null && paciente.isConfirmado()) {
			if (grupoTratamiento) {
	// Si es true, añadimos al grupo de tratamiento
				tratamiento.add(paciente);
	// El siguiente paciente irá al grupo de control
				grupoTratamiento = false;
				} else {
	// Si es false, añadimos al grupo de control
				control.add(paciente);
	// El siguiente paciente irá al grupo de tratamiento
				grupoTratamiento = true;
				}
			}
		}
	}

	public List<Pacientes> getTratamiento() {
		return tratamiento;
	}

	public List<Pacientes> getControl() {
		return control;
	}

	public void mostrarGrupos() {

		System.out.println("GRUPO DE TRATAMIENTO:");

		for (Pacientes p : tratamiento) {
			System.out.println(p.getNombre());
		}

		System.out.println("\nGRUPO DE CONTROL:");

		for (Pacientes p : control) {
			System.out.println(p.getNombre());
		}

		System.out.println("\nTotal de participantes: " + (tratamiento.size() + control.size()));

		System.out.println("Grupo de tratamiento: " + tratamiento.size());

		System.out.println("Grupo de control: " + control.size());
    }
}