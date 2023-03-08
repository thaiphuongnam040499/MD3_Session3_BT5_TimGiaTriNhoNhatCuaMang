import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatCuaMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap size:");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("size lớn quá");
            }
        }while (size>20);
        arr = new int[size];
        int i =0;
        while (i<arr.length){
            System.out.println(""+(i+1)+":");
            arr[i] = scanner.nextInt();
            i++;
        }
            System.out.print("mang cua ban: " + Arrays.toString(arr));
        int min=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[min]>arr[j]){
                min = arr[j];
            }
        }
        System.out.println("phan tu nho nhat cua mang: " +min);
    }
}
