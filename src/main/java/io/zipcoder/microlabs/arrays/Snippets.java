package io.zipcoder.microlabs.arrays;

/**
 * Created by brianmullin on 5/22/17.
 */
public class Snippets {

//    static int countPalindromes(String s) {
//        ArrayList<String> pals = new ArrayList<String>();
//
//        int length = s.length();
//        int count = 0;
//        String potentialPal = "";
//        String palBackwards = "";
//
//        for (int i = 0; i < length; i++) {
//            for (int j = i + 1; j <= length; j++) { //cast letter to a mathmatical value use .math to find absolute value
//                potentialPal = s.substring(i, j);
//                if(j - i > 1){
//                    pals.add(potentialPal);
//                }
//                else{
//                    count++;
//                }
//            }
//        }
//
//        for (int k = 0; k < pals.size(); k++) {
//            potentialPal = pals.get(k);
//            palBackwards = new StringBuilder(potentialPal).reverse().toString();
//            if (potentialPal.length() == 1) {
//                System.out.println(potentialPal);
//                count++;
//            } else if (potentialPal.equals(palBackwards)) {
//                System.out.println(potentialPal);
//                count++;
//            }
//        }
//        return count;
//    }
//
//    ////////////////////////
//
//    class Point2D{
//        int x;
//        int y;
//
//        Point2D(int x, int y){
//            this.x = x;
//            this.y = y;
//        }
//
//        public double dist2D(Point2D pTwo){
//            double answer = Math.sqrt((Math.pow((this.x - pTwo.x), 2))+(Math.pow((this.y - pTwo.y), 2)));
//            return answer;
//        }
//
//        public void printDistance(double d){
//            int answer = (int) Math.ceil(d);
//            System.out.println("2D distance = "+answer);
//        }
//    }
//
////------------------------------------------------------------------------------
//
//    class Point3D extends Point2D{
//
//        int z;
//
//        Point3D(int x, int y, int z){
//            super(x, y);
//            this.z = z;
//        }
//
//        public double dist3D(Point3D pThree){
//            double answer = Math.sqrt((Math.pow((this.x - pThree.x),2))+(Math.pow((this.y - pThree.y), 2))+(Math.pow((this.z - pThree.z), 2)));
//            return answer;
//        }
//
//        public void printDistance(double d){
//            int answer = (int) Math.ceil(d);
//            System.out.println("3D distance = "+answer);
//        }
//    }
//
//    ////////////////////////////////////
//
//    static int jumps(int k, int j) {
//
//        int jumps = 0;
//
//        if(j > k){
//            jumps = k;
//        }
//        else if(k%j == 0){
//            jumps = k/j;
//        }
//        else if(k%j != 0){
//            jumps = k/j + k%j;
//        }
//        return jumps;
//    }
//
//    //////////////////////////////////////
//
//    class Circle{
//        public static final double pi = 3.14159265;
//        public float radius;
//
//        Circle(float radius){
//            this.radius = radius;
//        }
//
//        public int getArea(){
//            return (int) Math.ceil(pi*radius*radius);
//        }
//    }
//
//    /////////////////////////////////////////
//
//    class Human implements Cloneable{
//
//        public String name;
//
//        Human(String name){
//
//            this.name = name;
//        }
//
//        public Object clone() throws CloneNotSupportedException{
//
//            return super.clone();
//        }
//
//    }

    /*
 * Complete the function below.
 */
/*
For your reference:
LinkedListNode {
    int val;
    LinkedListNode *next;
};
*/

    static LinkedListNode deleteEven(LinkedListNode list) {

        //LinkedListNode list = list.next;

        while(list.next != null){

            //if(list.val %2 = 1){
            //     list.head = list.next;
            // }

            if(list.next.val %2 != 1){
                list.next = list.next.next;
            }
            else{
                list = list.next;
            }


        }

        return list;

        ///////

       /* for(int i = 0; i<list.size(); i++){

            if(list.next != null){
                list.next = list.next.next;
            }
            else{
                list = list.next;
            }

        }
        return list;*/

    }

    static int minMoves(int[] avg) { //only passes 5 out of 13 cases

        int left = 1;
        int right = avg.length-1;
        int count = 0;
        int counter = 0;


        while(left < right){

            while(avg[left] == 1 && left < right){
                left++;
            }

            while(avg[right] == 0 && left < right){
                right --;
            }

            if(left < right){

                avg[left] = 1;
                avg[right] = 0;
                left ++;
                right --;
                counter++;

            }
        }

        if(counter != 0){
            for(int i = 1; i < avg.length-1; i++){
                if (avg[i] == 0){
                    count++;
                }
            }

            count += 2;

        }else{

            count = counter;
        }

        return count;

    }



    public static void main(String[] args) {

        Snippets test = new Snippets();

        int[] avg = {8, 1, 1, 1, 1, 0, 1, 0, 1 };

        System.out.println(test.minMoves(avg));
        //System.out.println(test.segregate0and1(avg, 9));
    }
}


