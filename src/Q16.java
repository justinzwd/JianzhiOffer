public class Q16 {
    public double Power(double base, int exponent) {
        if(exponent == 0 && base == 0)
            throw new ArithmeticException("0的0次方没有意义");

        if(exponent == 0 && base != 0)
            return 1;

        if(exponent == 1)
            return base;

        int exponent1 = Math.abs(exponent);
        //exponent / 2
        //如果exponent是奇数，result还要再乘以base以此。如果是偶数，则不需要
        double result = Power(base, exponent1 / 2);
        result *= result;

        if(exponent1 % 2 == 1)
            result *= base;

        if(exponent > 0)
            return result;
        else
            return 1 / result;
    }
}