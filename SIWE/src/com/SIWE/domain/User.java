package com.SIWE.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2489739224080006740L;

	
	@Id
	@GeneratedValue
    private int id;
	
	
	@Column(length = 20)
    private String username;
	
	@Column(length = 20)
    private String password;
	
	@Column(length = 20)
    private String siwegroup;
	
	@Column(length = 20)
	private String userSex;
	
	@Column(length = 20)
	private String userPhone;
	
	@Column(length = 20)
	private String userOICQ;
	
	@Column(length = 20)
	private String userEmail;	

	@Column(length = 20)
	private String userFrom;
	
	   /** ���캯��*/
    public User(int id, String username, String password, String siwegroup) {
        this.id = id;
    	this.username = username;
        this.password = password;
        this.siwegroup =siwegroup;
    }
    /** Ĭ�ϵĹ��캯�� */
    public User() {
    	
    }
	
    /** �趨id���������
     */
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    /** �趨�û������������
     */
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    /** �趨������������ 
     */
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    /** �趨Ⱥ���������
     */
    public String getSiwegroup() {
        return this.siwegroup;
    }
    public void setSiwegroup(String siwegroup) {
        this.siwegroup = siwegroup;
    }
    
    
    /*
     * 
     * ��ӵ�����
     * 
     * */
    
    public String getUserSex() {
        return this.userSex;
    }
    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }
    
    public String getUserPhone() {
        return this.userPhone;
    }
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    
    public String getUserOICQ() {
        return this.userOICQ;
    }
    
    public void setUserOICQ(String userOICQ) {
        this.userOICQ = userOICQ;
    }
    
    public String getUserEmail() {
        return this.userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String getUserFrom() {
        return this.userFrom;
    }
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

	
}
