package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * ���ﳵ
 * @author hmn111805
 *
 */
public class Cart {
	//��ϵ�����ݿ������
	private int id;
	private BigDecimal total;
	//�û��˺�
	private Account account;
	//��Ʒ��������
	private HashMap<Product,Integer> map=new HashMap<>();
	

	public Cart() {
		
	}
	/**
	 * ���ﳵ�ܽ��
	 * @return
	 */
	public BigDecimal getTolal() {
		Set<Product> keys=map.keySet();
		for(Product p:keys) {
			int n=map.get(p);
		    total = total.add(
		    		p.getPrice().multiply(BigDecimal.valueOf(n)));
		}
		return total;
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public HashMap<Product, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}
	
	
}
