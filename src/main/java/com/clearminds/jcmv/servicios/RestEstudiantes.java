package com.clearminds.jcmv.servicios;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.clearminds.jcmv.dtos.Estudiante;

@Path("/estudiantes")
public class RestEstudiantes {

	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante estudiante) {
		try {
			System.out.println("Insertar: " + estudiante);
			ServicioEstudiante srvestudiante = new ServicioEstudiante();
			srvestudiante.insertarEstudiante(estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Path("/actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante estudiante) {
		try {
			System.out.println("Actualizando: " + estudiante);
			ServicioEstudiante srvestudiante = new ServicioEstudiante();
			srvestudiante.actualizarEstudiante(estudiante);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
