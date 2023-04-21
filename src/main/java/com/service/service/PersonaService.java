package com.service.service;


import com.service.interfaces.PersonaInterface;
import com.service.modelo.Persona;
import com.service.modeloDAO.PersonaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PersonaService implements PersonaInterface {

	@Autowired
	PersonaDAO dao;
	
	@Override
	public List<Map<String, Object>> listar() {		
		return dao.listar();
	}

	@Override
	public List<Map<String, Object>> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Persona p) {
		return dao.add(p);
	}

	@Override
	public int edit(Persona p) {
		// TODO Auto-generated method stub
		return dao.edit(p);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}



}
