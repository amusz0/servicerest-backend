package com.service.interfaces;



import com.service.modelo.Persona;

import java.util.List;
import java.util.Map;

public interface PersonaInterface{
	public List<Map<String, Object>>listar();
	public List<Map<String, Object>>listarId(int id);
	public int add(Persona p);
	public int edit(Persona p);
	public int delete(int id);

}
