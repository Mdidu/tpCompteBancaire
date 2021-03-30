package persistance.dao;

import java.util.List;

public interface UtilitaireDao<T> {
	void add(T value) ;

	void delete(T value);

	void update(T value);

	T findById(int id);

	List<T> findAll();
}
