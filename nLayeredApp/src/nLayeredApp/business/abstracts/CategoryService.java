package nLayeredApp.business.abstracts;

import nLayeredApp.entities.concretes.Category;


public interface CategoryService {
	public void add(Category category);
	public void update(Category category);
	public void delete(Category category);
	public Category[] arrayAll();
}
