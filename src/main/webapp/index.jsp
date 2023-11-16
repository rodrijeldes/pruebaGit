<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
   <title>Validar</title>
</head>
<body>
<form action="validarServlet" method="POST">
      Usuario    : <input type="text" name="usuario"/><br/>
      Constraseña: <input type="text" name="password"/><br/>
      <input type="submit" value="Enviar"/>
</form>
</body>
</html>