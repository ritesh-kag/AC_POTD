import java.util.ArrayList;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result = 0, count, sum1, sum2;

        for (int i = low; i <= high; i++) {
            ArrayList<Integer> list = new ArrayList<>(10);
            count = 0; sum1 = 0; sum2 = 0;
            int temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                list.add(digit);
                temp = temp / 10;
            }

            count = list.size();

            if (count % 2 != 0) continue;

            for (int j = 0; j < count / 2; j++) {
                sum1 = sum1 + list.get(j);
            }
            for (int j = 0; j < count / 2; j++) {
                sum2 = sum2 + list.get(count - j - 1);
            }

            if (sum1 == sum2) {
                result++;
            }
        }

        return result;
    }
}
