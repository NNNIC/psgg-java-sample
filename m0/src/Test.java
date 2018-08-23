public class Test {
    public static void main(String[] args) {

        System.out.println("Hello!");

        TestControl_created sm = new TestControl_created();
        sm.Start();

        while(!sm.IsEnd()){
            sm.Update();
        }

        System.out.println("Bye!");
    }
}
 