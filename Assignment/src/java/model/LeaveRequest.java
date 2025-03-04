/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package model;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 *
 * @author Admin
 */
@WebServlet(name="LeaveRequest", urlPatterns={"/LeaveRequest"})
public class LeaveRequest extends HttpServlet {
   private String title;
    private Date fromDate;
    private Date toDate;
    private String reason;
    private String createdBy;
    private String status; // "Inprogress", "Approved", "Rejected"
    private String processedBy;

    public LeaveRequest(String title, Date fromDate, Date toDate, String reason, String createdBy) {
        this.title = title;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.reason = reason;
        this.createdBy = createdBy;
        this.status = "Inprogress";
    }

    public String getTitle() { return title; }
    public Date getFromDate() { return fromDate; }
    public Date getToDate() { return toDate; }
    public String getReason() { return reason; }
    public String getCreatedBy() { return createdBy; }
    public String getStatus() { return status; }
    public String getProcessedBy() { return processedBy; }
    public void setStatus(String status) { this.status = status; }
    public void setProcessedBy(String processedBy) { this.processedBy = processedBy; }
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
