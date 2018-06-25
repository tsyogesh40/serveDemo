/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author yogesh-7138
 */
@WebServlet(urlPatterns = {"/Add"})
public class Add extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        out.println("This is Post method...");
        processRequest(req,res);
        
    }

    public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
    {
        
        PrintWriter out=res.getWriter();
        out.println("This is get method...");
        processRequest(req,res);

    }
    
    public void processRequest(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        try{
           HttpSession session=req.getSession();
           String cookie="cookie 1";
            Cookie c=new Cookie("cookie",cookie);
           
           String str="Session value";
           session.setAttribute("name",str);
         int i=Integer.parseInt(req.getParameter("no1"));
         int j=Integer.parseInt(req.getParameter("no2"));
         int k=i+j;
        
        PrintWriter out= res.getWriter();
        out.println(k);
        }
        catch(IOException | NumberFormatException e)
        {
           // PrintWriter out= res.getWriter();       
            //out.println("<script>alert('invalid Inputs');</script>");
            res.sendRedirect("FirstServlet");
        }
        
    }
    
}
