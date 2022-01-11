package com.dev.springboot.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Invoice")

public class Invoice 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() 
	{
		return id;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public Double getAmount() 
	{
		return amount;
	}
	public void setAmount(Double amount) 
	{
		this.amount = amount;
	}
	private Long id;
    private String name;
    private String location;
    private Double amount;
}
