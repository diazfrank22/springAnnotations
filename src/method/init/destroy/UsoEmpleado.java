package method.init.destroy;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext objContext = new ClassPathXmlApplicationContext("initDestroy.xml");

		Empleados objEmpleados = objContext.getBean("directorEmpleado", Empleados.class);
		
		System.out.println(objEmpleados.getInforme());
	
		objContext.close();	
	}
}
