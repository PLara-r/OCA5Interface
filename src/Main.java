public class Main implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(new Main().getSpeed());
    }}
 //1
