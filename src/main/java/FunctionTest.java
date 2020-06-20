import java.util.function.Function;

class FunctionExecutor {
    /**
     * 函数的使用；函数必须有输入和输出；
     *
     * @param inputType
     * @param function
     * @param <T>
     * @param <R>
     * @return
     */
    public <T,R> R execute(T inputType, Function<T,R> function) {
       return function.apply(inputType);
    }

}


public class FunctionTest {
    public static void main(String[] args) {
        FunctionExecutor fe = new FunctionExecutor();

        String ret = fe.execute("fda", input -> "result:" + input );
        System.out.println(ret);
    }
}
