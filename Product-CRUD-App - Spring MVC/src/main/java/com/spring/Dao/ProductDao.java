package com.spring.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Product;

@Repository
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public ProductDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public int insert(Product pdt) {
		Integer x=(Integer)this.hibernateTemplate.save(pdt);
		return x;
	}
	
	public List<Product> getAll(){
		List<Product> p=this.hibernateTemplate.loadAll(Product.class);
		return p;
	}
	
	@Transactional
	public void delete(int id) {
		Product pdt=this.hibernateTemplate.get(Product.class, id);
		this.hibernateTemplate.delete(pdt);
	}
	
	public Product get(int id) {
		return hibernateTemplate.get(Product.class, id);
	}
	
	@Transactional
	public void update(Product pdt) {
		Product p=hibernateTemplate.get(Product.class, pdt.getId());
		p.setName(pdt.getName());
		p.setDesc(pdt.getDesc());
		p.setPrice(pdt.getPrice());
		System.out.println("Before  : "+p);
		hibernateTemplate.update(p);
		
	}
	
	
}
