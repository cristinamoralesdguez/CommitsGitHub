package Aportaciones;

public class PacienteIdentificado extends Pacientes implements GeneradorCodigo {

	private String codigo;

	private static int contador = 1;

	public PacienteIdentificado(String nombre, String apellido, int edad, String sexo, boolean confirmado) {
		super(nombre, apellido, edad, sexo, confirmado);
		this.codigo = generarCodigo();
	}

	@Override
	public String generarCodigo() {
		String codigo = String.format("PAC%03d", contador);
		contador++;
		return codigo;
	}

	public String getCodigo() {
		return codigo;
	}
}

