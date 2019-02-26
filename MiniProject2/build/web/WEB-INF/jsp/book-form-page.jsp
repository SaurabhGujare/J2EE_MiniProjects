<%-- 
    Document   : book-form-page
    Created on : Feb 4, 2019, 10:41:53 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Book</title>
        <style type="text/css">
            body{
                background: url("https://images.unsplash.com/photo-1524578271613-d550eacf6090?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80");
                background-size: auto;
                background-repeat: no-repeat;
                background-position: center;
                text-align: center;
                height: 100%;
            }
            form{
                text-align: center;
                margin: 10% 30%;
            }
            #submit-btn{
                margin-top: 5%; 
            }
            div{
                height: 100%;
            }
            
        </style>
    </head>
    <body>
        <div>
        <form action="hw2_part8" method="post">    
        <table border="1">
            <tr>
                <th>ISBN</th>
                <th>Book Title</th>
                <th>Authors</th>
                <th>Price</th>
            </tr>
        <%
            int bookCount = (int)request.getAttribute("bookCount");
            System.out.println(bookCount);
            for(int i=0;i<bookCount;i++){ %>
            <tr>
                <td><input type="text" name="ISBN" required/></td> 
                <td><input type="text" name="Book Title" required/></td> 
                <td><input type="text" name="Authors"/></td> 
                <td><input type="text" name="Price" required/></td>  
            </tr>
        <%    }
            
        %>   
        </table>
<!--        formaction="hw2_part8" formmethod="post"-->
        <input type="hidden" name="value" value="bookFormPage" >
        <input id="submit-btn" type="submit" name=Submit" >
    </form>
        </div>
    </body>
</html>
