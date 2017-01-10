<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="pt">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Accões</title>
</head>
<body>
	<div align="center">
		<P>Lista de Açoes</P>
		<table border="1">
			<tr>
				<td>Sessão</td>
				<td>UFCD</td>
				<td>Sumario</td>
				<td>Faltas </td>
				<td>Data</td>
			</tr>
			<c:forEach var="accao" items="${listaAccao}">
				<tr>
					<td>${accao.sessao}</td>
					<td>${accao.ufcd}</td>
					<td>${accao.sumario}</td>
					<td>${accao.faltas}</td>
					<td><fmt:formatDate value="${accao.data}" type="both" pattern="dd/MM/yyyy"/>  
					<td><a href="AccaoServlet?acao=Editar&accao=${accao.faltas}">Editar(TODO)</a></td>
					
				</tr>
			</c:forEach>
		</table>
		<c:if test="${fn:length(listaAccao) > 0}">
   		Total: ${fn:length(listaAccao)} !
 		</c:if><br> 		
	</div>
	<a href="menu.jsp">Voltar</a>
 
</body>
</html>