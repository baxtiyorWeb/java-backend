
public class Method {

    static void Methods() {
        System.out.println("Bu method java");
    }

    static String ism(String name) {
        return "Assalomu Alaykum " + " " + name;
    }

    public static void main(String[] args) {
        Methods();
        String[] ismlar = {"Shaxriyor", "Baxtiyor", "Hayitmurod"};

        for (String ism : ismlar) {
            String name = ism(ism);

            System.out.println(name);
        }
    }

}
