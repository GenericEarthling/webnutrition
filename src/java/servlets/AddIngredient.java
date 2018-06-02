/** 
 */
package servlets;

import data.DataManagement;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static data.DataManagement.*;

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
        PrintWriter out = response.getWriter();
        try {
            // get parameters
            String ingredientName = request.getParameter("ingredientName");
            double servingSize = Double.valueOf(request.getParameter("servingSizeInGrams"));
            double calories = Double.valueOf(request.getParameter("calories"));
            double fat = Double.valueOf(request.getParameter("fat"));
            double cholesterol = Double.valueOf(request.getParameter("cholesterol"));
            double sodium = Double.valueOf(request.getParameter("sodium"));
            double potassium = Double.valueOf(request.getParameter("potassium"));
            double carbohydrates = Double.valueOf(request.getParameter("carbohydrates"));
            double fiber = Double.valueOf(request.getParameter("fiber"));
            double protein = Double.valueOf(request.getParameter("protein"));
            String measurementType = request.getParameter("measurementType");
            double ingredientAmt = Double.valueOf(request.getParameter("measurementAmount"));
            
            // TODO: varify data entered for doubles are numbers not letters
            
            // save data to file and session
            DataManagement.saveData(ingredientName, servingSize, calories, fat, cholesterol, sodium, potassium, carbohydrates, fiber, protein, measurementType, ingredientAmt);
            out.println(ingredientName + " " + " is now saved.");            
        }
        catch(Exception ex) {
            out.println("Error in AddIngredient, doGet(): " + ex.getMessage());
        }
        finally {
            out.close(); // Close stream
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
