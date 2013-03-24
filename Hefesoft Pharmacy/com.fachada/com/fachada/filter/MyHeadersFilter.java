package com.fachada.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHeadersFilter implements Filter {

    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException,
            ServletException {

        final HttpServletRequest httpRequest = (HttpServletRequest) request;
        final HttpServletResponse httpResponse = (HttpServletResponse) response;

        final String requestUri = httpRequest.getRequestURI();

        
        if(httpRequest.getMethod().equals("GET") )
        {
        	
        }
        else if(httpRequest.getMethod().equals("OPTIONS") )
        {	
        	httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        	httpResponse.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        	httpResponse.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");        	
        	httpResponse.addHeader("Access-Control-Max-Age", "1728000");
        	//httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        	
        	
        	
        }
        else if(httpRequest.getMethod().equals("POST") )
        {	
        	httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        	httpResponse.addHeader("Access-Control-Allow-Headers", "origin,content-type, accept");
        }
        
        else if(httpRequest.getMethod().equals("PUT") )
        {	  
        	httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        	httpResponse.addHeader("Access-Control-Allow-Headers", "origin,content-type, accept");        	
        }
        
        else if(httpRequest.getMethod().equals("DELETE") )
        {	
        	httpResponse.addHeader("Access-Control-Allow-Origin", "*");
        	httpResponse.addHeader("Access-Control-Allow-Headers", "origin,content-type, accept");
        }
        
        GetStatusWrapper wrapper;
        wrapper = new GetStatusWrapper((HttpServletResponse) response);

       chain.doFilter(request, wrapper);
    }

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
}
