package com.sof3011.hangnt169.B2_LamViecVoiForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
// Ctrl Alt O => Fix import
// Ctrl Alt L => Format code
// Value => Chua duong dan . Bat buoc phai bat dau bang / => K build tomcat
// BE & FE => HTTP Methods
// Co 4 loai HTTP co ban :
// GET => Lay/ Hien thi (READ)
// POST => Add (Them) (CREATE)
// PUT  => UPDATE
// DELETE => DELETE
// J4, J5: CHi lam viec vs 2 loai: Get & Post
// Get: Hien thi, Lay
// Post: Xu ly
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Truyen gia tri servlet sang jsp => setAttribute
        String mess ="SD18314";
        request.setAttribute("a",mess);
        // Chuyen trang
        // C1: Mang gia tri di
        request.getRequestDispatcher("/buoi2/test/form-login.jsp").forward(request,response);
        // C2:
//        response.sendRedirect("/buoi2/test/form-login.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
