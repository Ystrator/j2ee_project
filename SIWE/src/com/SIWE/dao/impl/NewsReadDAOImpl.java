package com.SIWE.dao.impl;

import java.util.ArrayList;
import java.util.List;


import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.SIWE.dao.NewsReadDAO;
import com.SIWE.domain.News;

public class NewsReadDAOImpl extends JpaDaoSupport implements NewsReadDAO {

	String hql = "from News a  order by a.releaseDate desc";

	//�����Ծ�
	public void create(News news) {
		this.getJpaTemplate().persist(news);
	}
	//�޸��Ծ�
    public void update(News news) {
    	this.getJpaTemplate().merge(news);
	}
    //ɾ���Ծ�
    public void delete(News news) {
    	this.getJpaTemplate().remove(this.getJpaTemplate().merge(news));
	}
    //����id��ȡ�Ծ���Ϣ
	public News query(int id) {
		News news = this.getJpaTemplate().find(News.class, id);
    	return news;
	}
    //��ȡ�����Ծ����Ϣ
    @SuppressWarnings("unchecked")
	public List<News> queryList() {
    	List<News> list = new ArrayList<News>();
		list = this.getJpaTemplate().find(hql);
		return list;
	}




}
