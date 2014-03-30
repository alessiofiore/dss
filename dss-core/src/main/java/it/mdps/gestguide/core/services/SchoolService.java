package it.mdps.gestguide.core.services;

import it.mdps.gestguide.core.beans.SchoolBean;
import it.mdps.gestguide.database.dao.DaoFactory;
import it.mdps.gestguide.database.dao.IAutoscuolaDao;
import it.mdps.gestguide.database.model.Autoscuola;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class SchoolService {

	@Autowired
	private DaoFactory daoFactory;
	
	public List<SchoolBean> getSchools() {
		IAutoscuolaDao autoscuolaDao = daoFactory.getAutoscuolaDao();
		List<Autoscuola> schools = autoscuolaDao.findAll();
		
		List<SchoolBean> schoolBeans = new ArrayList<SchoolBean>();
		
		for(Autoscuola a: schools) {
			SchoolBean bean =  new SchoolBean();
			bean.setCap(a.getCap());
			bean.setCitta(a.getCitta());
			bean.setEmail(a.getEmail());
			bean.setFax(a.getFax());
			bean.setIndirizzo(a.getIndirizzo());
			bean.setNome(a.getNome());
			bean.setProvincia(a.getProvincia());
			bean.setTelefono(a.getTelefono());
			schoolBeans.add(bean);
		}
		
		return schoolBeans;
	}
	
}
