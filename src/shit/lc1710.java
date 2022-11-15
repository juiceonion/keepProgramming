package shit;

import java.util.Arrays;
import java.util.Comparator;

public class lc1710 {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });

        int res = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            if (truckSize >= boxTypes[i][0]) {
                res += boxTypes[i][0] * boxTypes[i][1];
                truckSize -= boxTypes[i][0];
            } else {
                res += truckSize * boxTypes[i][1];
                return res;
            }
        }
        return res;
    }
}
