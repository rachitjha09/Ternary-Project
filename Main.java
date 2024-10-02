//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x=70;
        int y;
        if(x>80) {
            y = 80;
        } else if(x>60 && x<80){
            y=100;
        } else{
            y=20;
        }

        int z=(x>80)? 80: (x>60 && x<80)? 100:20 ;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}