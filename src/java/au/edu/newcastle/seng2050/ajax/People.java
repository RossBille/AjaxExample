package au.edu.newcastle.seng2050.ajax;

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
public class People extends HttpServlet
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

				//check if user has queried for an exact object
				String id = request.getParameter("id");
				String result = "";
				if (id == null)
				{
						result += "[";
						for (int i = 0;i < Repo.people.size() - 1; i++)
						{
								result += print(contentType, repo.people.get(i));
								result += ",";
						}
						result += print(contentType, repo.people.get(repo.people.size()-1));
						result += "]";
				}else{
						result += print(contentType, repo.people.get(Integer.parseInt(id)));
				}
				PrintWriter out = response.getWriter();
				out.print(result);
		}
		private String print(String contentType, Person a)
		{
				if(contentType.equalsIgnoreCase("text/json"))
				{
						return a.toJson();
				}else{
						return a.toXml();
				}
		}
}
