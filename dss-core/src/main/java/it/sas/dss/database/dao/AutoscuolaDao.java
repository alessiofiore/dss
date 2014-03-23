package it.sas.dss.database.dao;

import org.springframework.stereotype.Component;

import it.sas.dss.database.model.Autoscuola;

@Component("autoscuolaDao")
public class AutoscuolaDao extends GenericDao<Autoscuola> implements IAutoscuolaDao {

}
