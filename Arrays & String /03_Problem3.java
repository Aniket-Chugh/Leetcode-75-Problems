import java.util.ArrayList;
import java.util.List;
public class candy {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> result = new ArrayList<>();
            int maxCandies = 0;

            for(int i = 0; i < candies.length; i++) {
                if(candies[i] > maxCandies) {
                    maxCandies = candies[i];
                }
            }

            for(int i = 0; i < candies.length; i++) {
                if(candies[i] + extraCandies >= maxCandies) {
                    result.add(true);
                } else {
                    result.add(false);
                }
            }

            return result;
        }
        public static void main(String[] args) {
            int[] candies = {2,3,5,1,3};
            int extraCandies = 3;
            List<Boolean> result = kidsWithCandies(candies, extraCandies);
            System.out.println(result);

        }
    }
