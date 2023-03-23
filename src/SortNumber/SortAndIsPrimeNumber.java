package SortNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAndIsPrimeNumber {
    private static boolean isPrime (int n) {
//        Xét điều kiện xem có phải số nguyên tố hay không
        if (n <= 1) {
            return false;
        }
//        Xét từ 2 trở đi và kiểm tra bằng vòng for bằng căn bậc 2 của số n thì tối ưu hơn các trường hợp khác như:
//        cho vòng for chạy từ đầu đến n
        for (int i = 2; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
//        Nhập dãy A vào trong mảng
        int [] A = {19,2,7,34,3,5,4,3,63,24,97};
        List<Integer> arrs = new ArrayList<>();
        for (int arr : A ) {
            if (isPrime(arr)) {
                arrs.add(arr);
            }
        }
        Collections.sort(arrs);
        System.out.println("Prime numbers");
        System.out.println(arrs);
    }
}
