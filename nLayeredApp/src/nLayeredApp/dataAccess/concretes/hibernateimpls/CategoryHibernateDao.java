package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.entities.Entity;

import nLayeredApp.core.utilities.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;

import nLayeredApp.entities.concretes.Category;


public class CategoryHibernateDao implements CategoryDao {

	private MyArrayList<Category> myArrayList;

	public CategoryHibernateDao() {
		super();
		myArrayList = new MyArrayList<Category>();
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile eklendi");
		this.myArrayList.add(category);
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile güncellendi");
		this.myArrayList.update(category.getId(), category);
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile silindi");
		this.myArrayList.delete(category.getId());
	}

	@Override
	public Category[] arrayAll() {
		if (this.myArrayList.arrayAll() != null) {
			Category[] categories = new Category[this.myArrayList.arrayAll().length];
			Entity[] entity = this.myArrayList.arrayAll();
			for (int i = 0; i < categories.length; i++) {
				categories[i] = (Category) entity[i];
			}
			return categories;
		} else {
			return null;
		}
	}

}
