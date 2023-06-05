<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <br/>
        <br/>        
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form name="frmProductos" action="ControladorProducto?menu=Producto" method="POST" onsubmit="return validar()">
                            <div class="form-group">
                                <label>Nombre Producto</label>
                                <input type="text" value="${producto.getNom()}" name="txtDni" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Precio</label>
                                <input type="number" value="${producto.getPre()}" name="txtNombres" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Stock</label>
                                <input type="number" value="${producto.getStock()}" name="txtTel" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Estado</label>
                                <select value="${producto.getEstado()}" name="txtEstado" class="form-control">
                                    <option value="1">Activo</option>
                                    <option value="0">Inactivo</option>
                                </select>
                            </div>                    
                            <input type="submit" name="accion" value="Agregar" class="btn btn-primary">
                            <input type="submit" name="accion" value="Actualizar" class="btn btn-success">
                        </form>
                    </div>                         
                </div>
            </div>                     
            <div class="col-sm-8">
                <div class="card">
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>Nombres</th>
                                    <th>Precio</th>
                                    <th>Stock</th>                                    
                                    <th>ESTADO</th>                                    
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody> 
                                <c:forEach var="em" items="${productos}">
                                    <tr>
                                        <td>${em.getId()}</td>                                      
                                        <td>${em.getNom()}</td>
                                        <td>${em.getPre()}</td>
                                        <td>${em.getStock()}</td>
                                        <td>${em.getEstado()}</td>                                        
                                        <td>
                                            <a class="btn btn-warning" href="ControladorProducto?menu=Producto&accion=Editar&id=${em.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="ControladorProducto?menu=Producto&accion=Delete&id=${em.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                        <form method="POST" action="GenerarReporte.jsp" target="_blank">
                            <input class="btn btn-danger" type="submit" value="Generar PDF"> 
                        </form>  
                    </div>
                </div>
            </div>
        </div>      
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <script src="css/alertify.min.js" type="text/javascript"></script>
        <script>
                            function validar() {
                                dni = document.frmProductos.txtDni.value;
                                nom = document.frmProductos.txtNombres.value;
                                dir = document.frmProductos.txtTel.value;

                                if (dni.length == 0) {
                                    alertify.alert("Aviso", "Ingrese un nombre").set('label', 'Ok');
                                    return false;
                                } else if (nom.length == 0) {
                                    alertify.alert("Aviso", "Ingrese el precio").set('label', 'Ok');
                                    return false;
                                } else if (dir.length == 0) {
                                    alertify.alert("Aviso", "Ingrese una cantidad").set('label', 'Ok');
                                    return false;
                                }
                            }
        </script>
    </body>
</html>

