package leetcode122;

/**
 * @author ：LiangYe
 * @date ：Created in 2020/9/30 10:10
 * @description：买卖股票的最佳时机 II
 */
public class MaxProfit {

    /**
     * create by: LiangYe
     * description: 买卖股票的最佳时机 II
     * create time: 2020/9/30 10:11
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1];
            }
        }

        return max;
    }
}
