package com.basicstruct.gaurav;

public class Link {
	
	public String name;
	public Link next;
	Link()
	{
		
	}
	
	public Link (String namein)
	{
		this.name=namein;
	}
	
	public void display()
	{
		System.out.println("name"+this.name);
	}
	
	

	public static void main(String[] args) {
		
		LinkedList obj = new LinkedList();
		obj.insertFirstLink("gaurav");
		obj.insertFirstLink("neha");
		obj.insertFirstLink("rashmi");
		obj.insertFirstLink("sheetal");
		obj.display();
		obj.removeFirst();
		obj.display();
		obj.addAny();
		obj.display();
		
		

	}

}
