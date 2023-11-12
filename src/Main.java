public class Main {
    public static void main(String[] args) {
         int tab[] = {3, 2, -2, 5, -3};
//         int tab[] = {1, 1, 2, -1, 2, -1};
//         int tab[] = {1, 2, 3, -4};
//        int tab[] = {1, 1};

        boolean dassagimiz = false;

        int keeper = 0;
        for (int j = 0; j < tab.length; j++) {

            for (int k = j + 1; k < tab.length; k++) {
                if (tab[j] == tab[k]) {
                    continue;
                }
                else if (dassagimiz == false && Math.abs(tab[j]) == Math.abs(tab[k]) ) {
                    keeper = tab[j];
                    dassagimiz = true;
                    break;
                }
                else if (Math.abs(tab[j]) == Math.abs(tab[k]) && Math.abs(tab[j]) > keeper) {

                    keeper = Math.abs(tab[j]);
                    break;
                }
            }
        }
        if (keeper == 0) {
            System.out.println("The returned result is information about the lack of pair");
        } else {
            System.out.println("The returned result is a pair of " + keeper + " and " + (-keeper));
        }
    }
}
