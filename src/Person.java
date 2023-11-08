public class Person {

    private String  name;
    private String designation;  // белгилөө

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public static void Learn(String learn){
        System.out.println(learn);
    }
    public static void Walk(String walk){
        System.out.println(walk);
    }
    public static void Eat(String eat){
        System.out.println(eat);
    }
    public static void Coding(String coding){
        System.out.println(coding);
    }


    @Override
    public String toString() {
        return      " \nName😉: " + name + "\n" +
                " designation: "+ designation ;
    }
}

