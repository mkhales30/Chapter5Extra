 /**
 * class name: splitStack
 * author: Monauver Rahman
 * course: ITEC 2150
 * date: November 1, 2022
 * version 1.0
 * description:This program will take a stack of integers as a parameter and splits it into negatives and non-negatives. 
 * The numbers in the stack will be rearranged so that all the negatives appear on the bottom of the 
 * stack and all the non-negatives appear on the top.
 * had some help from https://stackoverflow.com/questions/29838575
 */
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class splitStack
{
    public static void change(Stack<Integer> s){
        Queue<Integer> q = new LinkedList<Integer>();
        int numOfNegatives = 0;

        while(!s.isEmpty()) {
            if(s.peek() < 0)
                numOfNegatives++;
            q.add(s.pop());
        }
        while(numOfNegatives > 0) {
            if(q.peek() < 0) {
                s.push(q.remove());
                numOfNegatives--;
            } else {
                q.add(q.remove());
            }
        }
        while(!q.isEmpty())
            s.push(q.remove());
    }
    public static void rearrange(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        int size = q.size();
        for(int j = 0; j < 2; j++) {
            for(int i = 0; i < size; i++) {
                if(q.peek() % 2 == 0)
                    q.add(q.remove());
                else
                    s.push(q.remove());
            }
            while(!s.isEmpty())
                q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<Integer>();
      // Write a main method to test SplitStack by passing the following examples.
        //[ 5, -5, 67,-45, 67, 9, 0, -42,56,-7]  à output must be
        // like [-5, -45, -42, -7, 5, 67, 67, 9, 0, 56]
        s.push(new Integer(5));
        s.push(new Integer(-5));
        s.push(new Integer(67));
        s.push(new Integer(-45));
        s.push(new Integer(67));
        s.push(new Integer(9));
        s.push(new Integer(0));
        s.push(new Integer(-42));
        s.push(new Integer(56));
        s.push(new Integer(-7));
        System.out.println(s);
        change(s);
        System.out.println(s);
    }
}
