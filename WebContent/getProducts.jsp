<%@ page language="java" contentType="application/json" %>

<%@ page import="com.brion.DAO.*" %>
<%
	UsuariosDAO users=new UsuariosDAO();
	out.println(users.result);
%>