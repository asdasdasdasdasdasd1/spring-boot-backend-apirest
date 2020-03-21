package com.bolsadeideas.springboot.backend.apirest;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.util.ObjectUtils;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

@SpringBootApplication
public class SpringBootBackendApirestApplication {

	public static void main(String[] args) {
		//javaBasic();
		//expFunctionalInterface();
		//expLambdas();
		expLambdasBiFunctions();
	}

	public static void javaBasic() {
		Persona persona = new Persona("Persona - persona", 0);
		Persona persona1 = new Empleado("Persona - empleado",1);
		Empleado empleado = new Empleado("Empleado - empleado",2);
		System.out.println(persona.mostrar());
		System.out.println(persona1.mostrar());
		System.out.println(empleado.mostrar());
	}

	public static void expFunctionalInterface() {
		IPersona iPersona = (name) -> "Hello " + name;
		System.out.println(iPersona.mostrarFI("a"));
		System.out.println(iPersona.mostrarFI());
	}

	public static void expLambdas() {
		Consumer a = (message) -> System.out.println(message + " MUNDO");
		a.accept("HOLA");

		ConsumerI a1 = () -> System.out.println("HELLO WORLD");
		a1.accept();

		Predicate<String> t1 = c -> c.contains("HOLA");
		System.out.println(  t1.test("HOLA MUNDO") );
		System.out.println(  t1.test("CHAU MUNDO") );

		Predicate<Integer> t2 = c -> c == 1;
		System.out.println(  t2.test(1) );
		System.out.println(  t2.test(2) );

		PredicateI t3 = c -> c.contains("HOLA");
		System.out.println(  t3.validate("HOLA MUNDO") );
		System.out.println(  t3.validate("CHAU MUNDO") );
	}

	public static void expLambdasBiFunctions() {
		BiFunctionI<Integer,String> validate = (T,R) -> {
			if(T==1)
				return R.matches("[0-9]{8}");
			if(T==2)
				return R.matches("[0-9]{1,12}");
			if(T==3)
				return R.matches("[0-9]{1,9}");
			return false;
		};

		System.out.println(validate.validateTypeDocument(1,"46994989"));
		System.out.println(validate.validateTypeDocument(2,"46994989"));
		System.out.println(validate.validateTypeDocument(3,"46994989"));
		System.out.println(validate.validateTypeDocument(1,"469949899"));
		System.out.println(validate.validateTypeDocument(2,"1231231231231"));
		System.out.println(validate.validateTypeDocument(3,"1231231231"));
	}
}
