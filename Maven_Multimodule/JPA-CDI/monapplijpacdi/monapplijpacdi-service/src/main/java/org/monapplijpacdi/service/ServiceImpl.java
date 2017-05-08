package org.monapplijpacdi.service;

import javax.inject.Inject;
import javax.inject.Named;

import org.monapplijpacdi.dao.IDao;
import org.monapplijpacdi.metier.Client;


@Named
public class ServiceImpl implements IService {

	@Inject
	private IDao dao;

	
	public long addClient(Client c) {
		return dao.addClient(c);
	}

}
