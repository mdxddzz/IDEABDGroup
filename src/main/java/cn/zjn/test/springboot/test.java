package cn.zjn.test.springboot;

import java.util.LinkedList;

/**
 * @Author: Zjn ; Bring it on !!!
 * @Date: 2021/3/5 0005 13:53
 * Note:
 */
public class test {
    public static void main(String[] args) {

    }

    public int maxProfit(int prices[]) {
        int minprice = prices[0]+1;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }


    public boolean isValid(String s) {
        LinkedList<Character> linklist = new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c == '(') linklist.push(')');
            else if(c == '{') linklist.push('}');
            else if(c == '[') linklist.push(']');
            else if(linklist.isEmpty() || c != linklist.pop()) return false;
        }
        return linklist.isEmpty();
    }

}
