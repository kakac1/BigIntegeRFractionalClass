/*@author:	小柯
 * 题目：分数类的运算
 *编写时间：2021/5/16
 */
/**
 * 主函数在这里运行
 * 
 */
package BigintegerFractionalClass;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {// 循环运行函数
			Fractionalclasstest.菜单();
			try {
				// 将所有抛出的异常进行处理
				Fractionalclasstest.选择行为(sc);
			} catch (OrdinalNumberSelectionException e) {// 处理异常
				System.out.println("序号选择超出范围");
			} catch (ExitException e) {// 处理异常
				System.out.println("ExitException");
			} catch (FormatError e) {// 处理异常
				System.out.println("输入的FormatError");
			} catch (ZeroDenominatorAnomaly e) {// 处理异常
				System.out.println("输入的分母为0,不符合运算");
			} catch (Nullpointerexception e) {// 处理异常
				System.out.println("空指针异常");
			} catch (InputMismatchException e) {// 处理异常
				System.out.println("输入异常");
			}catch (NumberFormatException e) {// 处理异常
				System.out.println("分母分子都为分数，相当于两个分数相除，无意义");
			}

		}

	}
}
