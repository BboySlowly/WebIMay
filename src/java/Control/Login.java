package Control;

import ConnectDB.ConclassDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {

    public ConclassDB login = new ConclassDB();

    private PreparedStatement Pstm = null;
    private Statement stm = null;
    private Connection con = null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        boolean chack = false;
        chack = chackLogin(email, password);
        HttpSession session = request.getSession(true);
        if (chack) {

            session.setAttribute("username", showName(email));
            session.setAttribute("email", email);
            session.setAttribute("cart", countcart(email));

            RequestDispatcher re = request.getRequestDispatcher("index.jsp");
            re.forward(request, response);
        } else {
            RequestDispatcher re = request.getRequestDispatcher("LoginField.jsp");
            re.forward(request, response);
        }
    }

    public String showName(String email) {
        String username = "";
        try {
            String sql = "select * from accounts where email = '" + email + "'";
            stm = login.Connection().createStatement();
            ResultSet re = stm.executeQuery(sql);
            re.next();
            
            username = re.getString("username");
            
            re.close();
            stm.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return username;

    }

   public int countcart(String email) {
        int a = 0;
        try {
            String sql = "select count(*) from cart where email = '" + email + "'";
            stm = login.Connection().createStatement();
            ResultSet re = stm.executeQuery(sql);
            re.next();
            a = re.getInt("COUNT(*)");
            
            re.close();
            stm.close();

            return a;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 5;
        } catch (Exception e) {
            return 5;
        }

    }

    public boolean chackLogin(String email, String password) {
        boolean f = false;
        try {
            String sql = "select * from accounts where email = '" + email + "' and password = '" + password + "'";
            stm = login.Connection().createStatement();
            ResultSet re = stm.executeQuery(sql);
            f = re.next();
            
            re.close();
            stm.close();
            
            return f;
        } catch (SQLException e) {
            return f;
        } catch (Exception e) {
            return f;
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
