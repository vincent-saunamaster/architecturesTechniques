package com.huios.service;

import com.huios.dao.Dao;
import com.huios.dao.IDao;
import com.huios.metier.Client;

public class ServiceImpl implements IService {

	private IDao dao = new Dao();

	@Override
	public long addClient(Client c) {
		return dao.addClient(c);
	}


}
