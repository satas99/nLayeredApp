package nLayeredApp;

import nLayeredApp.business.abstracts.CategoryService;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.business.concretes.CategoryManager;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.CategoryHibernateDao;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.entities.concretes.Category;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(0, "Elma", 5);
		Product product1 = new Product(1, "Ayva", 6);
		Product product2 = new Product(2, "Armut", 7);
		Product product3 = new Product(0, "Karpuz", 5);

		ProductService productManager = new ProductManager(new ProductHibernateDao());
		productManager.add(product);
		productManager.add(product1);
		productManager.add(product2);
		productManager.update(product3);

		Product obj[] = productManager.arrayAll();

		for (Product products : obj) {
			System.out.println(products.getName());
		}

		System.out.println("---------------------------------------------------");

		CategoryService categoryManager = new CategoryManager(new CategoryHibernateDao());
		Category category = new Category(1, "Ömer");
		Category category1 = new Category(2, "Serhat");
		Category category2 = new Category(1, "Yunus");

		categoryManager.add(category);
		categoryManager.add(category1);
		categoryManager.update(category2);
		categoryManager.delete(category1);
	

		Category obj1[] = categoryManager.arrayAll();
		if (obj1!= null) {
			for (Category categories : obj1) {

				System.out.println(categories.getName());
			}
		}

	}

}
