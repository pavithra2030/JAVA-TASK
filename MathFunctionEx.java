import java.lang.Math;
public class MathFunctionEx{
	public static void main(String args[]){

//abs()-returns the absolute value of parameter 
	System.out.println("abs(): "+ Math.abs(40.123));
//cbrt()-retruns the cube root of parameter values
	System.out.println("cbrt(): "+ Math.cbrt(27));
//sqrt()-retruns the square root of parameter values
	System.out.println("sqrt(): "+ Math.sqrt(9));

//signum()-retruns the sign of parameter
	System.out.println("signum(): "+ Math.signum(10));

//rint()-returns the double value that is closest to parameter that is equal to mathematical integer
	System.out.println("rint(): "+ Math.rint(5.20));
//ceil()-returns the value of parameter rounded upto its nearest integer
	System.out.println("ceil(): "+ Math.ceil(-0.87));
//floor()-returns the value of parameter rounded downto its nearset integer
	System.out.println("floor(): "+ Math.floor(5.88));
//random()-returns the random number between 0 and 1
	System.out.println("random(): "+ Math.random());
//pow()-returns the value of parameter 1 to the power of parameter 2
	System.out.println("pow(): "+ Math.pow(5,2));
//max()-returns the number with highest value
	System.out.println("max(): "+ Math.max(-22,22));
//min()-returns the number with lowest value
	System.out.println("min(): "+ Math.min(-22,22));
///copySign()-returns the first floating parameter with sign of second floating parameter
	System.out.println("copySign(): "+ Math.copySign(5,-3));

//exp()-returns the value of e^x
	System.out.println("exp(): "+ Math.exp(2));
//expm1()-returns the value of e^x-1
	System.out.println("expm1(): "+ Math.expm1(2));
//getExponent()-returns the unbiased exponent used in parameter
	System.out.println("getExponent(): "+ Math.getExponent(1234.5678));
//hypot()-returns sqrt(x^2+y^2) without intermediate of overflow or underflow
	System.out.println("hypot(): "+ Math.hypot(3,5));
//IEEEremainder()-retruns the IEEE754 standard value a/b=value,a-(b*value),a-value
	System.out.println("IEEEremainder(): "+ Math.IEEEremainder(10,3));

//netAfter()-retruns the floating number adjacent to the parameter one in the direction to the parameter 2+ 
	System.out.println("nextafter(): "+ Math.nextAfter(2,5));

//nextUp()-retruns the floating point value agjacent to parameter in the direction of positive infinity
	System.out.println("nextUp(): "+ Math.nextUp(2));	
//round()-retruns the parameter rounded to its nearest integer
	System.out.println("round(): "+ Math.round(2.5));	

	System.out.println("acos(): "+ Math.acos(-1));

	System.out.println("asin(): "+ Math.asin(-1));

	System.out.println("atan(): "+ Math.atan(-1));

	System.out.println("atan2(): "+ Math.atan2(1,2.5));

	System.out.println("cos(): "+ Math.cos(1));

	System.out.println("cosh(): "+ Math.cosh(1));

	System.out.println("log(): "+ Math.log(1));

	System.out.println("log10(): "+ Math.log10(10));

	System.out.println("log1p(): "+ Math.log1p(10));

	System.out.println("sin(): "+ Math.sin(0.2));

	System.out.println("sinh(): "+ Math.sinh(2.5));

	System.out.println("tan(): "+ Math.tan(2.5));

	System.out.println("tanh(): "+ Math.tanh(2.5));

	System.out.println("toDegrees(): "+ Math.toDegrees(Math.PI/4));

	System.out.println("toRadians(): "+ Math.toRadians(45));

	System.out.println("ulp(): "+ Math.ulp(45));

	}
}
