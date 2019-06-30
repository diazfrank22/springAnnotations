package dependency.injection;

import dependency.injection.CreacionInformes;

public class SecretarioEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	private String emailSecretario;
	private String nombreSecretario;
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Tareas de secretario empleado";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe secretario empleado: "+informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getEmailSecretario() {
		return emailSecretario;
	}

	public void setEmailSecretario(String emailSecretario) {
		this.emailSecretario = emailSecretario;
	}

	public String getNombreSecretario() {
		return nombreSecretario;
	}

	public void setNombreSecretario(String nombreSecretario) {
		this.nombreSecretario = nombreSecretario;
	}
}