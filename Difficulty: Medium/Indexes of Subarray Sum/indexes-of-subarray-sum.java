class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> ans = new ArrayList<>();

        int sum = 0;
        int j = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            while (sum > target) {
                sum -= arr[j];
                j++;
            }

            if (sum == target) {
                ans.add(j + 1);   
                ans.add(i + 1);   
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}