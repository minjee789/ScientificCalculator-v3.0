public class AdvancedCalculator extends Calculator {

    //계산기 v3.0 곱하기 개발 완료
    //https://github.com/minjee789/Java-Calculator/issues/2
    @Override
    public int multiply()
    {
        result = num1 * num2;
        return 0;
    }

    //계산기 v3.o 나누기 개발 완료..
    //https://github.com/minjee789/Java-Calculator/issues/3
    @Override
    public int divide()
    {
        result = num1 / num2;
        return 0;
    }
}
//계산기 V3.0 나머지 연산자 개발 완료
class ScientificCalculator extends Calculator {
    public int mod() {
        result = num1 % num2;
        return 0;
    }
}
