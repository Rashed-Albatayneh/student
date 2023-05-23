/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1.tuesday;

/**
 *
 * @author miskm
 */
// hello this been edited on github
class Student {
       private String sname;
    private String sID;

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }

    public Student(String sID, String sname) {
        this.sname = sname;
        this.sID = sID;
    }
}
