<%-- 
    Document   : index
    Created on : 19/04/2023, 08:49:27 AM
    Author     : APRENDIZ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Contactenos!</h1>
        <form method="post" action="EnvioCorreo">
            <table>
                <tr>
                    
                    <td><input type="hidden" name="destino" value="jmmanjarrez9@misena.edu.co"></td>
                </tr>
                <tr>
                    <td>Asunto:</td>
                    <td><input type="text" name="asunto"></td>
                </tr>
                <tr>
                    <td>Correo:</td>
                    <td><input type="email" name="correo"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
