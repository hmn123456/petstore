package com.newer.petstore.domain;

import java.io.Serializable;

/**
 * ����ʵ����Ļ��ࣨandroid/SQLite��
 * @author hmn111805
 *
 */

public abstract class BaseEntity implements Serializable{
	/**
	 * ����
	 */
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

}
