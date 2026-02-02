class NumArray {
    //Brute force yaklaşırsak for ile gezinip her elemanı üst üste toplarız.
    //Ancak bu durum time complexitynin O(n) zamanda çalışmasına neden olacaktır.
    //Bunun yerine Prefix yaklaşımı denen kümülatif toplama yöntemini kullanırız.
    private int[] prefixSum;
    public NumArray(int[] nums) {
        prefixSum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i+1] = prefixSum[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }

    public static void main(String[] args) {

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */