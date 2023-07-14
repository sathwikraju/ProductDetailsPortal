package com.productinfo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Retrieve the product details from the request parameters
        int productId = Integer.parseInt(request.getParameter("productId"));
        String productName = request.getParameter("productName");
        double productPrice = Double.parseDouble(request.getParameter("productPrice"));
        
        // Create a new instance of the Product class and set the retrieved details
        Product product = new Product();
        product.setId(productId);
        product.setName(productName);
        product.setPrice(productPrice);
        
        // Store the product object in the session
        HttpSession session = request.getSession();
        session.setAttribute("product", product);
        
        // Redirect the request to the product details JSP page
        response.sendRedirect("productDetails.jsp");
	}

}
