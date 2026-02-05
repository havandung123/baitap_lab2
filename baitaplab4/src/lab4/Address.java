/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author GSADS
 */
class Address {
    String street, city;

    Address(String s, String c) {
        street = s;
        city = c;
    }
}

public class Student {
    String id, name;
    Address address;

    void display() {
        System.out.println(id + " - " + name);
        System.out.println(address.street + ", " + address.city);
    }

    public static void main(String[] args) {
        Address ad = new Address("Le Loi", "Da Nang");
        Student st = new Student();
        st.id = "SV01";
        st.name = "Dung";
        st.address = ad;

        st.display();
    }
}
