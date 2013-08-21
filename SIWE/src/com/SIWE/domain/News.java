package com.SIWE.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderBy;


@Entity
public class News implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4521446009436541132L;
	
	/** ����id */
	@Id
	@GeneratedValue
    private int id;
    /** �������ŵı���*/
	
	@Column(length = 200)
    private String title;
	/** �������ŵ�����*/
	
	@Column(length = 7000)
    private String content;
	/** �������ŵķ�������*/
	@Column(length = 20)
    private String releaseDate;
	@Column(length = 20)
	private String newsClass;
/*	*//** ��������*//*
	@ManyToOne
	@JoinColumn(name="user_Id")
    private int userId;
	*//** �����������*//*
	@ManyToOne
	@JoinColumn(name="newsType_Id")
    private int newsTypeId;*/
	
	
	@ManyToOne
	@JoinColumn(name="newsType_Id")
	private NewsType newsType;
	
	
	@ManyToOne
	@JoinColumn(name="user_Id")
	private User user;
	/** Ĭ�ϵĹ��캯�� */
    public News() {
    }
    /** �趨id���������
     */
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
	//�趨�����ŵ�����
	public void setContent(String content) {
		this.content = content;
	}
	//��ȡ�����ŵ�����
	public String getContent() {
		return content;
	}
	//�趨�����ŵı���
	public void setTitle(String title) {
		this.title = title;
	}
	//��ȡ�����ŵı���
	public String getTitle() {
		return title;
	}
	//�趨�����ŵķ�������
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	//��ȡ�����ŵķ�������
	public String getReleaseDate() {
		return releaseDate;
	}
	//�趨�����ŵ�����
/*	public void setUserId(int userId) {
		this.userId = userId;
	}
	//��ȡ�����ŵ�����
	public int getUserId() {
		return userId;
	}
		
	//�趨�����ŵ����
	public void setNewsTypeId(String newsTypeId) {
		this.newsTypeId = Integer.parseInt(newsTypeId);
	}
	//��ȡ�����ŵ����
	public int getNewsTypeId() {
		return newsTypeId;
	}
	*
	*
	*
	*/
	
	public void setNewsClass(String newsClass){
		this.newsClass = newsClass;
	}
	
	public String getNewsClass(){
		return this.newsClass;
	}
	
	//�趨�����ŵ����
	public void setNewsType(NewsType newsType) {
		this.newsType = newsType;
	}
	//��ȡ�����ŵ����
	public NewsType getNewsType() {
		return newsType;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	//��ȡ�����ŵ����
	public User getUser() {
		return user;
	}
	
	
}
