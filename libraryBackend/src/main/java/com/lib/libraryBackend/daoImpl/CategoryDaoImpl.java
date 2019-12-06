package com.lib.libraryBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lib.libraryBackend.dao.CategoryDao;
import com.lib.libraryBackend.dto.Category;



@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao
{
	
	
	private static List<Category> categories = new ArrayList<Category>();
 	
	static
	{
	   Category category = new Category();
	   category.setId(1);
	   category.setName("books");
	   category.setDescription("sciience books");
	   category.setImageURL("book.jpg");
	   category.setActive(true);
	   
	   
	   Category category1 = new Category();
	   category1.setId(1);
	   category1.setName("textbook");
	   category1.setDescription("text books");
	   category1.setImageURL("text.jpg");
	   category1.setActive(true);
	   
	   categories.add(category);
	   categories.add(category1);
	   
	}

	@Override
	public List<Category> listAll() {
		// TODO Auto-generated method stub
		return categories;
	}
	
	
	
	
	
	
	

}
