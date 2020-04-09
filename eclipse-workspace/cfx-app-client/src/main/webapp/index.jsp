<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<%  fr.insa.service.Product p = (new fr.insa.client.MyClass()).getResult();  
        fr.insa.client.ProduitSearch p1 = new fr.insa.client.ProduitSearch(); %>
	<div>
		Product Id :<%= p.getProductId()%></div>
	<div>
		Product Name :<%= p.getProductName()%></div>
	<div>Product Cat :<%= p.getProductCatg()%></div>	
	
	<h1>recherche multicritère</h1>
	<form method="post" action="index.jsp">
            <label for="name">Name : </label>
            <input type="text" name="name" id="name" /><br/>
            <label for="cat">Categorie : </label>
            <input type="text" name="cat" id="cat" /><br/>
            
            <input type="submit" />
    </form>
    <h1>Resultat</h1>
    <% 
    String name= request.getParameter("name"); String cat = request.getParameter("cat");    
    if (name!="" || cat!="") {
        out.println(p1.getResult(name,cat));
       } 
    %>
    
</body>
</html>