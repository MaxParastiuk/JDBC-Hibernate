package HomeWork1.task1;

import java.sql.Date;

public class Managers {
    int id;
    String name;
    String post;
    String phone;
    Date date_birth;

    public Managers(int id, String name, String post, String phone, Date date_birth) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.phone = phone;
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

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDate_birth() {
        return date_birth;
    }

    public void setDate_birth(Date date_birth) {
        this.date_birth = date_birth;
    }
}
