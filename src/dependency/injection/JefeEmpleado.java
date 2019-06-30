package dependency.injection;

import dependency.injection.CreacionInformes;

public class JefeEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	public String getTareas() {
		return "Tareas de jefe empleado";	
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe jefe empleado: "+informeNuevo.getInforme();
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	

}
