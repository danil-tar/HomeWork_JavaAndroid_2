import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone(123456, "Nokia", 150));
        phones.add(new Phone(6254845, "Volga", 150));
        phones.add(new LandLinePhone(587465, "Ericsson", 500, true));
        phones.add(new LandLinePhone(4758763, "IDC", 500, true));
        phones.add(new MobilePhone(7692525, "Samsung", 200, 5, true));
        phones.add(new MobilePhone(987654, "LG", 200, 5, false));

        for (Phone p : phones) {
            System.out.println(p);
            p.ring();
            System.out.print(p.getModelName() + "\n" + "\n");
            System.out.println("About phone:");
            p.aboutPhone(p);
        }
        System.out.println("After changes:");

        Phone changedPhone1 = phones.get(0);
        changedPhone1.setNumber(77777777);
        changedPhone1.setModelName("Nokia 2");

        System.out.println(changedPhone1);

        Phone changedPhone2 = phones.get(5);
        changedPhone2.setModelName("Apple");
        changedPhone2.setWeight(250);

        System.out.println(changedPhone2);


    }
}