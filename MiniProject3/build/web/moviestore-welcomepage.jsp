<%-- 
    Document   : upload-csv-filr
    Created on : Feb 2, 2019, 10:32:49 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Movie Store</title>
<style type="text/css">
    html{
        
    }
    body{
        background: url("https://images.unsplash.com/photo-1485846234645-a62644f84728?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1040&q=80");		
        background-size: auto;
        background-repeat: no-repeat;
        background-position: center;
        text-align: center;
        color:white;
        font-weight: 600;
        width: 100%;
        height: 100%;
    }
    body h1{
        font-size: 4em;
        background: rgba(0,0,0,0.5);
    }
    body h3{
        font-size: 2em;
        background: rgba(0,0,0,0.5);
    }
    
</style>
</head>
<body>
    
       <h1>Welcome to our Movie Store</h1> 
    
    <div class="form-section">
        
        <h3>Pease make your selection below:</h3> <br/><br />
        <form action = "hw3_part8" method = "post">
        <select name="value">
            <option value="browseMovieOption">Browse Movies</option>
            <option value="addMovieOption">Add New Movie to Database</option>
        </select>
           <input type="submit" name="Submit"> 
        </form>
    </div>
   
    
</body>
</html>