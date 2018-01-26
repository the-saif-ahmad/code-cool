import java.util.*;

public class Taming {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCaseNum = in.nextInt();
            in.nextLine();
        for(int testCaseInd = 0; testCaseInd < testCaseNum; testCaseInd++)
        {
            String line = in.nextLine();
            String[] strs = line.split(" ");
            ArrayDeque<Integer> nums = new ArrayDeque<>();
            ArrayDeque<String> opers = new ArrayDeque<>();
            
            for(int i = 0; i < strs.length; i++)
            {
                if(Character.isDigit(strs[i].charAt(0)))
                {
                    nums.addLast(Integer.parseInt(strs[i]));
                    continue;
                }
                if(strs[i].equals("+") || strs[i].equals("-"))
                {
                    opers.add(strs[i]);
                    continue;
                }
                if(strs[i].equals("*"))
                {
                    int prev = nums.removeLast();
                    int next = Integer.parseInt(strs[++i]);
                    nums.addLast(prev*next);
                    continue;
                }
                if(strs[i].equals("/"))
                {
                    int prev = nums.removeLast();
                    int next = Integer.parseInt(strs[++i]);
                    nums.addLast(prev/next);
                    continue;
                }
                
            }
            
            int things = opers.size();
            for(int i = 0; i < things; i++)
            {
                int n1 = nums.removeFirst();
                int n2 = nums.removeFirst();
                String oper = opers.removeFirst();
                if(oper.equals("+"))
                {
                    nums.addFirst(n1+n2);
                }
                else if(oper.equals("-"))
                {
                    nums.addFirst(n1-n2);
                }
            }
            
            System.out.println(nums.removeFirst());
        }
    }
}
