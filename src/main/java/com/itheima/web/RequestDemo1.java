package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String merthod=req.getMethod();
        System.out.println(merthod);

        String contextPath=req.getContextPath();
        System.out.println(contextPath);

        StringBuffer url=req.getRequestURL();
        System.out.println(url.toString());

        String uri=req.getRequestURI();
        System.out.println(uri);

        String querystring=req.getQueryString();
        System.out.println(querystring);

        String agent=req.getHeader("user-agent");
        System.out.println(agent);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String merthod=req.getMethod();
        System.out.println(merthod);

        String contextPath=req.getContextPath();
        System.out.println(contextPath);

        StringBuffer url=req.getRequestURL();
        System.out.println(url.toString());

        String uri=req.getRequestURI();
        System.out.println(uri);

        String querystring=req.getQueryString();
        System.out.println(querystring);

        String agent=req.getHeader("user-agent");
        System.out.println(agent);

        ServletInputStream ris = req.getInputStream();
        StringBuilder content = new StringBuilder();
        byte[] b = new byte[1024];
        int lens = -1;
        while ((lens = ris.read(b)) > 0) {
            content.append(new String(b, 0, lens));
        }
        String strcont = content.toString();
        System.out.println(strcont);
    }
}
