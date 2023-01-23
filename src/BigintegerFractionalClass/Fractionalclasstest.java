/*@author:小柯
 * 题目：分数类的运算
 *编写时间：2021/5/16
 */
/**
 * 主要用于页面的菜单显示
 * 
 */
package BigintegerFractionalClass;

import java.util.Scanner;

public abstract class Fractionalclasstest {
	public static void 菜单() {// 菜单用来显示选择说明
		System.out.println("请输入前面的字母序号进行选择（有些序号后面要跟1个或2个整数编号）");
		System.out.println("A   查看功能");
		System.out.println("B   自主计算");
		System.out.println("c   测试数据");
		System.out.println("D   退出");
	}

	public static void data() throws Nullpointerexception {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 92348, 9 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 88, 4, -445, -9, -776, 923428, 89 };// 可用于当分母或分子
		String data3[] = new String[] { "656", "5", "-4", "4", "-8", "8", "45", "5", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "66", "68", "-444", "4", "-8", "889", "45", "346465", "5", "4" };// 可用于当分母或分子
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data1[i], data2[i]);// 形成分母对象
			System.out.println(data1[i] + "/" + data2[i] + "=" + data);
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data3[i], data4[i]);// 形成分母对象
			System.out.println(data3[i] + "/" + data4[i] + "=" + data);
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data2[i], data4[i]);// 形成分母对象
			System.out.println(data3[i] + "/" + data4[i] + "=" + data);
		}

	}

	public static void 绝对值测试() throws ZeroDenominatorAnomaly, Nullpointerexception {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 98, 89489 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 888, 4, -445, -9, -776, 98, 889 };// 可用于当分母或分子
		String data3[] = new String[] { "6", "5", "-74", "44", "-77", "7", "4", "2", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "6", "64", "-4", "5", "-7", "587", "4", "23423425", "574", "44" };// 可用于当分母或分子
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data1[i], data2[i]);// 形成分母对象
			System.out.println(data + "的绝对值" + Fraction.Abs(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data3[i], data4[i]);// 形成分母对象
			System.out.println(data + "的绝对值" + Fraction.Abs(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data2[i], data4[i]);// 形成分母对象
			System.out.println(data + "的绝对值" + Fraction.Abs(data));
		}

	}

	public static void 输出分数测试() throws ZeroDenominatorAnomaly, Nullpointerexception, FormatError {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 98, 8989 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 888, 4, -445, -9, -776, 98, 8989 };// 可用于当分母或分子
		String data3[] = new String[] { "6", "5", "-7", "58", "-8", "5", "5", "2", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "6", "6", "-4", "5", "-7", "8", "45", "5", "574", "44" };// 可用于当分母或分子
		String data5[] = new String[] { "6.6", "6.8", "-4.5", "5.6", "-7.2", "6.8", "4.5", "5", "57.4", "44" };
		Fraction z = new Fraction(6.6);
		Fraction z1 = new Fraction(6.8);
		Fraction z2 = new Fraction(-4.5);
		Fraction z3 = new Fraction(5.6);
		System.out.println(data5[0] + "分数为" + z);
		System.out.println(data5[1] + "分数为" + z1);
		System.out.println(data5[2] + "分数为" + z2);
		System.out.println(data5[3] + "分数为" + z3);
		for (int i = 0; i < 10; i++) {
			System.out.print(data1[i] + "/" + data2[i]);
			Fraction data = new Fraction(data1[i], data2[i]);
			System.out.println("=" + data);
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data3[i], data4[i]);
			System.out.println(data3[i] + "/" + data4[i] + "=" + data);
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data2[i], data4[i]);
			System.out.println(data3[i] + "/" + data4[i] + "=" + data);
		}

	}

	public static void 分数的四则运算测试() throws ZeroDenominatorAnomaly, Nullpointerexception {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 98, 8 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 888, 4, -445, -9, -776, 98, 9 };// 可用于当分母或分子
		String data3[] = new String[] { "6", "5", "-4", "44", "-78", "58", "45", "5", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "5", "624", "-4", "5", "-8", "8", "45", "2342345", "4", "44" };// 可用于当分母或分子
		int data5[] = new int[] { 2, 1, 3, 8, 4, -5, -9, -7, 98, 89 };// 可用于当分母或分子
		int data6[] = new int[] { 2, 2, 7, 88, 4, -45, -2, -7, 98, 89 };// 可用于当分母或分子
		String data7[] = new String[] { "6", "5", "-78", "4", "-8", "-8", "2", "5", "4", "4" };// 可用于当分母或分子
		String data8[] = new String[] { "6", "4", "-4", "45", "-8", "8", "3425", "5", "52", "34" };// 可用于当分母或分子
		/* 以下是加法测试 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("以下是加法测试：");
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data2[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "+" + Bdata + "=" + Fraction.Getadd(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data3[i], data4[i]);
			Fraction Bdata = new Fraction(data7[i], data8[i]);
			System.out.println(Adata + "+" + Bdata + "=" + Fraction.Getadd(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data3[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "+" + Bdata + "=" + Fraction.Getadd(Adata, Bdata));
		}
		/* 以下是减法测试 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("以下是减法测试：");
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data2[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "-" + Bdata + "=" + Fraction.Getsub(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data3[i], data4[i]);
			Fraction Bdata = new Fraction(data7[i], data8[i]);
			System.out.println(Adata + "-" + Bdata + "=" + Fraction.Getsub(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data3[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "-" + Bdata + "=" + Fraction.Getsub(Adata, Bdata));
		}
		/* 以下是乘法测试 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("以下是乘法测试：");
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data2[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "*" + Bdata + "=" + Fraction.Getmultiply(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data3[i], data4[i]);
			Fraction Bdata = new Fraction(data7[i], data8[i]);
			System.out.println(Adata + "*" + Bdata + "=" + Fraction.Getmultiply(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data3[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "*" + Bdata + "=" + Fraction.Getmultiply(Adata, Bdata));
		}
		/* 以下是除法测试 */
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("以下是除法测试：");
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data2[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "  /  " + Bdata + "=" + Fraction.Getdivivide(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data3[i], data4[i]);
			Fraction Bdata = new Fraction(data7[i], data8[i]);
			System.out.println(Adata + "  /  " + Bdata + "=" + Fraction.Getdivivide(Adata, Bdata));
		}
		for (int i = 0; i < 10; i++) {
			Fraction Adata = new Fraction(data1[i], data3[i]);
			Fraction Bdata = new Fraction(data5[i], data6[i]);
			System.out.println(Adata + "  /  " + Bdata + "=" + Fraction.Getdivivide(Adata, Bdata));
		}

	}

	public static void 相反数测试() throws ZeroDenominatorAnomaly, Nullpointerexception {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 98, 8989 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 888, 4, -445, -9, -776, 98, 8989 };// 可用于当分母或分子
		String data3[] = new String[] { "6", "5", "-4", "5", "-7", "5", "45", "5", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "6", "684", "-54", "54", "-78", "8", "45", "524553423", "574", "44" };// 可用于当分母或分子
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data1[i], data2[i]);
			System.out.println(data + "的相反数" + Fraction.Strains(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data3[i], data4[i]);
			System.out.println(data + "的相反数" + Fraction.Strains(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data2[i], data4[i]);
			System.out.println(data + "的相反数" + Fraction.Strains(data));
		}
	}

	public static void 倒数测试() throws ZeroDenominatorAnomaly, Nullpointerexception {
		int data1[] = new int[] { 1, 5, 7, 8, 4, -4, -9, -6, 98, 8989 };// 可用于当分母或分子
		int data2[] = new int[] { 2, 8, 7, 888, 4, -445, -9, -776, 98, 8989 };// 可用于当分母或分子
		String data3[] = new String[] { "656", "5", "-7", "57", "-78", "5", "45", "5", "574", "44" };// 可用于当分母或分子
		String data4[] = new String[] { "656", "4", "-4654", "4", "-7778", "8", "45", "523424242", "574", "44" };// 可用于当分母或分子
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data1[i], data2[i]);
			System.out.println(data + "的倒数" + Fraction.Reciprocal(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data3[i], data4[i]);
			System.out.println(data + "的倒数" + Fraction.Reciprocal(data));
		}
		for (int i = 0; i < 10; i++) {
			Fraction data = new Fraction(data2[i], data4[i]);
			System.out.println(data + "的倒数" + Fraction.Reciprocal(data));
		}
	}

	public static void 测试数据(Scanner sc) throws OrdinalNumberSelectionException, ExitException, OrdinalNumberSelectionException, ZeroDenominatorAnomaly, FormatError, Nullpointerexception {
		菜单3();
		String ne = null;
		if (sc.hasNext()) {
			ne = sc.next();
		}
		switch (ne) {
		case "A":
			System.out.println("输出分数测试");
			输出分数测试();
			break;
		case "B":
			System.out.println("分数的四则运算测试");
			分数的四则运算测试();
			break;
		case "C":
			System.out.println("绝对值测试");
			绝对值测试();
			break;
		case "D":
			System.out.println("相反数测试");
			相反数测试();
			break;
		case "E":
			System.out.println("倒数测试");
			倒数测试();
			break;
		case "F":
			throw new ExitException("玩家选择退出");

		default:
			throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);

		}
	}

	public static void 菜单3() {
		System.out.println("请输入前面的字母序号进行选择（有些序号后面要跟1个或2个整数编号）");
		System.out.println("A   输出分数测试");
		System.out.println("B   分数的四则运算测试");
		System.out.println("C   绝对值测试");
		System.out.println("D   相反数测试");
		System.out.println("E   倒数测试");
		System.out.println("F   退出");
	}

	public static void 查看功能() {
		// 查看功能函数，主要用于显示分数类的主要功能
		System.out.println("此类是分数类");
		System.out.println("\n");
		System.out.println("可用于Bignteger、int、String、Object类数组成的最简分数 ");
		System.out.println("例如以下：");
		System.out.println("\n");
		System.out.println("7*10^100/12   得到的分数为：17/6 ");
		System.out.println("2.5/2.5            得到的分数为：1 ");
		System.out.println(" 5/2                  得到的分数为：5/2 ");
		System.out.println(" -2.5                 得到的分数为：-3/2 ");
		System.out.println("\n");
		System.out.println("并且可以进行关于分数类的运算");
		System.out.println("例如以下：");
		System.out.println(" fraction z = new fraction(-2.5);");
		System.out.println(" fraction z1 = new fraction(1, 3);");
		System.out.println(" fraction z2 = new fraction(-6);");
		System.out.println(" fraction z3 = new fraction(-9);");
		System.out.println("z.add(z1)               两个分数相加:-7/6 ");
		System.out.println("z.sub(z2)               两个分数相减:9/2 ");
		System.out.println("z.multiply(z3)          两个分数相乘:27/2 ");
		System.out.println("z.divide(z3)            两个分数相除:1/6 ");
		System.out.println("\n");
		System.out.println("以下是另外的加减乘除运算类方法");
		System.out.println("fraction.Getadd(z2, z1)              两个分数相加:-17/3");
		System.out.println("fraction.Getsub(z2, z3)              两个分数相减:3");
		System.out.println("fraction.Getmultiply(z2, z2)         两个分数相乘:36");
		System.out.println("fraction.Getdivivide(z2, z3)         两个分数相除:2/3");
		System.out.println("\n");
		System.out.println("可以进行关于分数类的绝对值，倒数，相反数");
		System.out.println("fraction.Reciprocal(z1)         即1/3的倒数3");
		System.out.println("fraction.Strains(z1)            即相反数-1/3 ");
		System.out.println("fraction.Abs(z1)                即绝对值1/3");
		System.out.println("\n");
		System.out.println("可以进行关于分数类的相等判断");
		System.out.println(" fraction.equal(z2, z3)          得false  ");
		System.out.println("\n");
		System.out.println("可以求两个分数分母的最大公约数");
		System.out.println("fraction.Fenmucommon(z2, z3)         得到最大分母的最大公约数 3");

	}

	public static Fraction 输出分数() throws FormatError, ExitException, OrdinalNumberSelectionException, Nullpointerexception {// 从键盘上读取两个值。得出分数
		Fraction sul = 输入一个分数();
		System.out.println(sul);
		return sul;
	}

	public static Fraction 输入一个分数() throws ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {// 每一次在输入一个数字的时候都进行一次判断
		Fraction sul;
		System.out.println("请选择你要输入分子的类型(A：整数  B：含小数点的数  C：含/的数  D:退出 )");
		Scanner sc = new Scanner(System.in);
		String ne = "1";
		if (sc.hasNext()) {
			ne = sc.next();
		}
		switch (ne) {
		case "A":
			System.out.println("\n");
			System.out.println("请输入你要输入的数");
			Scanner reader = new Scanner(System.in);
			int z1 = reader.nextInt();
			System.out.println("\n");

			System.out.println("请选择你要输入分母的类型(A：整数  B：含小数点的数  C：含/的数  D:退出 )");
			Scanner scA = new Scanner(System.in);
			String neA = null;
			if (scA.hasNext()) {
				neA = scA.next();
			}
			switch (neA) {
			case "A":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader1 = new Scanner(System.in);
				int z1_2 = reader1.nextInt();
				sul = new Fraction(z1, z1_2);
				break;
			case "B":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader21 = new Scanner(System.in);
				Object z2_2 = reader21.nextLine();
				sul = new Fraction(z1, z2_2);
				break;
			case "C":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader3 = new Scanner(System.in);
				String z3_2 = reader3.nextLine();
				sul = new Fraction(z1, z3_2);
				break;
			case "D":
				throw new ExitException("玩家选择退出");
			default:
				throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);
			}

			break;
		case "B":
			System.out.println("\n");
			System.out.println("请输入你要输入的数");
			Scanner reader99 = new Scanner(System.in);
			Object z2 = reader99.nextLine();
			System.out.println("\n");
			System.out.println("请选择你要输入分母的类型(A：整数  B：含小数点的数  C：含/的数  D:退出 )");
			Scanner scB = new Scanner(System.in);
			String neB = null;
			if (scB.hasNext()) {
				neB = scB.next();
			}
			switch (neB) {
			case "A":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader1 = new Scanner(System.in);
				int z1_2 = reader1.nextInt();
				sul = new Fraction(z2, z1_2);
				break;
			case "B":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader21 = new Scanner(System.in);
				Object z2_2 = reader21.nextLine();
				sul = new Fraction(z2, z2_2);
				break;
			case "C":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader3 = new Scanner(System.in);
				String z3_2 = reader3.nextLine();
				sul = new Fraction(z2, z3_2);
				break;
			case "D":
				throw new ExitException("玩家选择退出");
			default:
				throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);
			}

			break;
		case "C":
			System.out.println("\n");
			System.out.println("请输入你要输入的数");
			Scanner reader3 = new Scanner(System.in);
			String z3 = reader3.nextLine();
			System.out.println("\n");
			System.out.println("请选择你要输入分母的类型(A：整数  B：含小数点的数  C：含/的数  D:退出 )");
			Scanner scC = new Scanner(System.in);
			String neC = null;
			if (scC.hasNext()) {
				neC = scC.next();
			}
			switch (neC) {
			case "A":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader1 = new Scanner(System.in);
				int z1_2 = reader1.nextInt();
				sul = new Fraction(z3, z1_2);
				break;
			case "B":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader21 = new Scanner(System.in);
				Object z2_2 = reader21.nextLine();
				sul = new Fraction(z3, z2_2);
				break;
			case "C":
				System.out.println("\n");
				System.out.println("请输入你要输入的数");
				Scanner reader31 = new Scanner(System.in);
				String z3_2 = reader31.nextLine();
				sul = new Fraction(z3, z3_2);
				break;
			case "D":
				throw new ExitException("玩家选择退出");
			default:
				throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);
			}

			break;
		case "D":
			throw new ExitException("玩家选择退出");
		default:
			throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);
		}

		return sul;

	}

	public static Fraction 分数的四则运算() throws ZeroDenominatorAnomaly, ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {// 从键盘上读取两个值。得出分数
		System.out.println("分别输入第一个分数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul1 = 输入一个分数();
		System.out.println("分别输入第二个数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul2 = 输入一个分数();
		System.out.println("以下是加法：");
		System.out.println("\n");
		System.out.println(sul1 + "+" + sul2 + "=" + sul1.Add(sul2));// 分数的加法
		System.out.println("以下是减法：");
		System.out.println("\n");
		System.out.println(sul1 + "-" + sul2 + "=" + sul1.Sub(sul2));// 分数的减法
		System.out.println("以下是乘法：");
		System.out.println("\n");
		System.out.println(sul1 + "*" + sul2 + "=" + sul1.Multiply(sul2));// 分数的乘法
		System.out.println("以下是除法：");
		System.out.println("\n");
		System.out.println(sul1 + "/" + sul2 + "=" + sul1.Divide(sul2));// 分数的除法
		return sul1;
	}

	public static void 绝对值() throws ZeroDenominatorAnomaly, ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {
		System.out.println("分别输入分数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul = 输入一个分数();
		System.out.println(sul + "的绝对值为" + Fraction.Abs(sul));
	}

	public static void 倒数() throws ZeroDenominatorAnomaly, ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {
		System.out.println("分别输入分数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul = 输入一个分数();
		System.out.println(sul + "的倒数为" + Fraction.Reciprocal(sul));
	}

	public static void 相反数() throws ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {
		System.out.println("分别输入分数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul = 输入一个分数();
		System.out.println(sul + "的相反数为" + Fraction.Strains(sul));
	}

	public static void 分母最大公约数() throws ExitException, OrdinalNumberSelectionException, FormatError, Nullpointerexception {
		System.out.println("分别输入第一个分数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul1 = 输入一个分数();
		System.out.println("分别输入第二个数的分子分母");// 键盘上读取两个值，将两个值作为分子分母
		Fraction sul2 = 输入一个分数();
		System.out.println(sul1 + "和" + sul2 + "的分母最大公约数" + sul1.Divide(sul2));

	}

	public static void 菜单2() {// AutonomousComputing的选择显示
		System.out.println("请输入前面的字母序号进行选择（有些序号后面要跟1个或2个整数编号）");
		System.out.println("A   输出分数");
		System.out.println("B   分数的四则运算");
		System.out.println("C   绝对值");
		System.out.println("D   相反数");
		System.out.println("E   倒数");
		System.out.println("F   退出");

	}

	public static void AutonomousComputing(Scanner sc) throws OrdinalNumberSelectionException, ExitException, OrdinalNumberSelectionException, ZeroDenominatorAnomaly, FormatError, Nullpointerexception {
		菜单2();
		String ne = "1";
		if (sc.hasNext()) {
			ne = sc.next();
		}
		switch (ne) {
		case "A":
			System.out.println("输入两个合法的数，得到一个分数，例如7*10^100，12，2.5，5/2，对于Object类（2.5）两个数必须一样类型");
			输出分数();
			break;
		case "B":
			System.out.println("输入两个分数，得出加减乘除结果");
			分数的四则运算();
			break;
		case "C":
			System.out.println("输入一个分数，得到绝对值");
			绝对值();
			break;
		case "D":
			System.out.println("输入一个分数，得到相反数");
			相反数();
			break;
		case "E":
			System.out.println("输入一个分数，得到倒数");
			倒数();
			break;
		case "F":
			throw new ExitException("玩家选择退出");
		default:
			throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);

		}
	}

	public static void 选择行为(Scanner sc) throws OrdinalNumberSelectionException, ExitException, OrdinalNumberSelectionException, ZeroDenominatorAnomaly, FormatError, Nullpointerexception {
		String ne = "1";
		if (sc.hasNext()) {
			ne = sc.next();
		}
		switch (ne) {
		case "A":
			Fractionalclasstest.查看功能();// 调用查看功能()函数
			break;
		case "B":
			Fractionalclasstest.AutonomousComputing(sc);// 调用AutonomousComputing(sc)函数
			break;
		case "C":
			Fractionalclasstest.测试数据(sc);// 调用AutonomousComputing(sc)函数
			break;
		case "F":
			throw new ExitException("玩家选择退出");
		default:
			throw new OrdinalNumberSelectionException("无法识别的序号:" + ne);

		}
	}
}

