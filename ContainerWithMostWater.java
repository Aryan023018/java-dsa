public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int maxWater = 0;

        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {

            int width = rp - lp;

            int ht = Math.min(height[lp], height[rp]);

            int currentWater = width * ht;

            maxWater = Math.max(maxWater, currentWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ContainerWithMostWater obj = new ContainerWithMostWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);

        System.out.println("Maximum Water: " + result);
    }
}
