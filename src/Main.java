public class Main {
    public static void main(String[] args) {
        int n = 3; // מספר המספרים הנרקיסיסטיים לחיפוש
        int[] narcissisticNumbers = findNarcissisticNumbers(n);

        // הדפסת המספרים הנרקיסיסטיים שנמצאו
        for (int num : narcissisticNumbers) {
            System.out.println(num);
        }
    }

    // פעולה למציאת n המספרים הנרקיסיסטיים הראשונים
    public static int[] findNarcissisticNumbers(int n) {
        // TODO: השלם את הלוגיקה למציאת המספרים הנרקיסיסטיים
        int check = 75;
        boolean result = isSelfish(check);
//        int[]nums = new int[n];
////        int[]digits = new int[Integer.MAX_VALUE];
//        int sum=0;
//        int num=10;
//        int count=0;
//        while (sum<n){
//            int i=0;
//            int num1 =num;
//            int[]s = new int[(int)(Math.log10(num)+1)];
//            while (num1%1==0){
//                s[i]=num1%10;
//                num1 =num1/10;
//                i++;
//            }
//            int sum1 = 0;
//            for (int j = 0; j < s.length; j++)
//                sum += Math.pow(s[j],s.length);
//            if (sum==num){
//                nums[count]=num;
//                num++;
//                count++;
//            }
//
        return new int[0]; // החזרה זמנית
        }
        public static boolean isSelfish(int num){
            int[]sid = new int[2];
            sid[0]=num%10;
             sid[1]
        }
    }

