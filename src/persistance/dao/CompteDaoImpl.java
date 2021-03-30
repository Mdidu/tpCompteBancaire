package persistance.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import persistance.entities.Compte;
import persistance.entities.HibernateUtil;

public class CompteDaoImpl implements UtilitaireDao<Compte> {

	@Override
	public void add(Compte value) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			session.save(value);
			tx.commit();
		} 
	}

	@Override
	public void delete(Compte value) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			session.delete(value);
			tx.commit();
		} 
	}

	@Override
	public void update(Compte value) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction tx = session.beginTransaction();
			
			session.update(value);
			tx.commit();
		} 
	}

	@Override
	public Compte findById(int id) {
		Compte compte = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			compte = session.get(Compte.class, id);
			
		} 
		return compte;
	}

	@Override
	public List<Compte> findAll() {
		List<Compte> listComptes = new ArrayList<Compte>();
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			listComptes = session.createQuery("from Compte").list();
		} 
		return listComptes;
	}
	
}
