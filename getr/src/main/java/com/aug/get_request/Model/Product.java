package com.aug.get_request.Model;
import org.springframework.stereotype.Component;

@Component
public class Product 
{
	private int profID;
	private String prodNAME;
	private Double prodAMOUNT;
	public Product() 
	{
		super();
	}

	

	public Product(int profID, String prodNAME, Double prodAMOUNT) 
	{
		super();
		this.profID = profID;
		this.prodNAME = prodNAME;
		this.prodAMOUNT = prodAMOUNT;
	}
	
	public int getProfID() 
	{
		return profID;
	}
	public void setProfID(int profID) 
	{
		this.profID = profID;
	}
	
	public String getProdNAME() 
	{
		return prodNAME;
	}
	public void setProdNAME(String prodNAME) 
	{
		this.prodNAME = prodNAME;
	}
	public Double getProdAMOUNT() 
	{
		return prodAMOUNT;
	}
	public void setProdAMOUNT(Double prodAMOUNT) 
	{
		this.prodAMOUNT = prodAMOUNT;
	}
	@Override
	public String toString() {
		return "Product [profID=" + profID + ", prodNAME=" + prodNAME + ", prodAMOUNT=" + prodAMOUNT + "]";
	}

}
