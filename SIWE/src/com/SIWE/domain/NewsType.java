package com.SIWE.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class NewsType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5238116003588756956L;

	
	/** ����id */
	@Id
	@GeneratedValue
    private int id;
    /** �������������*/
	
	@Column(length = 32)
    private String name;
	/** Ĭ�ϵĹ��캯�� */
    public NewsType() {
    }
    /** �趨id���������
     */
    public int getId() {
        return this.id ;
    }
    public void setId(String id) {
        this.id = Integer.parseInt(id);
    }
    /** �趨�����������Ƶ��������
     */
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
