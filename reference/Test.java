public class Test {
    public static void main(String[] args) {

        System.out.println("Hello!");

        TestControl sm = new TestControl();
        sm.Start();

        while(!sm.IsEnd()){
            sm.Update();
        }

        System.out.println("Bye!");
    }
}
 