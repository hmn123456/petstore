package com.newer.petstore.domain;

import java.util.ArrayList;
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
	private List<Address> addressList=new ArrayList<>();
	
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


	public List<Address> getAddressList() {
		return addressList;
	}


	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
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
	 * �˺ŵĵ�ַ(�ھ�) ��װ
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
