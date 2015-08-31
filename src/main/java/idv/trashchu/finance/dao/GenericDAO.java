package idv.trashchu.finance.dao;

import java.sql.SQLException;

import idv.trashchu.finance.entity.TableEntity;
import idv.trashchu.finance.entity.PrimaryKey;

public interface GenericDAO<T1 extends TableEntity, T2 extends PrimaryKey> {
	
	public void insert(T1 t1) throws SQLException;
	
	public void update(T1 t1) throws SQLException;
	
	public void insertOrUpdate(T1 t1) throws SQLException;
	
	public T1 get(T2 t2) throws SQLException;
}
