/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huyvd.test;

import static huyvd.main.MathUtility.*;
//chỉ có từ JDK5 ?, hàm static gọi mà hok cần tên class chấm
//do mình đã chơi trò khai báo sẵn tên class và tên hàm static qua lệnh
//import static
//sau này xài hàm static của class này ko cần tên class chấm, xài như C

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nhoxr
 */
public class MathUtilityTest {
    
    //viết ra những tình huống xài hàm getFactorial()
    //và kt xem actual có == expected hay ko, như truyền thống bên hàm main
    //nhưng ở đây xịn sò hơn, show ra màu xanh đỏ
    //ngoài ra còn dùng cho việc 
    //CI - continuous Integration
    //CD - Continuous Delivery
    //CT - Continuous Regression Test
    //DevOps - Development & Operation
    //ngoài doanh ngiệp đang xài
    //app liên tục dc kt chất lượng code, build ra file .jar .war
    //đẩy lên 1 srv trung gian - STAGING ENVIRONMENT để cho nhóm test
    //sẵn sàng test
    //sau đó có thể đẩy lên PRODUCTION SERVER, máy chạy thật ở nơi KH
    //mọi việc se bắt đầu kể từ lúc Developer push code lên GitHub
    //mọi thứ cứ thê tự động, ko cần con người can thiệp
    
    @Test //từ khóa này ~ biến hàm này thành public static void main()
    //trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của 
    //EXPECTED VS. ACTUAL qua hàm assertEquals().. mà thư viện cung cấp
    //assert...() đủ các loại hàm assert trên cuộc đời - assert (v) so sánh
    //thay vì so sánh = mắt, ta nhờ hàm so sánh giùm, thảy về màu giùm ta
    public void getFactorial_RunsWell_IfValidArgument() {
//	assertEquals(120, MathUtility.getFactorial(5));

	assertEquals(120, getFactorial(5));
	assertEquals(24, getFactorial(4));
	assertEquals(720, getFactorial(6));
	assertEquals(1, getFactorial(0));
	
	//hãy tính giùm tui 5! coi nó có là 120 hem?
	//có thì báo xanh, ko thì báo đỏ
	
    }
}
