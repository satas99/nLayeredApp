package nLayeredApp.business.abstracts;

import nLayeredApp.entities.concretes.Product;

public interface ProductService {
	public void add(Product product);
	public void update(Product product);
	public void delete(Product product);
	public Product[] arrayAll();
}
