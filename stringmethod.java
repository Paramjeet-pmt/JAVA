public class stringmethod {
    public static void main(String[] args) {

        //Concate the 2 String 
        String name1 = "paramjeet";
        String name2 = "param";
        String name3 = name1 + " and " + name2;
        System.out.println(name3);

        System.out.println(name1.charAt(2));

        System.out.println(name1.length());

        String name4 = name2.replace('p','k');
        System.out.println(name4);

       System.out.println(name1.substring(0,5));
    }
}
