
class Person {

    String name = "Baxtiyor";
}

class Dastur {

    void kirish() {
        System.out.println("kirish");
    }

    void chiqish() {
        System.out.println("chiqish");
    }
}

public class OOP {

    public static void main(String[] args) {
        Person names = new Person();

        String name = names.name;
        System.out.println(name);
        Dastur dastur = new Dastur();
        dastur.kirish();
        dastur.chiqish();
    }
}
