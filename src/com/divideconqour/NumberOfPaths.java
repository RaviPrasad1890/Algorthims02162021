package com.divideconqour;
/*
Number of paths to reach last cell with given cost
 */
public class NumberOfPaths {
    public int pathWithinGivenCost(int[][] arr,int cost,int row, int col){
        if(cost<0){
            return 0;
        }
        if(row==0&&col==0){
            return arr[0][0]-cost==0?1:0;
        }
        if(row==0){
            return pathWithinGivenCost(arr,cost-arr[row][col],0,col-1);
        }
        if(col==0){
            return pathWithinGivenCost(arr,cost-arr[row][col],row-1,0);
        }
        int pathFromPrevRow=pathWithinGivenCost(arr,cost-arr[row][col],row-1,col);
        int pathFromPrevCol=pathWithinGivenCost(arr,cost-arr[row][col],row,col-1);
        return pathFromPrevRow+pathFromPrevCol;
    }
    public static void main(String[] args){
        NumberOfPaths obj= new NumberOfPaths();
        int[][] array = {
                { 4, 7, 1, 6 },
                { 5, 7, 3, 9 },
                { 3, 2, 1, 2 },
                { 7, 1, 6, 3 } };
        int cost = 25;
        System.out.println(obj.pathWithinGivenCost(array,cost,array.length-1,array[0].length-1));
    }
}
