package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.CategoryService;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Category;
import nLayeredApp.entities.concretes.Product;

public class CategoryManager implements CategoryService {
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}
	@Override
	public void add(Category category) {
			this.categoryDao.add(category);
			System.out.println("Kategori eklendi ");
	}

	public void update(Category category) {
		System.out.println("Kategori güncellendi ");
		this.categoryDao.update(category);
		
	}
	@Override
	public void delete(Category category) {
		this.categoryDao.delete(category);
		System.out.println("Kategori silindi");
		
	}
	@Override
	public Category[] arrayAll() {
		// TODO Auto-generated method stub
		return  (Category[]) this.categoryDao.arrayAll();
	}
	
}
