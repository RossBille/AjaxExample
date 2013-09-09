package au.edu.newcastle.seng2050.ajax;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ross
 */
public class Animals extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        //query the request object for the content type that the browser wants
        String contentType = request.getContentType();
        //set response to match
        response.setContentType(contentType);
        
        //check if user has queried for an exact object
        String id = request.getParameter("id");
        String result = "";
        if(id==null)
        {
            result += print()
        }
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        
    }
    


}
