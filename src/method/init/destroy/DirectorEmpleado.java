package method.init.destroy;

import method.init.destroy.CreacionInformes;

public class DirectorEmpleado implements Empleados {
	
	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Tareas de director empleado";	
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe director empleado:" + informeNuevo.getInforme();
	}
	
	public void init() {		
		System.out.println("init");		
	}
    
	public void destroy() {		
		System.out.println("end");		
	}
}
