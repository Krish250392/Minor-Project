<%@ page import = "java.sql.*"
         import = "java.sql.Connection"
       %>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");

try {
            
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String url = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb, *.accdb)};DBQ=" + "e:\\Users\\admin\\insurance.accdb";
            Connection con = DriverManager.getConnection(url);
	PreparedStatement pst=con.prepareStatement("select * from register where email=? and password=?");
        pst.setString(1, email);
        pst.setString(2, password);
        
ResultSet rs=pst.executeQuery();
       if(rs.next())
        {
            response.sendRedirect("pd.jsp");
        }
       else
                     {
           response.sendRedirect("adminloginerror.jsp");
       }
          } catch(SQLException e)
        {
       System.out.println(e.getMessage());
        }
	catch(ClassNotFoundException e)
        {
       System.out.println(e.getMessage()); 
        }

%>    

       

