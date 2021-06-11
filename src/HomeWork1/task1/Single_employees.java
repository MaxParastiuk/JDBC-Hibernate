package HomeWork1.task1;

import java.sql.Date;

public class Single_employees {
    int id;
    String name;
    String phone;
    String marital_status;
    Date date_birth;

    public Single_employees(int id, String name, String phone, String marital_status, Date date_birth) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.marital_status = marital_status;
        this.date_birth = date_birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }
}
