<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HttpServletRequest test file</title>
</head>
<body>
    
    <h1>HttpServletRequest의 method들 정리</h1>
    
    			<h2>http://localhost:8080/ch2/request/sample1?value</h2>

                <h2>getScheme()</h2>
                <h3><span>scheme : ${scheme}</span></h3>
                
                <h2>getMethod()</h2>
                <h3><span>method : ${method}</span></h3>
                
                <h2>getServerName()</h2>
                <h3><span>serverName : ${serverName}</span></h3>
                
                <h2>getServerPort()</h2>
                <h3><span>serverPort : ${serverPort}</span></h3>
                
                <h2>getContextPath()</h2>
                <h3><span>contextPath : ${contextPath}</span></h3>
                
                <h2>getServletPath()</h2>
                <h3><span>servletPath : ${servletPath}</span></h3>
                
                <h2>getServletURI()</h2>
                <h3><span>requestURI : ${requestURI}</span></h3>
                
                <h2>getServletURL()</h2>
                <h3><span>requestURL : ${requestURL}</span></h3>
                
                <h2>getQueryString()</h2>
                <h3><span>queryString : ${queryString}</span></h3>

</body>
</html>