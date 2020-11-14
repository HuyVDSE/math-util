/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyvd.util;

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
    public static long getFactorial(int n) {
	if (n < 0 || n > 20) {
	    throw new IllegalArgumentException("n must be between 0..20");
	    
	}//mai thay giang tiep, cam vang
	if (n == 0 || n == 1) {
	    return 1; //dac biet, return luon
	}
	//dua nao viet else o day, tru diem
	//mặc nhiên CPU đến dc đây là hiểu rằng n = 2..20
	long result = 1;
	for (int i = 2; i <= n; i++) {
	    result *= i;
	}
	return result;
    }
    
    
}
