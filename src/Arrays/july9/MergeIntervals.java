package Arrays.july9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][] intervals= {
                {1,2},{3,5},{6,7},{8,10},{12,16}
        };
        int [] newIntervals={4,8};

        List<int [] > list=new ArrayList<>();

        int i=0;
        int n= intervals.length;

        // add the intervals before the overlapping
        while (i<n && intervals[i][1]<newIntervals[0]){
            list.add(intervals[i]);
            i++;
        }
        // merge the over lapping intervals now
        while (i<n && intervals[i][0]<newIntervals[1]){
            newIntervals[0]=Math.min(intervals[i][0],newIntervals[0]);
            newIntervals[1]=Math.max(intervals[i][0],newIntervals[1]);
            i++;
        }
        list.add(newIntervals);

        // adding the remaining intervals
        while (i<n){
            list.add(intervals[i]);
            i++;
        }

        System.out.println(Arrays.deepToString(list.toArray(new int[list.size()][])));


    }
}
