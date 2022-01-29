package nLayeredApp.business.concretes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;


public class ProductManager implements ProductService{
	
	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	@Override
	public void add(Product product) {
		if (product.getUnitPrice()>0) {
			System.out.println("Ürün eklendi");
			this.productDao.add(product);
		}else {
			System.out.println("Ürün fiyatý 0'dan büyük olmalý");
		}
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Ürün güncellendi ");
		this.productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		System.out.println("Ürün silindi ");
		this.productDao.delete(product);
	}

	@Override
	public Product[] arrayAll() {
		// TODO Auto-generated method stub
		return  (Product[]) this.productDao.arrayAll();
	}
	



}
