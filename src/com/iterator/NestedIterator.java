package com.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;
/*
Given a nested list of integers, implement an iterator to flatten it.

Each element is either an integer, or a list -- whose elements may also be integers or other lists.

Input: [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false,
             the order of elements returned by next should be: [1,1,2,1,1].
 */

public class NestedIterator implements Iterator<Integer> {
    private Stack<NestedInteger> st = new Stack<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            st.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return st.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        if (st.isEmpty()) {
            return false;
        }
        NestedInteger top = st.peek();
        while (!top.isInteger()) {
            st.pop();
            List<NestedInteger> list = top.getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                st.push(list.get(i));
            }
            if (st.isEmpty()) {
                break;
            }
            top = st.peek();
        }
        return !st.isEmpty();
    }
}
