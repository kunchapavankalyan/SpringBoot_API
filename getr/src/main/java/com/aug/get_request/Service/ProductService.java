package com.aug.get_request.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.aug.get_request.Model.Product;

@Service
public class ProductService 
{
	List<Product> products=new ArrayList<>(Arrays.asList
			(new Product(1,"Iphone",50000.00),
			 new Product(2,"OPPO",21000.00),
			 new Product(3,"VIVO",1000.00))
			);
	public List<Product> getList()
	{
		return products;
	}
	public Product GetID(int id)
	{
		return products.stream()	
				.filter(p -> p.getProfID() ==id)
				.findFirst()
				.orElse(new Product(0,"No result found",0.0));
	}
	public String PutID(Product new_member)
	{
		products.add(new_member);
		return "Added into List";
	}
	public String update(Product update_user)
	{
		int idx=-1;
		for(int i=0;i<products.size();i++)
		{
			if((products.get(i)).getProfID() == update_user.getProfID())
			{
				idx=i;
			}
		}
		products.set(idx, update_user);
		return "Data updated";
	}
	public String Delete(int id)
	{
		int idx=-1;
		for(int i=0;i<products.size();i++)
		{
			if((products.get(i)).getProfID() == id)
			{
				idx=i;
			}
		}
		products.remove(idx);
		return "Data Deleted";
	}
}
