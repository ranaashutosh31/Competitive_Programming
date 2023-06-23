/*
PROBLEM LINK IN EXTENDED DESCRIPTION
Given a character array tasks of size N, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.
CPU has a cooldown period for each task. CPU can repeat a task only after atleast K units of time has passed after it did same task last time. It can perform other tasks in that time, can stay idle to wait for repeating that task.

Return the least number of units of times that the CPU will take to finish all the given tasks.

Example 1:
Input:
N = 6
K = 2
task[ ] = {'A', 'A', 'A', 'B', 'B', 'B'}
Output: 8
Explanation: 
A -> B -> idle -> A -> B -> idle -> A -> B
There is atleast 2 units of time between any two same tasks.
 
*/

class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int freq[] = new int[26];
        for (int i = 0; i < N; i++) {
            freq[tasks[i] - 'A']++;
        }
        Arrays.sort(freq);
        int maxFreq = freq[25];
        int idleTime = (maxFreq - 1) * K;
        for (int i = 24; i >= 0; i--) {
            idleTime -= Math.min(maxFreq - 1, freq[i]);
        }
        idleTime = Math.max(0, idleTime);
        return idleTime + N;
    }
}
