package HomeWork1.task1;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/MyJoinsDB";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "19991022supeR";

    public static void main(String[] args) {
        registerDriver();

        Connection connection = null;
        Statement statement = null;
        List<Employee_contact> employee_contact = new ArrayList<>();
        List<Single_employees> single_employees = new ArrayList<>();
        List<Managers> managers = new ArrayList<>();

        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select staff.id, name, phone, address from staff, personal_information  where staff.id = personal_information.id;");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String address = resultSet.getString(4);
                Employee_contact employeeContact = new Employee_contact(id, name, phone, address);
                employee_contact.add(employeeContact);

                System.out.println(id + " " + name + "   " + phone + "   " + address);
            }
            System.out.println("-------------------------------------");

            resultSet = statement.executeQuery("select staff.id, name, date_birth, phone,  marital_status from staff, personal_information where staff.id=personal_information.id and personal_information.marital_status is null;");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                Date date_birth = resultSet.getDate(3);
                String phone = resultSet.getString(4);
                String marital_status = resultSet.getString(5);
                Single_employees singlEmployees = new Single_employees(id, name, phone, marital_status, date_birth);
                single_employees.add(singlEmployees);

                System.out.println(id + " " + name + "   " + date_birth + "    " + phone + "   " + marital_status);
            }

            System.out.println("--------------------------------");

            resultSet = statement.executeQuery("select staff.id, name, job_information.post, date_birth, phone from job_information, staff, personal_information where staff.id = personal_information.id and personal_information.id=job_information.id and post='Менеджер';");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String post = resultSet.getString(3);
                Date date_birth = resultSet.getDate(4);
                String phone = resultSet.getString(5);
                Managers manager = new Managers(id, name, post, phone, date_birth);
                managers.add(manager);

                System.out.println(id + " "  + name + "   " + post + "   " + date_birth + "   " + phone);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                connection.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void registerDriver() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loading success!");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
