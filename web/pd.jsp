
<%-- 
    Document   : register
    Created on : 29 Mar, 2014, 5:38:23 PM
    Author     : mundhra
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
 


       <script>
function validateForm()
{
var f=document.forms["myForm"]["frstnm"].value;
l=document.forms["myForm"]["lstnm"].value;
a=document.forms["myForm"]["add"].value;
c=document.forms["myForm"]["ct"].value;
pw=document.forms["myForm"]["pw"].value;
ml=document.forms["myForm"]["mail"].value;
mo=document.forms["myForm"]["mbn"].value;

r=/([a-zA-z])/;
p=/^[0-9]+$/;
n=/^([a-zA-Z0-9-\*\$])+\@([a-zA-Z0-9-\*\$])+\.([a-z]{2,4})$/;

if (f==null || f=="")
  {
  alert("Please enter your first name");
  return false;
  }
  if (l==null || l=="")
  {
  alert("Please enter your last name");
  return false;
  }
  if (a==null || a=="")
  {
  alert("Please enter your full address");
  return false;
  }
  if (c==null || c=="")
  {
  alert("Please enter your city");
  return false;
  }
  if (pw==null || pw=="")
  {
  alert("Please enter your password");
  return false;
  }
  if (ml==null || ml=="")
  {
  alert("Please enter your email");
  return false;
  }
  if (mo==null || mo=="")
  {
  alert("Please enter your mobile no.");
  return false;
  }
  
else if(!f.match(r) || !l.match(r) || !c.match(r))
         {
           alert("Please enter characters only in Name and City");
           return false;
          }
else if(!ml.match(n))
         {
           alert("Please enter your correct email_id");
           return false;
          }
else if(!a.match(r) && !a.match(p))
         {
           alert("Please enter only alphabets and numbers in your address");
           return false;
          }
else if(!mo.match(p))
         {
           alert("Please Enter only no[+91-digit] in mobile no.");
           return false;
          }
          
}
 
</script>
 
        <title>register</title>
    </head>
    

    
    <body bgcolor="#999999">
        <form name="myForm" action="buypolicyck.jsp" onsubmit="return validateForm()" method="post">
    <u><h1 ALIGN="CENTER">Welcome Customer</h1></u>
    <u><h2 align="center">Enter Your Basic Details</h2></u>
        <table border="0" align="center">
           
            <tbody>
            <br>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="frstnm" value="" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lstnm" value="" /></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="add" value="" /></td>
                </tr>
                <tr>
                    <td>City</td>
                    <td><input type="text" name="ct" value="" /></td>
                </tr>
                <tr>
                   
                    <td>Password</td>
                    <td><input type="password" name="pw" value="" /></td>
                    </tr>
                
                <tr>
                    <td>E-mail Id</td>
                    <td><input type="text" name="mail" value="" /></td>
                </tr>
                
                 <tr>
                    <td>Gender</td>
                    <td><select name="gen">
                            <option>Male</option>
                            <option>Female</option>
                        </select></td>
                </tr>
                <tr>
                    <td> Mobile No</td>
                    <td><input type="text" name="mbn" value="" maxlength="10"/></td>
                </tr>
                <tr>
                    <td>POLICY</td>
                    <td><select name="pol">
                            <option>Money Back Plan</option>
                            <option>New Endowment Plan</option>
                            <option>Child Secure Plan</option>
                        </select></td>
                </tr>
                <tr>
                    <td> purchase date (mm/dd/yyyy)</td>
                    <td><input type="text" name="dop" value="" /></td>
                </tr>
                 <tr>
                    <td>LIFE INSURANCE Cover(in Rupees)</td>
                    <td><input type="text" name="cover" id="cover" value="" /></td>
                </tr>
                <tr>    
                <input type="submit" value="submit"  style="position: absolute; left: 700px; top:500px"/></form>
            </tr>
           
            </tbody>
        </table>

    </body>
    
</html>
  