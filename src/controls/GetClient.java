package controls;

import java.awt.image.DataBuffer;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import dao.Database;
import model.ProjectManager;
import dto.ClientObjects;

@WebServlet("/GetClient")
public class GetClient<Gson> extends HttpServlet {
private static final long serialVersionUID = 1L;

public GetClient() {
super();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
try
{
Database database= new DataBuffer();
ProjectManager projectManager= new ProjectManager();
@SuppressWarnings("rawtypes")
ArrayList clientData = null;
Connection connection = database.Get_Connection();
clientData = projectManager.GetClient(connection, request, response);
Gson gson = new Gson();
String client = gson.toJson(clientData);
out.println("{\"Cliente\":"+client+"}");
}
catch (Exception ex)
{
out.println("Error: " + ex.getMessage());
}
finally
{
out.close();
}
}
}	