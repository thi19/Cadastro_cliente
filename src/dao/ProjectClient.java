package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ClientObjects;
public class ProjectClient 
{
public String InsertMessage(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
	return null;
// Previous Post
}

@SuppressWarnings({ "rawtypes", "unchecked" })
public ArrayList GetMessages(Connection connection,HttpServletRequest request,HttpServletResponse response) throws Exception
{
ArrayList messageData = new ArrayList();
try
{
PreparedStatement ps = connection.prepareStatement("SELECT num_control,message FROM Client ORDER BY num_control DESC");
ResultSet rs = ps.executeQuery();
while(rs.next())
{
ClientObjects clientObject = new ClientObjects();
clientObject.setNum_control(rs.getInt("num_control"));
clientObject.setData(rs.getString("data"));
clientObject.setNome(rs.getString("Nome"));
clientObject.setValor(rs.getFloat("valor"));
clientObject.setQuant(rs.getInt("quant"));
clientObject.setCod_cliente(rs.getString("cod_cliente"), null);
messageData.add(clientObject);
}
return messageData;
}
catch(Exception e)
{
throw e;
}
}

public ArrayList<?> GetClient1(Connection connection, HttpServletRequest request,
		HttpServletResponse response) {
	// TODO Auto-generated method stub
	return null;
}

public ArrayList<?> GetClient(Connection connection,
		HttpServletRequest request, HttpServletResponse response) {
	// TODO Auto-generated method stub
	return null;
}
}