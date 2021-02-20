package com.divideconqour;

/*
We are given a 2D matrix. Accessing each cell have a cost associated with it. We need to start from (0,0) cell
and go till (n-1,n-1) cell. We can either go only right or down cell from current cell.
Find min cost required to reach the last cell.
 */
public class MinimumCostToReachLastCell {
    private int findMinCost(int[][] array, int row, int col) {
        if (row < 0 || col < 0) {
            return Integer.MAX_VALUE;
        }
        if (row == 0 && col == 0) {
            return array[0][0];
        }
        int minCost1 = findMinCost(array, row - 1, col);
        int minCost2 = findMinCost(array, row, col - 1);
        int minCost = Math.min(minCost1, minCost2);
        return minCost + array[row][col];
    }

    public static void main(String[] args) {
        int[][] array =
                {
                        {4, 7, 8, 6, 4},
                        {6, 7, 3, 9, 2},
                        {3, 8, 1, 2, 4},
                        {7, 1, 7, 3, 7},
                        {2, 9, 8, 9, 3}
                };
        MinimumCostToReachLastCell obj = new MinimumCostToReachLastCell();
        System.out.println(obj.findMinCost(array,array.length-1,array[0].length-1));

    }
}
