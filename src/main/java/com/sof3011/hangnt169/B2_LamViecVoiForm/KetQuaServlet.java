package com.sof3011.hangnt169.B2_LamViecVoiForm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet( value = "/ket-qua1")

public class KetQuaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buoi2/test/test.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // B1: Lay gia tri tu jsp => servlet => getParameter => lay thong qua name
        String username = request.getParameter("a");
        String password = request.getParameter("b");

        // B2: Day gia tri tu servlet => jsp
        request.setAttribute("x1",username);
        request.setAttribute("x2",password);
        // B3: Chuyen trang
        request.getRequestDispatcher("/buoi2/test/result.jsp").forward(request,response);
    }
}
