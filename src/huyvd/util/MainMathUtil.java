/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyvd.util;

import huyvd.main.MathUtility;

/**
 *
 * @author nhoxr
 */
public class MainMathUtil {
    public static void main(String[] args) {
	long expected = 120;//tớ hy vọng thấy 120 nếu tớ gọi 5!
	long actual = MathUtility.getFactorial(5);
	//in ra kiểm tra giữa sự khớp nhau giữa cái ta muốn và cái ta làm
	System.out.println("5! expected: " + expected);
	System.out.println("5! actual: " + actual);
	
	//tiếp tục cho các tình huống 6! 7!...
	//các tình huống test cần phải test ta gọi là test cases
	//về lý thuyết ta phải test hết các tình huống
	//về thực hành: kì 5 sẽ rõ môn SWT
	
	System.out.println("6!: 720 actual: " + MathUtility.getFactorial(6));
	System.out.println("0!: 1 actual: " + MathUtility.getFactorial(0));
	//t ki vong m nem ve ngoai le, phai la ngoai le
	//IllegalArgumentException neu ng dung co tinh, nguoi xai ham
	//nay cua t dua tham so am, tham so > 20
	
	System.out.println("expected: IllegalArgumentException: " + MathUtility.getFactorial(-5));
	
	System.out.println("Chuc cuoi tuan thu 9 vui ve");
	
    }
}

//mình muốn kết luận hàm ngon, mình phải test hết các trường hợp xài hàm
//trường hợp 5! 0! -5! .....
//mình phải thiết kế các test case, tình huóng test để sau đó mình verify
//giữa giá trị trả về của hàm (actual) có khớp với expected  cái mình dự đoán
//hàm chyaj pahir trả về
//và nếu mọi thứ khớp, tức là actual == expected, mình mới kết luận hàm ngon
//CÁCH NÀY CÓ NHƯỢC ĐIỂM: NHÌN BẰNG MẮT VÀ SS KQ CỦA TỪNG TEST CASE

//cách nâng cao
//cũng nhìn bằng mắt, nhưng chỉ nhìn 2 màu xanh - đỏ cho mọi test case
//có nghĩa: nếu bạn xài hàm với 100 tham số, chạy hàm 100 tình huống khác nhau
//Xanh, CODE ỔN CHO MỌI TEST CASE, MỌI TÌNH HUỐNG GỌI HÀM
//MỌI TEST CASE PHẢI CÓ EXPECTED = ACTUAL THÌ MỚI XANH
//ĐỎ, MỌI CASE MÀU XANH, CHỈ CÓ ÍT NHẤT 1 THẰNG ĐỎ, KẾT LUẬN CẢ ĐÁM ĐỎ
//hàm đúng cho 99 trường hợp, expected = actual cho 99% tình huống
//ai dám xài khi ko ổn đinh, ổn định và chính xác phải cho mọi trường hợp
//chỉ cần ít nhất 1 cái ko ổn định, đỏ cả đám để đảm bảo rằng hàm phải chính xác mọi 
//tình huống

//Muốn làm đc điều này, cần sự phụ giúp của các thư viện bên ngoài jdk, gọi là
//unit test framework
//CÁC BỘ UNIT TEST NỔI TIẾNG: JUnit, TestNG, NUnit,...
//bữa nay mình học xanh đỏ qua JUnit
//vẫn với mục tiêu test hàm có ngon ko, nhưng chỉ nhìn đúng 2 màu, ko care chi
//tiết các tình huống chạy hàm
