package au.edu.newcastle.seng2050.ajax;

import au.edu.newcastle.seng2050.ajax.example.objects.House;
import au.edu.newcastle.seng2050.ajax.example.objects.Person;
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
public class Houses extends HttpServlet
{
		private static Repo repo = new Repo();
		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException
		{
				//query the request object for the content type that the browser wants
				String contentType = request.getContentType();
				//default to json if no content type is set
				if(contentType == null)
				{
						contentType = "text/json";
				}
				System.out.println(contentType);
				//set response to match
				response.setContentType(contentType);

				String result = "";
				result += print(contentType, repo.h);
				PrintWriter out = response.getWriter();
				out.print(result);
		}
		private String print(String contentType, House h)
		{
				if(contentType.equalsIgnoreCase("text/json"))
				{
						return h.toJson();
				}else{
						return h.toXml();
				}
		}
}
