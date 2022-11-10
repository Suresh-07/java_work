package Mypackage;

class madhu1 {
    private int num;
    private String name;
    String regex = "^[a-zA-Z]+$";

    public void setName(String str) {
        if (str.matches(regex)) {
            name = str;
            System.out.println(str);
        } else {
            System.out.println("name not valid");
        }
    }
}
    public class akka {
        public static void main(String[] args) {
            madhu1 M = new madhu1();
            M.setName("akka");
        }

    }

