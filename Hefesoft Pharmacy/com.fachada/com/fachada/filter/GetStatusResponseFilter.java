package com.fachada.filter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

class GetStatusWrapper extends HttpServletResponseWrapper {

    private int status;

    GetStatusWrapper(HttpServletResponse response) {
        super(response);
    }

    @Override
    public void setStatus(int sc) {
        super.setStatus(sc);
        if(sc == 404)
        {
        	int a = sc;
        	sc = 202;
        }
        
        if(sc == 202)
        {
        	int a = sc;
        }
        
        status = sc;
    }

    public int getStatus() {
        return status;
    }
}
