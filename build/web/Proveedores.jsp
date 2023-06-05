<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="css/alertify.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/default.min.css" rel="stylesheet" type="text/css"/>
        <title>Proveedores</title>
    </head>
    <body>
        <br/>
        <br/>
        <div class="d-flex">
            <div class="col-sm-4">
                <div class="card">
                    <div class="card-body">
                        <form name="frmProveedores" action="ControladorProveedor?menu=Proveedor" method="POST" onsubmit="return validar()">
                            <div class="form-group">
                                <label>Nombre</label>
                                <input type="text" value="${proveedor.getNom()}" name="txtNombres" class="form-control">
                            </div>                          
                            <div class="form-group">
                                <label>Pagina</label>
                                <input type="text" value="${proveedor.getPag()}" name="txtPagina" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Direccion</label>
                                <input type="text" value="${proveedor.getDir()}" name="txtDir" class="form-control">
                            </div>
                            <div class="form-group">
                                <label>Telefono</label>
                                <input type="text" value="${proveedor.getTel()}" name="txtTel" class="form-control">
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
                        <table class="table table-hover table-responsive">
                            <thead>
                                <tr>
                                    <th>ID</th>                                    
                                    <th>NOMBRES</th>
                                    <th>PAGINA</th>
                                    <th>DIRECCION</th>
                                    <th>TELEFONO</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="em" items="${proveedores}">
                                    <tr>
                                        <td>${em.getId()}</td>
                                        <td>${em.getNom()}</td>
                                        <td>${em.getPag()}</td>
                                        <td>${em.getDir()}</td>
                                        <td>${em.getTel()}</td>
                                        <td>
                                            <a class="btn btn-warning" href="ControladorProveedor?menu=Proveedor&accion=Editar&id=${em.getId()}">Editar</a>
                                            <a class="btn btn-danger" href="ControladorProveedor?menu=Proveedor&accion=Delete&id=${em.getId()}">Delete</a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
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
                                nom = document.frmProveedores.txtNombres.value;
                                pag = document.frmProveedores.txtPagina.value;
                                dir = document.frmProveedores.txtDir.value;
                                tel = document.frmProveedores.txtTel.value;

                                if (nom.length == 0) {
                                    alertify.alert("Error", "Ingrese nombre de la empresa").set('label', 'Ok');
                                    return false;
                                } else if (pag.length == 0) {
                                    alertify.alert("Error", "Ingrese la pagina de la empresa").set('label', 'Ok');
                                    return false;
                                } else if (dir.length == 0) {
                                    alertify.alert("Error", "Ingrese una direccion").set('label', 'Ok');
                                    return false;
                                } else if (tel.length == 0) {
                                    alertify.alert("Error", "Ingrese el telefono").set('label', 'Ok');
                                    return false;
                                }
                            }
        </script>
    </body>
</html>
    