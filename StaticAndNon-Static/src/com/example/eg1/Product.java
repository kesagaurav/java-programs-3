package com.example.eg1;

public class Product {
	
	private int id;
	private String name;
	private double cost;
	private static float discount=0.2f;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.id=100;
		p.name="gaubra";
		p.cost=12.900;
		p.printProduct();

	}
	
	public void printProduct() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("cost:"+cost);
		System.out.println("discount:"+discount);
	}

}
