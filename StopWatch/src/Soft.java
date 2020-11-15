public class Soft {
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        sw.start();
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        arr = SelectionSoft.selectionSoft(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        sw.stop();
        System.out.println();
        System.out.print("Start time:" + sw.getStartTime() + "\n");
        System.out.print("End time:" + sw.getEndTime() + "\n");
        System.out.print("Elapsed time:" + sw.getElapsedTime() + "\n");
    }
}
