//Akilah Johnson 2509289


import java.sql.SQLOutput;

public abstract class Person {
    private String FirstName;
    private String LastName;
    private String Email;
    private String PhoneNumber;

    public Person() {
        FirstName = "";
        LastName = "";
        Email = "";
        PhoneNumber = "";
    }

    public Person (String fn, String ln, String e, String pnum) {
        this.FirstName = fn;
        this.LastName = ln;
        this.Email = e;
        this.PhoneNumber = pnum;
    }


    //getters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    //setters
    public void setFirstName(String fn) {
        if (!fn.isEmpty())
            FirstName = fn;
        else
            System.out.println("Firstname cannot be empty. ");
    }

    public void setLastName(String ln) {
        if (!ln.isEmpty())
            LastName = ln;
        else
            System.out.println("Lastname cannot be empty.");
    }

    public void setEmail(String e) {
        if (e.contains("@"))
            Email = e;
        else
            System.out.println("Email is Invalid");
    }

    public void setPhoneNumber(String pnum) {
        if (pnum.length() == 7)
            PhoneNumber = pnum;
        else
            System.out.println("Invalid Phone Number");
    }

    public abstract void display();


}