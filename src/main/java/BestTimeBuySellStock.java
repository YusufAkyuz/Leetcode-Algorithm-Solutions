public class BestTimeBuySellStock {
    public static int maxProfit(int[] prices) {
        /*
        Benim yaptığım yanlış çözüm
        int minNumber = prices[0];
        int minIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minNumber) {
                minNumber = prices[i];
                minIndex = i;
            }
        }
        int maxNumber = minNumber;
        for (int i = minIndex; i < prices.length; i++) {
            if (prices[i] >= maxNumber) {
                maxNumber = prices[i];
            }
        }
        return maxNumber - minNumber;
        */
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (maxProfit < price - minPrice) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

    }
}
