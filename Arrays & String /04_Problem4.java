 class problem4 {
    public static  boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 &&
                (i == 0 || flowerbed[i - 1] == 0) &&
                (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

                n--;
                i++; 
            }
            i++;
        }
        return n <= 0;
    }
public static void main(String[] args) {

int[] flowerbed = {0,0,1,0,0};
int n=1;
Boolean result = canPlaceFlowers(flowerbed,n);
System.out.println(result);

}
}
