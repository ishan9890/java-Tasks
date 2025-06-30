import java.util.Stack;
public class StackImpl {
    
    public static void main(String[]args){
        Stack<Integer> stackName= new Stack <> ();
        stackName.push(1);
        stackName.push(2);
        System.out.println(stackName.peek());
        System.out.println(stackName.pop());
        System.out.println(stackName.isEmpty());



    }
}
