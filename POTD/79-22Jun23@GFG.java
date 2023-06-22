/*
PROBLEM LINK IN EXTENDED DESCRIPTION
You are an owner of lemonade island, each lemonade costs $5. Customers are standing in a queue to buy from you and order one at a time (in the order specified by given array bills[]). Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. You must provide the correct change to each customer so that the net transaction is that the customer pays $5.

NOTE: At first, you do not have any bill to provide changes with. You can provide changes from the bills that you get from the previous customers.

Given an integer array bills of size N where bills [ i ] is the bill the ith customer pays, return true if you can provide every customer with the correct change, or false otherwise.

Example 1:
Input:
N = 5
bills [ ] = {5, 5, 5, 10, 20}
Output: True
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change we return true.
*/

class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        int count5=0,count10=0;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                count5++;
            }
            if(bills[i]==10){
                count10++;
                if(count5<=0){
                    return false;
                }
                count5--;
            }
            if(bills[i]==20){
                if(count10>0){
                    count10--;
                    if(count5>0){
                        count5--;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    if(count5<3){
                        return false;
                    }
                    else{
                        count5-=3;
                    }
                }
            }
        }
        return true;
    }
}
