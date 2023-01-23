/*@author:小柯
 * 题目：分数类的运算
 *编写时间：2021/5/16
 */

/** @author 小柯
 * 
 * 自定义异常：

java提供的异常类，不够我们使用，需要自己定义一些异常类

格式：
       public class XXException extends Exception|RuntimeException{
          添加一个空参数的构造方法

          添加一个带异常信息的构造方法
}

注意：
       1.自定义异常类一般是以Exception结尾，说明该类是一个异常类

        2.自定义异常类，必须继承Exception或者RuntimeException

              继承Exception：那么自定义的异常类就是一个编译期异常，如果出现了编译期异常就必须处理，要么throws ，要么try catch

              继承RuntimeException：那么自定义的异常就是一个运行期异常，无需处理，交给虚拟机处理，中断处理。
 *
 */

package BigintegerFractionalClass;

class Nullpointerexception extends Exception {// 自定义的空指针异常
	public Nullpointerexception() {
	}

	public Nullpointerexception(String message) {
		super(message);
	}

	public Nullpointerexception(Throwable cause) {
		super(cause);
	}

	public Nullpointerexception(String message, Throwable cause) {
		super(message, cause);
	}

	public Nullpointerexception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class OrdinalNumberSelectionException extends Exception {// 自定义的OrdinalNumberSelectionException

	public OrdinalNumberSelectionException() {
	}

	public OrdinalNumberSelectionException(String message) {
		super(message);
	}

	public OrdinalNumberSelectionException(Throwable cause) {
		super(cause);
	}

	public OrdinalNumberSelectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public OrdinalNumberSelectionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class ZeroDenominatorAnomaly extends Exception {// 自定义的ZeroDenominatorAnomaly

	public ZeroDenominatorAnomaly() {
	}

	public ZeroDenominatorAnomaly(String message) {
		super(message);
	}

	public ZeroDenominatorAnomaly(Throwable cause) {
		super(cause);
	}

	public ZeroDenominatorAnomaly(String message, Throwable cause) {
		super(message, cause);
	}

	public ZeroDenominatorAnomaly(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class ExitException extends Exception {// 自定义的ExitException

	public ExitException() {
	}

	public ExitException(String message) {
		super(message);
	}

	public ExitException(Throwable cause) {
		super(cause);
	}

	public ExitException(String message, Throwable cause) {
		super(message, cause);
	}

	public ExitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

class FormatError extends Exception {// 自定义的FormatError异常

	public FormatError() {
	}

	public FormatError(String message) {
		super(message);
	}

	public FormatError(Throwable cause) {
		super(cause);
	}

	public FormatError(String message, Throwable cause) {
		super(message, cause);
	}

	public FormatError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}


