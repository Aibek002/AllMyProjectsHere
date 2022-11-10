

import java.io.*;
import java.util.*;

import static java.lang.System.in;


public class PhotoPamit {


        public static Scanner sc = new Scanner(in);
        public static int fileread = 0;

    public static void main(String[] args) {



        PrintWriter  cout = new PrintWriter(new BufferedOutputStream(System.out));
            /*Debug Reader*/
            //Scan cin =new Scan();
            if(fileread == 1)
            {
                try
                {
                    //cin = new Read(new FileInputStream(new File("in1.txt")));
                    Scanner sc = new Scanner(new File("in2.txt"));
                }
                catch (IOException error){}
            }
            else{
                Scanner sc = new Scanner(in);
            }

            int n = sc.nextInt();
            int[][] person = new int[n][2];
            int maxWidth = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>(){
                @Override
                public int compare(Integer a,Integer b)
                {
                    return (int)(b-a);
                }
            });
            Stack<Integer> s = new Stack<Integer>();
            for(int i=0;i<n;i++)
            {
                person[i][0] = sc.nextInt();
                person[i][1] = sc.nextInt();
                maxWidth += person[i][0];
                pq.offer(person[i][1]);
            }
            for(int i=0;i<n;i++)
            {
                if(!pq.isEmpty() && pq.peek() == person[i][1])
                {
                    s.push(pq.peek());
                    pq.remove();
                }
                cout.print((maxWidth - person[i][0])*((pq.size()>=1 ? pq.peek() : s.peek())) + " ");
                while(!s.empty())
                {
                    pq.offer(s.peek());
                    s.pop();
                }
            }
            cout.close();
        }









    }


