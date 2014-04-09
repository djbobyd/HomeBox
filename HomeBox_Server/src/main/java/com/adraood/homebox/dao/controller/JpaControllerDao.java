package com.adraood.homebox.dao.controller;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.adraood.homebox.dao.JpaDao;
import com.adraood.homebox.entity.Controller;

import org.springframework.transaction.annotation.Transactional;


/**
 * JPA Implementation of a {@link NewsEntryDao}.
 * 
 * @author Philip W. Sorst <philip@sorst.net>
 */
public class JpaControllerDao extends JpaDao<Controller, Long> implements ControllerDao {

	public JpaControllerDao() {

		super(Controller.class);
	}


	@Override
	@Transactional(readOnly = true)
	public List<Controller> findAll() {

		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<Controller> criteriaQuery = builder.createQuery(Controller.class);

		Root<Controller> root = criteriaQuery.from(Controller.class);
		criteriaQuery.orderBy(builder.desc(root.get("name")));

		TypedQuery<Controller> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		return typedQuery.getResultList();
	}

}
