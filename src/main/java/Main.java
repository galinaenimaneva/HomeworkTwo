public class Main {
    public static void main(String[] args) {
        String  name = "Galina";
        int symbolsName = 6;
        String lastName = " Enimaneva";
        int symbolsLastName = 9;
        String fullNames = "Galina Ilieva Enimaneva";
        int symbolsFullName = 21;
        System.out.println("My name is " + name +  lastName);
        //name.replace("Galina", "Emily");
        System.out.println("My name is " + name.replace("Galina", "Emily"));
        System.out.println(name.equals(lastName));
        System.out.println(fullNames.length());
        System.out.println(name.substring(1,3));
        System.out.println(lastName.substring(1,2));
        System.out.println(name.substring(0,6) + lastName.substring(0,10));


    }
}
