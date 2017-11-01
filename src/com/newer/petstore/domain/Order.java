package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.tomcat.jni.Address;

/**
 * ����
 * @author hmn111805
 *
 */
public class Order {
	//���
	private int id;
	//ʱ��
	private Date time;
	//�˺�
	private Account account;
	//�ͻ���ַ�����Ϊ�գ�ʹ���˺ŵ�Ĭ�ϵ�ַ��
	private Address address;
	//������
	private List<Item> items=new ArrayList<>();
	//�ܼ�
	private BigDecimal total;
	public Order() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
}
