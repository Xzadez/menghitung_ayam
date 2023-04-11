public class Main {
    public static void main(String[] args) {
        int eggsPerChicken1, eggsPerChicken2, chickenCount1, chickenCount2;
        /// Monday
        eggsPerChicken1 = 5;
        eggsPerChicken2 = 4;
        chickenCount1 = 3;
        chickenCount2 = 8;

        /// Tuesday
        chickenCount1++;
        chickenCount2++;

        /// Wednesday
        chickenCount1 /= 2;
        chickenCount2 /= 2;

        int totalEggs = eggsPerChicken1 * (chickenCount1 + chickenCount1/2);
        int totalEggs1 = eggsPerChicken2 * (chickenCount2 + chickenCount2/2);
        System.out.println("Total eegs collected between Monday and Wednesday with 3 Chickens and 5 Eggs/chicken: " +totalEggs);
        System.out.println("Total eggs collected between Monday and Wednesday with 8 Chickens and 4 Eggs/chicken: " +totalEggs1);
    }
}