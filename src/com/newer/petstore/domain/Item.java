package com.newer.petstore.domain;

import java.math.BigDecimal;

/**
 * ������
 * @author hmn111805
 *
 */
public class Item {
	
	//��ˮ��
	private int num;
	
	//��Ʒ
	private Product product;
	//����
	private int quantity;
	//�ܼ�
	private BigDecimal total;
	
	public Item() {
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	
}
