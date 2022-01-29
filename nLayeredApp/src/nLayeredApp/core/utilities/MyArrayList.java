package nLayeredApp.core.utilities;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import nLayeredApp.core.entities.Entity;

public class MyArrayList<T extends Entity> {
	Entity[] temp;
	Entity[] entities;

	public MyArrayList() {
		super();
		entities = new Entity[1];
	}

	public void add(T entity) {
		if (entities[0] == null) {
			entities[0] = entity;
		} else {
			temp = entities;
			entities = new Entity[temp.length + 1];
			for (int i = 0; i < temp.length; i++) {
				entities[i] = temp[i];
			}
			entities[entities.length - 1] = entity;
		}
	}

	public void update(int id, T entity) {
		if (entities[0] != null) {
			for (int i = 0; i < entities.length; i++) {
				if (entities[i].getId() == id) {
					entities[i] = entity;
				}
			}
		} else {
			System.out.println("Dizide güncellenecek eleman yok");
		}

	}

	public void delete(int id) {
		if (entities.length != 1) {
			int k = 0;
			temp = new Entity[entities.length - 1];
			for (int i = 0; i < entities.length; i++) {
				if (entities[i].getId() != id) {
					temp[k] = entities[i];
					k++;
				}
			}
			entities = temp;
		} else {
			entities = new Entity[1];
		}
	}

	public <T> Entity[] arrayAll() {
		if (entities[0] == null) {
			System.out.println("Dizi boþ");
			return null;
		}
		return (Entity[]) entities;
	}

}
