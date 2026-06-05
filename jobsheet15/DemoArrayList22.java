package jobsheet15;

import java.util.ArrayList;
import java.util.Collections;

public class DemoArrayList22 {
    public static void main(String[] args) {
        ArrayList<String> daftarSiswa = new ArrayList<>();
        ArrayList<Customer22> customers = new ArrayList<>();

        customers.add(new Customer22(1, "Zainab"));
        customers.add(new Customer22(2, "Andi"));
        customers.add(new Customer22(3, "Rara"));

        customers.sort((c1, c2) -> c1.name.compareTo(c2.name));
        System.out.println(customers);

        // daftarSiswa.add("zainab");
        // daftarSiswa.add("Andi");
        // daftarSiswa.add("Rara");
        // Collections.sort(daftarSiswa);

        // System.out.println(daftarSiswa);

        // ArrayList<Customer22> newCustomers = new ArrayList<>();

        // newCustomers.add(new Customer22(201, "Della"));
        // newCustomers.add(new Customer22(202, "Victor"));
        // newCustomers.add(new Customer22(203, "Sarah"));

        // customers.addAll(newCustomers);
        // System.out.println(customers);

        // for (Customer22 cust : customers) {
        // System.out.println(cust.toString());
        // }
    }
    // Customer22 customer1 = new Customer22(1, "Zaskia");
    // Customer22 customer2 = new Customer22(2, "Budi");

    // customers.add(customer1);
    // customers.add(customer2);

    // customers.add(new Customer22(4, "Cica"));
    // customers.add(2, new Customer22(100, "Rosa"));

    // System.out.println(customers.indexOf(customer2));

    // Customer22 customer = customers.get(1);
    // System.out.println(customer.name);
    // customer.name = "Budi Utomo";
}
