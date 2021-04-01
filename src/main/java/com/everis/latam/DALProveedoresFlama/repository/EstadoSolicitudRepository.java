package com.everis.latam.DALProveedoresFlama.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.latam.DALProveedoresFlama.entity.EstadoSolicitud;

public interface EstadoSolicitudRepository extends JpaRepository <EstadoSolicitud, Integer> {

	
	@Query(value = "SELECT * FROM estadoSolicitud", nativeQuery = true)
	public List<EstadoSolicitud> ObtenerEstados();
	
	@Query (value = "SELECT * FROM estadoSolicitud WHERE estadoSolicitud_Id=:idBusqueda", nativeQuery = true)
	public EstadoSolicitud BuscarCentroPorNombre(@Param("idBusqueda") int idBusqueda);
}
