package model;

import java.sql.Connection;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProjectClient;
import dto.ClientObjects;

@SuppressWarnings("unused")
public class ProjectManager {
public String InsertMessage(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
	return null;
//Previous Post
}

public ArrayList<?> GetClient(Connection connection, HttpServletRequest request,
HttpServletResponse response) throws Exception {
ArrayList<?> client = null;
try {
// Here you can validate before connecting DAO class, eg. User session condition 
ProjectClient project= new ProjectClient();
client =project.GetClient(connection, request, response);
} 
catch (Exception e) {
throw e;
}
return client;
}
}