package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.core.entities.Entity;
import nLayeredApp.core.utilities.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {

	private MyArrayList<Product> myArrayList;

	public ProductJdbcDao() {
		super();
		this.myArrayList = new MyArrayList<Product>();
	}

	@Override
	public void add(Product product) {
		System.out.println("Jdbc'ye eklendi");
		this.myArrayList.add(product);

	}

	@Override
	public void update(Product product) {
		System.out.println("Jdbc'de güncellendi");
		this.myArrayList.update(product.getId(), product);

	}

	@Override
	public void delete(Product product) {
		System.out.println("Jdbc'den silindi");
		this.myArrayList.delete(product.getId());

	}

	@Override
	public <T> Product[] arrayAll() {
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
