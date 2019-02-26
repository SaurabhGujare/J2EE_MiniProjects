<%-- 
    Document   : add-new-movie
    Created on : Feb 4, 2019, 12:06:01 AM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Movie</title>
        <style type="text/css">
            body{
                
                background: url("https://www.insidedxb.com/wp-content/uploads/2015/05/Movies-to-watch-this-week-may-2.jpg");		
                background-size: cover;
                background-repeat: no-repeat;
                background-position: center;
                
            }
            #wrapper{
                margin: 10% 30%;
                
            }
            
            .form-section{
                    padding: 1% 1%;
                    background-color: rgba(235,235,255,0.8);
            }
            .text{
                    float: right;
                    padding-right: 50%;
            }
            h1{
                text-align: center;
            }
            label{
                font-weight: 900;
                font-size: 1.1em;
            }
        
        </style>
    </head>
    <body>
        <h1>Please Enter the details below:</h1>
        <div id="wrapper">
            <div class="form-section">
            <form action="hw3_part8" method="post">
                <label>Movie Name<sup>*</sup>:  </label><input class="text" type="text" name="title" required/><br/><br/>
                <label>Lead Actor:  </label><input class="text" type="text" name="actor"/><br/><br/>
                <label>Lead Actress:  </label><input class="text" type="text" name="actress"/><br/><br/>
                <label>Genre<sup>*</sup>:  </label><input class="text" type="text" name="genre" required/><br/><br/>
                <label>Year<sup>*</sup>:  </label><input class="text" type="text" name="year" required/><br/><br/>
                <input type="hidden" name="value" value="addMoviePage"/><br/><br/>
                <input class="submit-btn" type="submit"  value="Add Movie">
            </form>
            </div>
        </div>
        
    </body>
</html>
