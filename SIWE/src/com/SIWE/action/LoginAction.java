package com.SIWE.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.SIWE.domain.News;
import com.SIWE.domain.User;
import com.SIWE.service.LoginService;
import com.SIWE.service.NewsReadService;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2670123065104768193L;
	
	public String execute() throws Exception {
		

		HttpServletRequest req = ServletActionContext.getRequest();
      //��ȡ���е�������Ϣ
		List<News> listNews = getNewsReadService().queryList();
		//�����е�������Ϣ���ݸ�ҳ��
		req.setAttribute("listNews", listNews);
		req.setAttribute("msg", "Hello,World!");

	
		return super.execute();
	}
	

	public String checkin(){
		
		
		
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpServletResponse res = ServletActionContext.getResponse();
		
	    //��ȡ���е�������Ϣ
		List<News> listNews = getNewsReadService().queryList();

		User user_para = getUserbean(req, res);
		User user = getLoginService().LoginCheck(user_para.getUsername());
		//�����е��û���Ϣ���ݸ�ҳ��
		


	
		if(user != null && user_para.getPassword().equals(user.getPassword()))
		{
			try {
				req.getSession().setAttribute("user", user);
				req.getSession().setAttribute("username", user.getUsername());
				req.getSession().setAttribute("password", user.getPassword());
				req.getSession().setAttribute("siwegroup", user.getSiwegroup());
				req.setAttribute("listNews", listNews);
				req.setAttribute("msgtoshow", "��¼�ɹ�");
			} catch (Exception e) {
				req.getSession().setAttribute("user", null);
				req.getSession().setAttribute("username", null);
				req.getSession().setAttribute("password", null);
				req.setAttribute("listNews", listNews);
				req.setAttribute("msgtoshow", "��¼ʧ��");
				e.printStackTrace();
			}
		}
		else
		{
			req.getSession().setAttribute("user", null);
			req.getSession().setAttribute("username", null);
			req.getSession().setAttribute("password", null);
			req.setAttribute("listNews", listNews);
			req.setAttribute("msgtoshow", "��¼ʧ��");
		}
		
		
		return SUCCESS; 
		
	}
	
	public String checkout(){
		
		HttpServletRequest req = ServletActionContext.getRequest();		
	     //��ȡ���е�������Ϣ
		List<News> listNews = getNewsReadService().queryList();
		//�����е�������Ϣ���ݸ�ҳ��
		req.setAttribute("listNews", listNews);
		req.getSession().invalidate();
		req.setAttribute("msgtoshow", "�ǳ��ɹ�");
		return SUCCESS; 
		
	}
	
	

	
	


	//��ȡ�û���¼ҵ���߼�
    public LoginService getLoginService(){ 
    	return loginService; 
    }
    //�趨�û���¼ҵ���߼�
    public void setLoginService(LoginService loginService){ 
    	this.loginService = loginService; 
    }
    private LoginService loginService;
    
    
    //�����Ķ�ҵ���߼�
	public NewsReadService getNewsReadService() {		
		return newsReadService;
	}	
	public void setNewsReadService(NewsReadService newsReadService){
		this.newsReadService = newsReadService;
	}
	private NewsReadService newsReadService;
 
	
	//ҳ����Ϣ����
	@SuppressWarnings("unused")
	private void setMessage(String message) {
		this.message = message;		
	}
	public String getMessage(){
		return message;
	}
	private String message; 

	//������ȡ����
	private User getUserbean(HttpServletRequest req, HttpServletResponse res) {
		User user = new User();		
		try {
			user.setUsername(req.getParameter("username"));
			user.setPassword(req.getParameter("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
