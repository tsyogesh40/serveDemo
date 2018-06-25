/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yogesh-7138
 */
public class SecondServlet extends HttpServlet {
  
    /**
     *
     * @param res
     * @param req
     * @throws IOException
     */
    @Override
    public void service(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
      //cookie retrieving 
      
      Cookie cookies[]= req.getCookies();
        
      HttpSession session= req.getSession();
      String str=session.getAttribute("name").toString();// sesssion fetching 
      
      PrintWriter out= res.getWriter();
      out.println("This is second Servlet");
      out.println(str);
      
      String cook=null;
      for(Cookie c : cookies)
      {
          if(c.getName().equals("cookie1"))
          {
              cook=c.getValue();
          }
      }
      out.println(cook);
  }
       
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
