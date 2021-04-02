package com.everis.latam.DALProveedoresFlama.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ResolucionDto {
	
	private int resolucionId;
	private int solicitudId;
	private	int	montoTotal;
	private String	resolucionComentario;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private	Date resolucionFecha;
}
