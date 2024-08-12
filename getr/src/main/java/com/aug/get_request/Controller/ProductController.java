package com.aug.get_request.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aug.get_request.Model.Product;
import com.aug.get_request.Service.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	public ProductService productservice;
	
	@RequestMapping("/shop")
	public List<Product> shop()
	{
		return productservice.getList();
	}
	@GetMapping("/id/{id}")
	public Product findID(@PathVariable int id)
	{
		//System.out.println(productservice.GetID(id));
		return productservice.GetID(id);
	}
	@PostMapping("/add")
	public String add(@RequestBody Product new_user)
	{
		return productservice.PutID(new_user);
	}
	@PutMapping("/update")
    public String update(@RequestBody Product update_user)
    {
    	return productservice.update(update_user);
    }
	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable int id)
	{
		return productservice.Delete(id);
	}
}
