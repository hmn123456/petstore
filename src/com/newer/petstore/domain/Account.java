package com.newer.petstore.domain;

import java.util.LinkedList;
import java.util.List;

/**
 * �˺�
 * @author hmn111805
 *
 */
public class Account {
	//	������Ϣ
	private int id;
	private String name;
	private String password;
	private Address address;
	
	//	���ﳵ
	private Cart cart;
	//����
	private List<Order> orderList=new LinkedList<>();
	
	public Account() {
		
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public List<Order> getOrderList() {
		return orderList;
	}


	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}


	/**
	 * �˺ŵĵ�ַ(�ھ�)
	 * @author hmn111805
	 *
	 */
	public static class Address{
		String province;
		String city;
		String street;
		String name;
		String phone;
		
	}
	
}
