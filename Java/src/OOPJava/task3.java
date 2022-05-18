package OOPJava;

import java.util.Arrays;
import java.util.Random;


public class task3 {
    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.printf("Start: %d\n", watch.getStartTime());
        watch.stop();
        System.out.printf("End: %d\n", watch.getEndTime());
        System.out.printf("Elapsed Time: %d\n", watch.getElapsedTime());
//        System.out.println(Arrays.toString(watch.randomArray()));

    }

    public static class StopWatch {
        private long startTime;
        private long endTime;

        public long getStartTime(){
            return startTime;
        }
        public long getEndTime(){
            return endTime;
        }
        public long getElapsedTime() {
            long elapsed;
            elapsed = endTime - startTime ;
            return elapsed ;
        }
        public int[] randomArray() {
            int[] array = new int[100000];
            for (int i = 0; i < 100000; i++) {
                array[i] = (new Random()).nextInt(100000) + 1;
            }
            return array ;
        }

        public void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int index = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[index]) {
                        index = j;//searching for lowest index
                    }
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
        }

        public void start() {
            this.startTime = System.currentTimeMillis();
        }

        public void stop() {
         this.endTime = System.currentTimeMillis();
        }
    }
}
