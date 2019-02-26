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
<title>Upload Csv File</title>
</head>
<body>
    <h3>File Upload:</h3>
    Select a file to upload: <br />
    <form action = "hw2_part5.xls" method = "post">
       <input type = "file" name = "file" size = "50" />
       <br />
       <input type = "submit" value = "Upload File" />
    </form>
</body>
</html>