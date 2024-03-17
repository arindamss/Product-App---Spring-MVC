package com.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Dao.ProductDao;
import com.spring.Entity.Product;

@Service
public class DataBaseAccessClass {
	
	@Autowired
	private ProductDao productDao;

	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	public DataBaseAccessClass(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	public DataBaseAccessClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int insert(Product p) {
		return productDao.insert(p);
	}
	public List<Product> getAll(){
		return productDao.getAll();
	}
	public void delete(int id) {
		productDao.delete(id);
	}
	public Product get(int id) {
		Product pdt=productDao.get(id);
		System.out.println("DataBase : "+pdt);
		return pdt;
	}

	public void update(Product pdt) {
		this.productDao.update(pdt);
		
	}
}
