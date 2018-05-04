/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap37;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Tender
 */
public class GetParameters extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

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
        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            // get parameters
            String recipeName = request.getParameter("recipeName");
            String chef = request.getParameter("chef");
            String category = request.getParameter("category");
            String[] servings = request.getParameterValues("servings");
            String prepTime = request.getParameter("prep");
            String oven = request.getParameter("oven");
            String foodProcessor = request.getParameter("food-processor");
            String electricMixer = request.getParameter("electric-mixer");
            String spiralizer = request.getParameter("spiralizer");
            String notes = request.getParameter("notes");
            
            // display data
            out.println("<br>Recipe Name: " + recipeName + " by " + chef);
            out.println("<br>Category: " + category);
            out.println("<br>Preperation Time: " + prepTime);
            out.println("<br>Number of Servings: ");            
            if (servings != null)
                for (int i = 0; i < servings.length; i++)
                    out.print(servings[i] + " - ");
            
            out.println("<br>Equipment Needed: ");
            out.println("<br>Oven: " + oven + 
                        "<br>Food Processor: " + foodProcessor +
                        "<br>Electric Mixer: " + electricMixer +
                        "<br>Spiralizer: " + spiralizer);
            out.println("<br>Notes: " + notes);
            out.close();
        }
            
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
