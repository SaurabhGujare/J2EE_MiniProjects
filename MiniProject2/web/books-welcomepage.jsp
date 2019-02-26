<%-- 
    Document   : books-welcomepage
    Created on : Feb 4, 2019, 9:58:23 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Books Welcome page</title>
        <style type="text/css">
    body{
        background: url("https://images.unsplash.com/photo-1526314114033-349ef6f72220?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1096&q=80");		
        background-size: auto;
        background-repeat: no-repeat;
        background-position: center;
        text-align: center;
        color:black;
        font-weight: 600;
        
    }
        #wrapper{
                margin: 10% 30%;
        }
        .submit-btn{
                text-align: center;
        }
        .form-section{
                padding: 1% 1%;
                background-color: rgb(235,235,255,0.5);
        }

</style>
</head>
<body>
    <div id="wrapper">
    <div class="form-section">
    <form action="hw2_part8" method="post">

        <h3>How many books do you want to add? </h3>
        <input type="text" name="bookCount" required><br/><br/>
        <input type="hidden" name="value" value="bookWelcomePage"/>
        <div class="submit-btn">
            <input type="submit" name="Submit">
        </div>

    </form>
</div>
</div>
</body>
</html>
