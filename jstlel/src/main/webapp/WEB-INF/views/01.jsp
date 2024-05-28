<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>==값 출력==</h4>
	${ival } <br>
	${lval } <br>
	${fval } <br>
	${bval } <br>
	${sval } <br>
	
	<h4>==객체 출력==</h4>
	--${obj }-- <br>
	${userVo.no } <br>
	${userVo.name } <br>
	
	<h4>==Map 출력==</h4>
	${m.ival } <br>
	${m.fval } <br>
	${m.sval } <br>
	
	<h4>==산술연산==</h4>
	${3*4+6/2 } <br>
	${ival + 10 } <br>
	
	<h4>==관계연산==</h4>
	${ival == 10 } <br>
	<!-- <if test='${ival == 10 }'>
		<h4>...</h4>
	</if> -->
	${ival < 5 } <br>
	${ival >= 5 } <br>
	${ival != 5 } <br>
	${empty obj } <br> <!-- ${obj == null } <br> 과 같음 -->
	${not empty obj } <br> <!-- ${obj != null } <br> 과 같음 -->
	
	<h4>==논리연산==</h4>
	${ival == 10 && ival >= 1 } <br>
	${ival == 10 || ival <= 1 } <br>
	
	<h4>==요청 파라미터==</h4>
	--${param.no + 10 }-- <br>
	--${param.name }-- <br>
	
	<h4>Context Path</h4>
	${pageContext.request.contextPath }
	
	
</body>
</html>