package com.SPQrecu.Cliente;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.datanucleus.SQPrecu.Alumno;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

public class Cliente {
	
	static Client client = ClientBuilder.newClient();
	static WebTarget appTarget = client.target("http://localhost:8080/myapp");
	static WebTarget alumnoTarget = appTarget.path("alumno");
	static  WebTarget registroAlumnoTarget = alumnoTarget.path("registroAlumno");
	static WebTarget cursoTarget = appTarget.path("curso");
	static  WebTarget registroCursoTarget = cursoTarget.path("registroCurso");
	
	public static void main(String[] args) {
		
//		final WebTarget existeUsuarioTarget = usuarioTarget.path("existeUsuario");
		
		registrar();
		
	}
	public static void registrar() {
		
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Nombre del Alumno" );
		String nombre = sc.nextLine();
		
		System.out.println("Correo del Alumno" );
		String correo = sc.nextLine();
		
		Alumno alumno = new Alumno();
		alumno.setNombre(nombre);
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre(nombre);
		
		
		registroAlumnoTarget.request().post(Entity.entity(alumno, MediaType.APPLICATION_JSON));
		
		registroAlumnoTarget.request().post(Entity.entity(alumno1, MediaType.APPLICATION_JSON));
		//sc.close();
		
	}
	

}
