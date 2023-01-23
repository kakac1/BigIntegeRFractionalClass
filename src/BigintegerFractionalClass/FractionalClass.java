/*@author:小柯
 * 题目：分数类的运算
 *编写时间：2021/5/16
 */
/**fraction z = new fraction(3,12);
		System.out.println("传入两个int类型的的两个值分数为"+z);
		fraction z1 = new fraction(2.6);
		System.out.println("传入两个String类型的的两个值分数为"+z1);
		fraction z2 = new fraction(1,"3");
		fraction z3 = new fraction("3",1);
		System.out.println("传入一个为int一个为String类型的两个值分数为"+z2+"\t"+z3);
		fraction z4 = new fraction(-6);
		System.out.println("传入单个int类型的值的分数为"+z4);
		fraction z5 = new fraction("-9");
		System.out.println("传入单个String类型的值分数为"+z5);
		fraction z6 = new fraction(-2.5);
		System.out.println("传入含.点Object类型的值的分数为"+z6);
		fraction z7 = new fraction("3/2");
		System.out.println("传入含/的String类类型的值的分数为"+z7);
        System.out.println("可直接输入四个int值相当于两个分数相加:"+fraction.getadd(6, 2, 1, 8));// 加
        System.out.println("可直接输入四个String值相当于两个分数相加:"+fraction.getadd("3","6","9","8"));// 加
        System.out.println("可直接输入四个int值相当于两个分数相除:"+fraction.getsub(7, 2, 9, 8));// 减
        System.out.println("可直接输入四个String值相当于两个分数相除:"+fraction.getsub("3","6","9","8"));// 减
        System.out.println("可直接输入四个int值相当于两个分数相乘:"+fraction.getmultiply(6, 2, 1, 8));// 乘
        System.out.println("可直接输入四个String值相当于两个分数相乘:"+fraction.getmultiply("4","5","9","8"));// 乘
        System.out.println("可直接输入四个int值相当于两个分数相除:"+fraction.getdivide(6, 4, 1, 8));// 除
        System.out.println("可直接输入四个String值相当于两个分数相除:"+fraction.getdivide("5","6","9","8"));// 除
        System.out.println("两个分数相加:"+z.add(z2));// 两个数加
        System.out.println("两个分数相减:"+z.sub(z3));// 两个数减
        System.out.println("两个分数相乘:"+z.multiply(z4));// 两个数加
        System.out.println("两个分数相除:"+z.divide(z5));// 两个数加
		fraction z8 = new fraction(9,-1);
		System.out.println("可以将分子分母符号统一化："+z8);
		fraction z9 = new fraction(2.5,2.5);
		System.out.println("可以输入两个小数点的数得到分数："+z9);
		fraction z10 = new fraction(2.5,-2.5);
		System.out.println("可以输入两个小数点的数得到分数："+z10);
		System.out.println("可直接输入两个Object值得出一个分数:"+fraction.fenshu(2.5, 2.5));
		测试结果：
		传入两个int类型的的两个值分数为1/4
                 传入两个String类型的的两个值分数为13/5
                传入一个为int一个为String类型的两个值分数为1/3	3
                传入单个int类型的值的分数为-6
                传入单个String类型的值分数为-9
                传入含.点Object类型的值的分数为-3/2
                传入含/的String类类型的值的分数为3/2
                可直接输入四个int值相当于两个分数相加:25/8
                可直接输入四个String值相当于两个分数相加:13/8
                可直接输入四个int值相当于两个分数相除:19/8
                可直接输入四个String值相当于两个分数相除:-5/8
                可直接输入四个int值相当于两个分数相乘:3/8
                可直接输入四个String值相当于两个分数相乘:9/10
                可直接输入四个int值相当于两个分数相除:12
                可直接输入四个String值相当于两个分数相除:20/27
                两个分数相加:7/12
                两个分数相减:-11/4
                两个分数相乘:-3/2
                两个分数相除:-1/36
                可以将分子分母符号统一化：-9
                可以输入两个小数点的数得到分数：1
                可以输入两个小数点的数得到分数：-5/3
                可直接输入两个Object值得出一个分数:1
 */
package BigintegerFractionalClass;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Fraction {// 定义一个fraction分数类
	{
		p1 = new BigInteger(String.valueOf(1));
		q1 = new BigInteger(String.valueOf(0));// 初始化默认分子分母为1
		/*
		 * valueOf()函数用于返回指定对象的原始值。该方法属于Object对象，由于所有的对象都"继承"了Object的对象实例，
		 * 因此几乎所有的实例对象都可以使用该方法。 所有主流浏览器均支持该函数。
		 */
	}
	private BigInteger p1;// 分数类的分子，一但生成对象，值就不可改变。
	private BigInteger q1;// 分数类的分母，一但生成对象，值就不可改变。

	public Fraction(BigInteger p1, BigInteger q1) {// 构造方法 BigInteger直接初始化
		this.p1 = p1;
		this.q1 = q1;
	}

	public Fraction(int p1, int q1) {// int类型先将int类转换成String类然后将String转换成Biginteger类初始化
		this.p1 = new BigInteger(Integer.toString(p1));// Integer.toString(p1);//把p1转换成string
		this.q1 = new BigInteger(Integer.toString(q1));
		BigInteger common = Getgreatcommon(this);// 调用自定义的Getgreatcommon函数求出最大公约数
		try {
			BigInteger a = (this.q1).divide(common);
			BigInteger b = (this.p1).divide(common);
			this.p1 = b;
			this.q1 = a;
		} catch (Exception e) {// 可能会出现分母不能为0的异常，捕捉异常，抛出异常
			
		}
	}

	public Fraction(String p1, String q1) throws Nullpointerexception {// 将String类转换成Biginteger类初始化,String可以直接赋值Biginteger
		if (p1.length() == 0 || q1.length() == 0) {// 判断String是否为空指针
			throw new Nullpointerexception("空字符串");
		} else {// 否者初始化
			this.p1 = new BigInteger(p1);
			this.q1 = new BigInteger(q1);
		}
	}

	public Fraction(Object m, Object n) throws FormatError {// 输入两个含小数点的数//
		// 看作两个分数相除
		Fraction fenzi = new Fraction(0, 0);// 所得结果的分子
		Fraction fenmu = new Fraction(0, 0);// 所得结果的分母
		Fraction fenshu = new Fraction(0, 0);// 要输出的分数类
		String xiaoshu1 = String.valueOf(m);// 将Object类转换成String类//对第一个Object类进行操作
		if (xiaoshu1.contains(".") || GetCount(xiaoshu1, ".") == 1) {// 判断String是否含有.如果有且。只有一个则进行以下操作
			/* 如果字符串中包含只等的字符或字符串时，java.lang.String.contains()方法返回true。 */
			String[] array1 = new String[2];
			array1 = xiaoshu1.split("\\.");// 讲分割的值分别存在array1数组中
			/*
			 * split 方法 将一个字符串分割为子字符串，然后将结果作为字符串数组返回。
			 */
			int a = Integer.parseInt(array1[0]);
			int b = Integer.parseInt(array1[1]);
			int length = array1[1].length();
			int FenZi = (int) (a * Math.pow(10, length) + b);// 将小数点后的数乘相应10的次方化成分子
			int FenMu = (int) Math.pow(10, length);// 分母就是10小数点后的1长度次方
			fenzi.p1 = new BigInteger(Integer.toString(FenZi));
			fenzi.q1 = new BigInteger(Integer.toString(FenMu));
			BigInteger greatcommon = Getgreatcommon(fenzi);// 求出最大公约数
			fenzi.p1 = (fenzi.p1).divide(greatcommon);
			fenzi.q1 = (fenzi.q1).divide(greatcommon);
		} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
			throw new FormatError("FormatError");
		}
		String xiaoshu2 = String.valueOf(n);// 对第二个Object类进行操作
		if (xiaoshu2.contains(".") || GetCount(xiaoshu1, ".") == 1) {// 操作和第一个类操作相同
			String[] array2 = new String[2];
			array2 = xiaoshu2.split("\\.");
			int a2 = Integer.parseInt(array2[0]);
			int b2 = Integer.parseInt(array2[1]);
			int length = array2[1].length();
			int FenZi2 = (int) (a2 * Math.pow(10, length) + b2);
			int FenMu2 = (int) Math.pow(10, length);
			fenmu.p1 = new BigInteger(Integer.toString(FenZi2));
			fenmu.q1 = new BigInteger(Integer.toString(FenMu2));
			BigInteger greatcommon2 = Getgreatcommon(fenmu);
			fenmu.p1 = (fenmu.p1).divide(greatcommon2);
			fenmu.q1 = (fenmu.q1).divide(greatcommon2);
		} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
			throw new FormatError("FormatError");
		}
		fenshu = fenzi.Divide(fenmu);// 最后将第一个和第二个Object进行整合
		this.p1 = fenshu.p1;
		this.q1 = fenshu.q1;
	}

	public Fraction(BigInteger p1, int q1) {// 构造BigInteger p1, int q1的方法
		this.p1 = p1;
		this.q1 = new BigInteger(Integer.toString(q1));
	}

	public Fraction(BigInteger p1, String q1) {// 构造BigInteger p1, String q1的方法
		this.p1 = p1;
		this.q1 = new BigInteger(q1);
	}

	public Fraction(int p1, BigInteger q1) {// 构造int p1, BigInteger q1的方法
		this.p1 = new BigInteger(Integer.toString(p1));
		this.q1 = q1;
	}

	public Fraction(String p1, BigInteger q1) throws Nullpointerexception {// 构造String p1,
		// BigInteger q1的方法
		if (p1.length() == 0) {
			throw new Nullpointerexception("空字符串");
		} else {
			this.p1 = new BigInteger(p1);
			this.q1 = q1;
		}

	}

	public Fraction(int p1, String q1) throws Nullpointerexception {// 构造int p1, String q1的方法
		if (q1.length() == 0) {// 判断输入的string是否为空指针，如果有抛出Nullpointerexception
			throw new Nullpointerexception("空字符串");
		} else {
			this.p1 = new BigInteger(Integer.toString(p1));
			this.q1 = new BigInteger(q1);
		}
	}

	public Fraction(String p1, int q1) throws Nullpointerexception {// 构造String p1, int q1的方法
		if (p1.length() == 0) {// 判断输入的string是否为空指针，如果有抛出Nullpointerexception
			throw new Nullpointerexception("空字符串");
		} else {
			this.p1 = new BigInteger(p1);
			this.q1 = new BigInteger(Integer.toString(q1));
		}
	}

	public Fraction(BigInteger p1) {// 如果只输入一个Biginteger值的话，相当于分母等于1
		this.p1 = p1;
		this.q1 = new BigInteger(Integer.toString(1));
	}

	public Fraction(int p1) {
		this.p1 = new BigInteger(Integer.toString(p1));// String.valueOf(p1);//把p1转换成string
		this.q1 = new BigInteger(Integer.toString(1));
	}

	public Fraction(String p1) throws FormatError, Nullpointerexception {
		String xiaoshu = String.valueOf(p1);// 将Object类转换成String类
		if (p1.length() == 0) {// 判断输入的string是否为空指针，如果有抛出Nullpointerexception
			throw new Nullpointerexception("空字符串");
		} else if (xiaoshu.contains("/") || GetCount(xiaoshu, "/") == 1) {// 判断String中是否含有
			String[] array2 = new String[2];
			array2 = xiaoshu.split("/");// split()：拆分字符串。通过指定分隔符对字符串进行切片，并返回分割后的字符串列表//
			// 识别小数点，将小数分成整数和小数部分
			int a2 = Integer.parseInt(array2[0]);// 获取整数部分
			int b2 = Integer.parseInt(array2[1]);// 获取小数部分
			this.p1 = new BigInteger(Integer.toString(a2));// Integer.toString(p1);//
			// 把p1转换成string
			this.q1 = new BigInteger(Integer.toString(b2));
		} else {
			Pattern pattern = Pattern.compile("^-\\d+");// ^ 表示匹配字符串的开始
			Matcher isNum = pattern.matcher(p1);// 用正则表达式判断一个字符串是否全是数字
			if (isNum.matches()) {
				this.p1 = new BigInteger(p1);
				this.q1 = new BigInteger(Integer.toString(1));
			} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
				throw new FormatError("FormatError");
			}
		}
	}

	public Fraction(Object f) throws FormatError, Nullpointerexception {// 输入的值为3.14或3/4初始化
		if (f == null) {// 判断输入的string是否为空指针，如果有抛出Nullpointerexception
			throw new Nullpointerexception("空字符串");
		}
		String xiaoshu = String.valueOf(f);// 将Object类转换成String类
		if (xiaoshu.contains(".") || GetCount(xiaoshu, ".") == 1) {
			/*
			 * 当不区分大小写时，string.IndexOf方法的效率明显高于string.Contains方法；
			 * 当区分大小写时，string.Contains方法的效率明显高于string.IndexOf方法；
			 * 如果判断的是中文，没有大小写之分，还是string.Contains方法的效率高
			 */

			String[] array1 = new String[2];
			array1 = xiaoshu.split("\\.");// split()：拆分字符串。通过指定分隔符对字符串进行切片，并返回分割后的字符串列表////
											// 识别小数点，将小数分成整数和小数部分
			int a = Integer.parseInt(array1[0]);// 获取整数部分
			int b = Integer.parseInt(array1[1]);// 获取小数部分
			int length = array1[1].length();// 获取长度
			int FenZi = (int) (a * Math.pow(10, length) + b);
			int FenMu = (int) Math.pow(10, length);// 分母部分就相当于最大的小数点位置乘它相应10的次方
			this.p1 = new BigInteger(Integer.toString(FenZi));// Integer.toString(p1);//
																// 把p1转换成string
			this.q1 = new BigInteger(Integer.toString(FenMu));
			BigInteger greatcommon = Getgreatcommon(this);// 求出最大公约数
			this.p1 = (this.p1).divide(greatcommon);
			this.q1 = (this.q1).divide(greatcommon);
		} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
			throw new FormatError("FormatError");
		}
	}

	public Fraction Add(Fraction f) {// 加法运算// 返回的是我们自己定义的fraction类
		Fraction sul = new Fraction(0, 0);
		sul.p1 = ((this.p1.multiply(f.q1)).add(f.p1.multiply(this.q1)));// Biginteger有自己的加减乘除的算法函数
		sul.q1 = this.q1.multiply(f.q1);
		sul = Sign(sul);// 调用sign函数，将分子分母符号化
		BigInteger greatcommon = Getgreatcommon(sul);// 求出最大公约数
		sul.p1 = sul.p1.divide(greatcommon);// 将分子分母同时除最大公约数，相当于化简
		sul.q1 = sul.q1.divide(greatcommon);
		return sul;
	}

	public Fraction Sub(Fraction f) {// 分数减法运算

		Fraction sul = new Fraction(0, 0);// 先定义一个sul分数类用来储存运算结果
		sul.p1 = (this.p1.multiply(f.q1)).subtract(f.p1.multiply(this.q1));
		sul.q1 = this.q1.multiply(f.q1);
		sul = Sign(sul);
		BigInteger greatcommon = Getgreatcommon(sul);// 求出最大公约数
		sul.p1 = sul.p1.divide(greatcommon);// 将分子分母同时除最大公约数，相当于化简
		sul.q1 = sul.q1.divide(greatcommon);
		return sul;
	}

	public Fraction Multiply(Fraction f) {// 分数乘法运算
		Fraction sul = new Fraction(0, 0);
		sul.p1 = p1.multiply(f.p1);
		sul.q1 = q1.multiply(f.q1);
		sul = Sign(sul);
		BigInteger greatcommon = Getgreatcommon(sul);// 求出最大公约数
		sul.p1 = sul.p1.divide(greatcommon);// 将分子分母同时除最大公约数，相当于化简
		sul.q1 = sul.q1.divide(greatcommon);
		return sul;
	}

	public Fraction Divide(Fraction f) {// 分数除法运算
		Fraction sul = new Fraction(0, 0);
		sul.p1 = this.p1.multiply(f.q1);
		sul.q1 = this.q1.multiply(f.p1);
		sul = Sign(sul);
		BigInteger greatcommon = Getgreatcommon(sul);// 求出最大公约数
		sul.p1 = (sul.p1).divide(greatcommon);
		sul.q1 = (sul.q1).divide(greatcommon);// 将分子分母同时除最大公约数，相当于化简
		return sul;
	}

	public Fraction Add(String m, String n) throws FormatError, Nullpointerexception {// 两个分数相加
		Fraction sul = new Fraction(0, 0);
		Fraction a = new Fraction(0, 0);
		Fraction b = new Fraction(0, 0);
		a = Fraction.Fenshu(m);
		b = Fraction.Fenshu(n);
		sul = a.Add(b);
		return sul;
	}

	public Fraction Getsub(String m, String n) throws FormatError, Nullpointerexception {// 两个分数相减
		Fraction sul = new Fraction(0, 0);
		Fraction a = new Fraction(0, 0);
		Fraction b = new Fraction(0, 0);
		a = Fraction.Fenshu(m);
		b = Fraction.Fenshu(n);
		sul = a.Sub(b);
		return sul;
	}

	public Fraction Getmultiply(String m, String n) throws FormatError, Nullpointerexception {// 两个分数相乘
		Fraction sul = new Fraction(0, 0);
		Fraction a = new Fraction(0, 0);
		Fraction b = new Fraction(0, 0);
		a = Fraction.Fenshu(m);
		b = Fraction.Fenshu(n);
		sul = a.Multiply(b);
		return sul;
	}

	public Fraction Getdivide(String m, String n) throws FormatError, Nullpointerexception {
		// 两个分数相除
		// 因为运用了Fenshu函数所以要抛出异常，等待main函数统一处理
		Fraction sul = new Fraction(0, 0);
		Fraction a = new Fraction(0, 0);
		Fraction b = new Fraction(0, 0);
		a = Fraction.Fenshu(m);
		b = Fraction.Fenshu(n);
		sul = a.Divide(b);
		return sul;
	}

	public static Fraction Fenshu(String p1) throws FormatError, Nullpointerexception {// 将String类分数转换成分数
		Fraction sul = new Fraction(0, 0);
		String xiaoshu = String.valueOf(p1);// 将Object类转换成String类
		if (p1.length() == 0) {// 判断输入的string是否为空指针，如果有抛出Nullpointerexception
			throw new Nullpointerexception("空字符串");
		} else if (xiaoshu.contains("/") || GetCount(xiaoshu, "/") == 1) {// 判断String中是否含有/
			String[] array2 = new String[2];
			array2 = xiaoshu.split("/");// split()：拆分字符串。通过指定分隔符对字符串进行切片，并返回分割后的字符串列表//
			// 识别小数点，将小数分成整数和小数部分
			int a2 = Integer.parseInt(array2[0]);// 获取整数部分
			int b2 = Integer.parseInt(array2[1]);// 获取小数部分
			sul.p1 = new BigInteger(Integer.toString(a2));// Integer.toString(p1);//
															// 把p1转换成string
			sul.q1 = new BigInteger(Integer.toString(b2));
		} else {
			Pattern pattern = Pattern.compile("[0-9]*");
			Matcher isNum = pattern.matcher(p1);// 用正则表达式判断一个字符串是否全是数字
			if (isNum.matches()) {
				sul.p1 = new BigInteger(p1);
				sul.q1 = new BigInteger(Integer.toString(1));
			} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
				throw new FormatError("FormatError");
			}

		}
		return sul;
	}

	private static Fraction Sign(Fraction f) {// 将分数分子和分母的符号同一换到分子上

		BigInteger zero = new BigInteger(Integer.toString(0));
		BigInteger fone = new BigInteger(Integer.toString(-1));
		if (f.q1.compareTo(zero) < 0) {// 如果分母小于零，分子乘于-1
			f.p1 = f.p1.multiply(fone);
			f.q1 = f.q1.multiply(fone);
		}
		return f;// 返回分数类
	}

	private static BigInteger Getgreatcommon(Fraction z) {// 判断分数是否存在可约，如果可约找出公约数

		BigInteger common;// 定义分子和分母的公约数
		BigInteger one = new BigInteger(String.valueOf(1));// 将1转化成大整数类型
		BigInteger zero = new BigInteger(String.valueOf(0));// 将0转化成大整数类型
		BigInteger x = z.p1.abs();
		BigInteger y = z.q1.abs();
		if (x.compareTo(y) < 0) {// 将分子，分母从大到小排序，以便于后续的找最大公约数
			BigInteger c = x;
			x = y;
			y = c;
		}
		for (common = x; common.compareTo(one) > 0; common = common.subtract(one)) {
			BigInteger rema1 = x.remainder(common);
			BigInteger rema2 = y.remainder(common);
			if (rema1.equals(zero) && rema2.equals(zero)) {// java大整数数取余：//
				// 类方法：BigInteger.divideAndRemainder（）
				break;
			}
		}
		return common;
	}

	private static int GetCount(String str, String key) {// 用来判断object中含有几个.和/
		if (str == null || key == null || "".equals(str.trim()) || "".equals(key.trim())) {
			/*
			 * trim()的作用是去掉字符串两端的多余的空格，注意，是两端的空格，且无论两端的空格有多少个都会去掉，当然中间的那些空格不会被去掉
			 */

			return 0;
		}
		int count = 0;
		int index = 0;
		while ((index = str.indexOf(key, index)) != -1) {
			index = index + key.length();
			count++;
		}
		return count;
	}

	public static Fraction Getadd(Fraction a, Fraction b) {// 两个分数相加
		Fraction sul = new Fraction(0, 0);
		sul = a.Add(b);
		return sul;
	}

	public static Fraction Getsub(Fraction a, Fraction b) {// 两个分数相减
		Fraction sul = new Fraction(0, 0);
		sul = a.Sub(b);
		return sul;
	}

	public static Fraction Getmultiply(Fraction a, Fraction b) {// 两个分数相乘
		Fraction sul = new Fraction(0, 0);
		sul = a.Multiply(b);
		return sul;
	}

	public static Fraction Getdivivide(Fraction a, Fraction b) {// 两个分数相除
		Fraction sul = new Fraction(0, 0);
		sul = a.Divide(b);
		return sul;
	}

	public static Fraction Fenshu(Object m, Object n) throws FormatError {// 输入两个含小数点的数
		Fraction sul = new Fraction(0, 0);// 看作两个分数相除
		Fraction fenzi = new Fraction(0, 0);
		Fraction fenmu = new Fraction(0, 0);
		Fraction fenshu = new Fraction(0, 0);
		String xiaoshu1 = String.valueOf(m);// 将Object类转换成String类
		if (xiaoshu1.contains(".") || GetCount(xiaoshu1, ".") == 1) {
			String[] array1 = new String[2];
			array1 = xiaoshu1.split("\\.");
			int a = Integer.parseInt(array1[0]);
			int b = Integer.parseInt(array1[1]);
			int length = array1[1].length();
			int FenZi = (int) (a * Math.pow(10, length) + b);
			int FenMu = (int) Math.pow(10, length);
			fenzi.p1 = new BigInteger(Integer.toString(FenZi));
			fenzi.q1 = new BigInteger(Integer.toString(FenMu));
			BigInteger greatcommon = Getgreatcommon(fenzi);// 求出最大公约数
			fenzi.p1 = (fenzi.p1).divide(greatcommon);
			fenzi.q1 = (fenzi.q1).divide(greatcommon);
		} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
			throw new FormatError("FormatError");
		}
		String xiaoshu2 = String.valueOf(n);
		if (xiaoshu2.contains(".") || GetCount(xiaoshu1, ".") == 1) {
			String[] array2 = new String[2];
			array2 = xiaoshu2.split("\\.");
			int a2 = Integer.parseInt(array2[0]);
			int b2 = Integer.parseInt(array2[1]);
			int length = array2[1].length();
			int FenZi2 = (int) (a2 * Math.pow(10, length) + b2);
			int FenMu2 = (int) Math.pow(10, length);
			fenmu.p1 = new BigInteger(Integer.toString(FenZi2));
			fenmu.q1 = new BigInteger(Integer.toString(FenMu2));
			BigInteger greatcommon2 = Getgreatcommon(fenmu);
			fenmu.p1 = (fenmu.p1).divide(greatcommon2);
			fenmu.q1 = (fenmu.q1).divide(greatcommon2);
		} else {// 如果全都不符合，说明输入的string不符合我们的格式，抛出异常，等待main函数统一处理
			throw new FormatError("FormatError");
		}
		fenshu = fenzi.Divide(fenmu);
		sul.p1 = fenshu.p1;
		sul.q1 = fenshu.q1;
		return sul;
	}

	public static Fraction Simplify(Fraction f) {// 对分数进行化简
		BigInteger common = Getgreatcommon(f);// 求出最大公约数
		f.p1 = (f.p1).divide(common);
		f.q1 = (f.q1).divide(common);
		return f;
	}

	public static Fraction Reciprocal(Fraction f) {// 分数的倒数
		Fraction sul = new Fraction(0, 0);
		sul.p1 = f.q1;
		sul.q1 = f.p1;
		return sul;
	}

	public static Fraction Strains(Fraction f) {// 分数的相反数
		Fraction sul = new Fraction(1, 1);
		sul.p1 = f.p1;
		sul.q1 = f.q1;
		sul = Negone.Multiply(sul);
		return sul;
	}

	public static Fraction Abs(Fraction f) {// 分数的绝对值
		Fraction sul = new Fraction(1, 1);
		sul.p1 = f.p1.abs();
		sul.q1 = f.q1.abs();
		return sul;
	}

	public static boolean Equal(Fraction m, Fraction n) {// 判断分数是否相等
		if (m.p1 == n.p1 || m.q1 == n.q1) {
			return true;
		} else {
			return false;
		}

	}

	public static BigInteger Fenmucommon(Fraction m, Fraction n) {// 得到分母的最大公约数
		BigInteger common;
		BigInteger one = new BigInteger(String.valueOf(1));// 将1转化成大整数类型
		BigInteger x = m.q1.abs();
		BigInteger y = n.q1.abs();
		if (m.q1.compareTo(one) == 0) {
			x = m.p1.abs();
		}
		if (n.q1.compareTo(one) == 0) {
			y = n.p1.abs();
		}
		if (x.compareTo(y) < 0) {// 将分子，分母从大到小排序，以便于后续的找最大公约数
			BigInteger c = x;
			x = y;
			y = c;
		}
		common = x.gcd(y);// 求大公约数
		return common;
	}

	@Override
	public String toString() {
		BigInteger zero = new BigInteger(String.valueOf(0));// 将0转化成大整数类型
		BigInteger one = new BigInteger(String.valueOf(1));// 将1转化成大整数类型
		BigInteger greatcommon = Getgreatcommon(this);// 求出最大公约数
		Sign(this);
		this.p1 = (this.p1).divide(greatcommon);
		this.q1 = (this.q1).divide(greatcommon);
		if (this.p1.equals(zero)) {
			return "0";
		}
		if (this.q1.equals(one)) {
			return "" + this.p1;
		}
		return this.p1 + "/" + this.q1;
	}

	/* 静态成员区，常用分数在这里定义 */
	public static final Fraction Zero = new Fraction(0, 1);// 分数0
	public static final Fraction One = new Fraction(1, 1);// 分数1
	public static final Fraction Ten = new Fraction(10, 1);
	public static final Fraction Half = new Fraction(1, 2);
	public static final Fraction Quarter = new Fraction(1, 4);
	public static final Fraction Negone = new Fraction(-1, 1);

}




