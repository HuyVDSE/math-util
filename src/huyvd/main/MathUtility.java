/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyvd.main;

/**
 *
 * @author nhoxr
 */
public class MathUtility {
    //lam bo thu vien fake giong y chang Math
    //Math.PI, .abs() .sqrt() .pow(a, b) a^b
    //pham la thu vien thi se xai static khi ko can luu info cho rieng minh
    //còn thư viện mà vẫn cần lưu info riêng thì vẫn none static như thường

    public static final double PI = 3.1415;

    //tien ich tinh gia thua n! = 1.2.3..n
    //m phaila tu 0 tro len 
    //0! = 1! = 1
    //am giai thua vo nghia
    //giai thua tang cuc nhanh, 21! long ko chua dc
    //bai nay minh se chan gia thua tu 0..20
    //am hoac 21 chui, ko them tinh
//    public static long getFactorial(int n) {
//	if (n < 0 || n > 20) {
//	    throw new IllegalArgumentException("n must be between 0..20");
//	    
//	}//mai thay giang tiep, cam vang
//	if (n == 0 || n == 1) {
//	    return 1; //dac biet, return luon
//	}
//	//dua nao viet else o day, tru diem
//	//mặc nhiên CPU đến dc đây là hiểu rằng n = 2..20
//	long result = 1;
//	for (int i = 2; i <= n; i++) {
//	    result *= i;
//	}
//	return result;
//    }
    
    //viết hàm bằng đệ quy cho PRO
    public static long getFactorial(int n) {
	if (n < 0 || n > 20) {
	    throw new IllegalArgumentException("n must be between 0...20!");
	}
	if (n == 0 || n == 1) {
	    return 1;//dừng
	}
	return n * getFactorial(n - 1);
	//gọi lại chính hàm của mình với quy mô khác, n - 1
	//đi mãi sẽ về 1
    }
    //5! = 5*4!; 4! = 4*3!; 3! = 3*2!; 2! = 2*1!
    //1! = 1, đệ quy là gọi lại mình với quy mô nhỏ hơn
    //kết luận: n! = n * (n-1)!
    //phải có dừng, ko thì lặp vô tận
}
