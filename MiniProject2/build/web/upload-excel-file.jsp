<%-- 
    Document   : upload-excel-file
    Created on : Feb 3, 2019, 7:35:51 PM
    Author     : Saurabh Gujare (NUID : 001424874)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Excel File</title>
</head>
<body>
    <h3>File Upload:</h3>
    Select a Excel file to upload: <br />
    <form action = "hw2_part6.xls" method = "post">
       <input type = "file" name = "fileExcel" size = "50" />
       <br />
       <input type = "submit" value = "Upload File" />
    </form>
</body>
</html>
