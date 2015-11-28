package I_O_Stream_two;

import java.io.Serializable;

/**
 * Created by IT_School on 28.11.2015.
 */
public class Student implements Serializable {

    protected static String faculty;
    private String name;
    private int id;
    private transient String password;

    //private static final long serialVersionUID = 1L;


    public Student(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }


}
