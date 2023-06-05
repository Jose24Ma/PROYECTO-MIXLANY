package Controlador;

import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorProveedor extends HttpServlet {

    Proveedor p = new Proveedor();
    ProveedorDAO pdao = new ProveedorDAO();
    int ide;
    int idc;
    int idp;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
        if (menu.equals("Proveedor")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("proveedores", lista);
                    break;
                case "Agregar":
                    String nom = request.getParameter("txtNombres");
                    String pag = request.getParameter("txtPagina");
                    String dir = request.getParameter("txtDir");
                    String tel = request.getParameter("txtTel");
                    p.setNom(nom);
                    p.setPag(pag);
                    p.setDir(dir);
                    p.setTel(tel);
                    pdao.agregar(p);
                    request.getRequestDispatcher("ControladorProveedor?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("id"));
                    Proveedor pr = pdao.listarId(idc);
                    request.setAttribute("proveedor", pr);
                    request.getRequestDispatcher("ControladorProveedor?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nom1 = request.getParameter("txtNombres");
                    String pag1 = request.getParameter("txtPagina");
                    String dir1 = request.getParameter("txtDir");
                    String tel1 = request.getParameter("txtTel");
                    p.setNom(nom1);
                    p.setPag(pag1);
                    p.setDir(dir1);
                    p.setTel(tel1);
                    p.setId(idc);
                    pdao.actualizar(p);
                    request.getRequestDispatcher("ControladorProveedor?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("id"));
                    pdao.delete(idc);
                    request.getRequestDispatcher("ControladorProveedor?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Proveedores.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
