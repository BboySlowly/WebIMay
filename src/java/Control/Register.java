package Control;

import java.sql.*;
import ConnectDB.ConclassDB;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

@WebServlet(name = "Register", urlPatterns = {"/Register"})
public class Register extends HttpServlet {

    public ConclassDB regis = new ConclassDB();

    private PreparedStatement Pstm = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean chack = false;
        try {
            chack = insertCustomer(email, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (chack) {
            RequestDispatcher re = request.getRequestDispatcher("index.jsp");
            re.forward(request, response);
        } else {
            RequestDispatcher re = request.getRequestDispatcher("RegisterField.jsp");
            re.forward(request, response);
        }
    }

    public boolean insertCustomer(String email, String username, String password) throws SQLException {
        try {
            String sql = "insert into accounts(email, username, password) values(?,?,?)";
            Pstm = regis.Connection().prepareStatement(sql);

            Pstm.setString(1, email);
            Pstm.setString(2, username);
            Pstm.setString(3, password);

            Pstm.executeUpdate();
            Pstm.close();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
