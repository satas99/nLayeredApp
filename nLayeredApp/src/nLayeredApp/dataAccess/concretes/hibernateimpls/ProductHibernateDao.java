package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.entities.Entity;
import nLayeredApp.core.utilities.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao {

	private MyArrayList<Product> myArrayList;

	public ProductHibernateDao() {
		super();
		this.myArrayList = new MyArrayList<Product>();
	}

	@Override
	public void add(Product product) {
		System.out.println("Hibernate'e eklendi");
		this.myArrayList.add(product);

	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate'de güncellendi");
		this.myArrayList.update(product.getId(), product);

	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate'den silindi");
		this.myArrayList.delete(product.getId());

	}

	@Override
	public Product[] arrayAll() {
		if (this.myArrayList.arrayAll() != null) {
			Product[] products = new Product[this.myArrayList.arrayAll().length];
			Entity[] entity = this.myArrayList.arrayAll();
			for (int i = 0; i < products.length; i++) {
				products[i] = (Product) entity[i];
			}
			return products;
		} else {
			return null;
		}
	}

}
