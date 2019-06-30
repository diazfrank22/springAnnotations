package inversion.of.control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext objContext = new ClassPathXmlApplicationContext("inversionOfControl.xml");

		Empleados objEmpleados = objContext.getBean("directorEmpleado", Empleados.class);
		
		System.out.println(objEmpleados.getTareas());
		
		Empleados objEmpleados1 = objContext.getBean("jefeEmpleado", Empleados.class);
		
		System.out.println(objEmpleados1.getTareas());
		
		
		Empleados objEmpleados2 = objContext.getBean("secretarioEmpleado", Empleados.class);
		
		System.out.println(objEmpleados2.getTareas());
		
		
		objContext.close();
		
	}
}
