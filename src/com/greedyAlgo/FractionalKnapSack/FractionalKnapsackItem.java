package com.greedyAlgo.FractionalKnapSack;
/*
/*
Given weights and values of n items,
we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.

Input:
Items as (value, weight) pairs
arr[] = {{60, 10}, {100, 20}, {120, 30}}
Knapsack Capacity, W = 50;

Output:
Maximum possible value = 240
by taking items of weight 10 and 20 kg and 2/3 fraction
of 30 kg. Hence total price will be 60+100+(2/3)(120) = 240
 */
public class FractionalKnapsackItem {
    private int index;
    private int value;
    private int weight;
    private double ratio;

    //constructor
    public FractionalKnapsackItem(int index, int value, int weight) {
        this.index = index;
        this.value = value;
        this.weight = weight;
        ratio = value * 1.0 / weight;
    }//end of method

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getRatio() {
        return ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String toString() {
        return "FractionalKnapsackItem{" +
                "index=" + index +
                ", value=" + value +
                ", weight=" + weight +
                ", ratio=" + ratio +
                '}';
    }
}
