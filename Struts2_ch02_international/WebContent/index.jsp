<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:i18n name="international">
	<a href="languagecheck.action?request_locale=zh_CN"><s:text name="Chinese"></s:text></a>    
    <a href="languagecheck.action?request_locale=en_US"><s:text name="English"></s:text></a>
    <s:form action="user/login.action" method="post">
    <table>
    <tr>
	    <td><s:textfield name="account" label="%{getText('Account')}"/></td>  
        <td><s:password name="password" label="%{getText('Password')}"/><td>
        <td><s:submit value="%{getText('Login')}"></s:submit></td>  
     </tr> 
    </table>
    </s:form>
	</s:i18n>
</body>
</html>