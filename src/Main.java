import static java.lang.StringTemplate.STR;

public class Main {
    public static void main(String[] args) {

        Programmer programmer = new Programmer("Urmat","backend","Peaksoft");
        System.out.println(programmer);
        Programmer.Learn("4-курста окуйт");
        Programmer.Walk("Эртен мн чуркабайт");
        Programmer.Eat("манты,плов");
        Programmer.Coding("Жава");
        System.out.println("---------------------");


        Danser danser = new Danser("Murzaiym","Ulan-Tobu","Sekelekter");
        System.out.println(danser);
        Danser.Learn("3-курс");
        Danser.Walk("жок");
        Danser.Eat("суши,пицца");
        Danser.Coding("Js");
        System.out.println("------------------------------");
        Singer singer = new Singer("Bakr","Kyrgyz","Менин ойлорумдасын");
        System.out.println(singer);
        Singer.Learn("20-жашта");
        Singer.Walk("жол");
        Singer.Eat("плов,стейк");
        Singer.Coding("консерт");



        //learn;учиться;
        //  Walk; Ходить;
        //   eat;   есть;
        //    coding; кодирование;

    }
}