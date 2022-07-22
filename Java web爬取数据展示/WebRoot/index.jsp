<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="vo.*"%>
<%@ page import="dao.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="UTF-8">
	<title>Bangumi-我看过的动画</title>
	<style>
		h1,h3{text-align:center;}
        .left{float:left;}
        .center{float:left; width:10px; height:10px;}
        .right{float:left;}
        a:link{color:dodgerblue; text-decoration:none;}
        a:visited{color:dodgerblue; text-decoration:none;}
        a:hover{color:pink; text-decoration:underline;}
        a:active{color:dodgerblue; text-decoration:none;}
        li{clear:both; height:106px; border:3px solid deepskyblue; margin-bottom:10px;}
        img{border:3px solid grey;}
        a img:hover{border:3px solid wheat;}
	</style>
</head>
<body>
	<jsp:useBean id="aDao" class="dao.AnimationDao"></jsp:useBean>
	<%
		ArrayList<Animation> animations = aDao.getAllAnimation();
	%>
	<h1>Bangumi-我看过的动画</h1>
    <h3>共<%=animations.size()%>部</h3>
	<ol>
		<%
			for(int i=0; i<animations.size(); i++){
				Animation anime = animations.get(i);
		%>
		<li>
			<div class="left">
                <a href="<%=anime.getHigh_image_url()%>">
                    <img src="<%=anime.getLow_image_path()%>">
                </a>
            </div>
            <div class="center"></div>
            <div class="right">
                <div>id：<%=anime.getId()%></div>
                <div>
                    <a href="<%=anime.getUrl()%>"><%=anime.getChinese_name()%></a>
                    <small><%=anime.getOriginal_name()%></small>
                </div>
                <div><small>话数：<%=anime.getEpisodes()%>话 / 放送时间：<%=anime.getBroadcast_time().substring(0,10)%></small></div>
                <div><small>制作人员：<%=anime.getPeople()%></small></div>
                <div><small>收藏时间：<%=anime.getStar_time().substring(0,10)%> / 个人评分：<%=anime.getScore()%>分 / 个人标签：<%=anime.getTag()%></small></div>
            </div>
        </li>
        <%
			}
        %>
	</ol>
</body>
</html>