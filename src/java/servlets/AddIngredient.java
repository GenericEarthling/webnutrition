/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
public class AddIngredient extends HttpServlet {

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
//        processRequest(request, response);

        response.setContentType("text/html");
        try (PrintWriter out = response.getWriter()) {
            // get parameters
            String ingredientName = request.getParameter("ingredientName");
            double servingSizeInGrams = Double.valueOf(request.getParameter("servingSizeInGrams"));
            double calories = Double.valueOf(request.getParameter("calories"));
            double fat = Double.valueOf(request.getParameter("fat"));
            double cholesterol = Double.valueOf(request.getParameter("cholesterol"));
            double sodium = Double.valueOf(request.getParameter("sodium"));
            double potassium = Double.valueOf(request.getParameter("potassium"));
            double carbohydrates = Double.valueOf(request.getParameter("carbohydrates"));
            double fiber = Double.valueOf(request.getParameter("fiber"));
            double protein = Double.valueOf(request.getParameter("protein"));
            String measureType = request.getParameter("measurementType");
            double measurementAmt = Double.valueOf(request.getParameter("measurementAmount"));
            
            // Store data in database
            // calculate values for current recipe

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
