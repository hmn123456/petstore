package com.newer.petstore.domain;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Set;

/**
 * ���ﳵ��ǿʵ�塢��ʵ�壩
 * @author hmn111805
 *
 */
public class Cart {
	//û�г־û������㣩
	
	private BigDecimal total;

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
	
	public HashMap<Product, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<Product, Integer> map) {
		this.map = map;
	}
	
	
}
