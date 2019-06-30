package dependency.injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext objContext = new ClassPathXmlApplicationContext("dependencyInjection.xml");

		Empleados objEmpleados = objContext.getBean("directorEmpleado", Empleados.class);
		
		System.out.println(objEmpleados.getTareas());
		System.out.println(objEmpleados.getInforme());
		
		Empleados objEmpleados1 = objContext.getBean("jefeEmpleado", Empleados.class);
		
		System.out.println(objEmpleados1.getTareas());
		System.out.println(objEmpleados1.getInforme());
		
		Empleados objEmpleados2 = objContext.getBean("secretarioEmpleado", Empleados.class);
		
		System.out.println(objEmpleados2.getTareas());
		System.out.println(objEmpleados2.getInforme());
		
		
		objContext.close();
		
		ClassPathXmlApplicationContext objContext1 = new ClassPathXmlApplicationContext("dependencyInjection.xml");
        
		SecretarioEmpleado objEmpleados3 = objContext1.getBean("secretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(objEmpleados3.getTareas());
		System.out.println(objEmpleados3.getInforme());
		System.out.println(objEmpleados3.getEmailSecretario());
		System.out.println(objEmpleados3.getNombreSecretario());
		
		objContext1.close();
		
	}
}
