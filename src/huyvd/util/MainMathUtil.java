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
