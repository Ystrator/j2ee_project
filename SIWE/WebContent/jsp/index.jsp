<%@ page contentType="text/html; charset=GBK" %>
<%@page import="java.util.*,com.SIWE.domain.*"%>

<jsp:useBean id="user" class="com.SIWE.domain.User" scope="request"/>
<jsp:setProperty name="user" property="*"/>


<%
List<News> listNews = (List) request.getAttribute("listNews");

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>��Ψ</title>
	<link href="/SIWE/jsp/css/css.css" rel="stylesheet" type="text/css" />
	
  </head>
  
  <body>
	    <div id="container">
	  <div id="header">
	    <div id="logo"><h1>��Ψ</h1></div>
	    <div id="search">
	      <form id="form0" name="form0" method="post" action="">
	        ����
	        <input class="inp_srh" type="text" name="textfield" id="textfield" />
	        <input class="btn_srh" type="button" name="button" id="button" value="��ѯ" 
	        		onClick="return search('search')"/>
	      </form>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="nav">
	  	<div id="nav_l"></div>
	    <div id="nav_r"></div>
	    <div class="nav_main">
	      <ul>
	        <li><a href="#"><span>��ҳ</span></a></li>
	        <li><a href="#"><span>��Ʒ����</span></a></li>
	        <li><a href="#"><span>��ϵ����</span></a></li>
	      </ul>
	    </div>
	    <div class="nav_son">
	    	<ul>
	      </ul>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="maincontent">
	    <div id="main">
	      <div id="index_top">
	        <div id="login">

<jsp:include page="login.jsp" />
		
			
				
	        </div>
	        <div id="hot_news">
	          <div id="news_top">
	            <h1>��Ψ��̬</h1>
	            <div id="more_news">
	           		 <p>more</p>
	            </div>
	          </div>
	          <div id="news_list">
	            <ul>
	            <% 
	            for (int i = 0; listNews != null && i<6 && i < listNews.size(); i++) {						
	            %>
	              <li>
	              <span><%=listNews.get(i).getReleaseDate() %></span>
	              <a href="/SIWE/newsReadAction.action?id=<%=listNews.get(i).getId()%>">
	              <%=listNews.get(i).getTitle() %></a></li>
	              <!-- /SIWE/newsReadAction.action?id=1 -->
	              <%} %>
	            </ul>
	          </div>
	        </div>
	      </div>
	      <div id="index_pic">
	        <h2><span></span></h2>
	        <ul>
	        </ul>
	      </div>
	      <div id="index_box">
	        <div class="box">
	          <h2><a class="more" href="#">����..</a><span>һ�ŶӶ�̬</span></h2>
	          <div class="box_con">
	            <dl>
	              <dt><a href="#"></a></dt>
	              <dd><a href="#"><strong>strong</strong></a>
	              ���ԣ�&hellip;</dd>
	            </dl>
	            <ul>
	            	<li><a href="#">��CSS</a></li>
	              <li><a href="#">HTMLԪ��</a></li>
	              <li><a href="#">aaa</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	              <li><a href="#">javascript</a></li>
	              <li><a href="#">IE,ff</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	            </ul>
	          </div>
	        </div>
	        <div class="box box1">
	          <h2><a class="more" href="#">����..</a><span>Ѱ�Ҹ����ҵ��</span></h2>
	          <div class="box_con">
	            <dl>
	              <dt><a href="#"></a></dt>
	              <dd><a href="#"><strong>strong</strong></a>
	              ���ԣ�&hellip;</dd>
	            </dl>
	            <ul>
	            	<li><a href="#">��CSS</a></li>
	              <li><a href="#">HTML</a></li>
	              <li><a href="#">aaaa</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	              <li><a href="#">javascript</a></li>
	              <li><a href="#">bbbb</a></li>
	              <li><a href="#">DIV+CSS</a></li>
	            </ul>
	          </div>
	        </div>
	      </div>
	    </div>
	    <div id="side">
	      <div class="side_box">
	        <h2><strong>�Ŷ�</strong>����</h2>
	        <div class="side_con product">
	          <ul>
	          	<li></li>
	          	<li></li>
	          	<li></li>
	          </ul>
	        </div>
	      </div>
	      <div class="side_box">
	        <h2><strong>����</strong>�ʴ�</h2>
	        <div class="side_con ask">
	          <dl>
	            <dt><a href="#">����</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">����</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">����</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">����</a></dt>
	            <dd></dd>
	          </dl>
	          <dl>
	            <dt><a href="#">����</a></dt>
	            <dd></dd>
	          </dl>
	        </div>
	      </div>
	      <div class="side_box">
	        <h2><strong>��ϵ</strong>����</h2>
	        <div class="side_con contact"><a href="#"><</a></div>
	      </div>
	    </div>
	  </div>
	  <div class="clearfloat"></div>
	  <div id="footer">
	    <dl>
	    <dt><a href="#">��������</a>��||��<a href="#">��ƷĿ¼</a>��||��<a href="#">��ϵ����</a>��||��<a href="#">��������</a>��||��<a href="#">��������</a>��||��<a href="#">������</a></dt>
	      <dd>Copyright &copy;    All Rights Reserved<br />
	        </dd>
	    </dl>
	  </div>
	</div>
  </body>
</html>
