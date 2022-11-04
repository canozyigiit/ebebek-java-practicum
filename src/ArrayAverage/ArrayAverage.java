package ArrayAverage;

public class ArrayAverage {

    public static void main(String[] args) {
        double harmonicSeries;
        double sum = 0;
        double harmonicAverage=0.0;

        int[] list = {21,24,35,56,68,10};

        for (int i : list) {
            harmonicSeries = 1.0 / i;
            sum += harmonicSeries;
            harmonicAverage = list.length/sum;
        }
        System.out.println("Harmonik ortalama: "+harmonicAverage);

    }
}
