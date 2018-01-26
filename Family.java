import java.util.*;

public class Family {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int testCaseNum = in.nextInt();
        for(int testCaseInd = 0; testCaseInd < testCaseNum; testCaseInd++)
        {
            int memberCount = in.nextInt();
            Integer[] streetNums = new Integer[memberCount];
            for(int i = 0; i < memberCount; i++)
            {
                streetNums[i] = in.nextInt();
            }
            List<Integer> streetNumList = Arrays.asList(streetNums);
            Collections.sort(streetNumList);
            
            ArrayList<Integer> diffs = new ArrayList<>();
            for(int mid = streetNumList.get(0); mid <= streetNumList.get(streetNumList.size()-1); mid++)
            {
                int diff = 0;
                for(int streetNum : streetNumList)
                    diff += Math.abs(streetNum-mid);
                diffs.add(diff);
            }
            Collections.sort(diffs);
            System.out.println(diffs.get(0));
            
            /*
            int sum = 0;
            for(int streetNum : streetNumList)
                sum += streetNum;
            
            int mid = (int)Math.round((double)sum/memberCount);
            
            
            int diffSum = 0;
            for(int streetNum : streetNumList)
            {
                diffSum += Math.abs(streetNum-mid);
            }
            
            System.out.println(diffSum);
            */
        }
    }
}
    
