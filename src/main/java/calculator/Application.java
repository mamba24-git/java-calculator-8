package calculator;

import camp.nextstep.edu.missionutils.Console;
import calculator.core.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        System.out.println("덧셈할 문자열을 입력해 주세요.\n");
        String raw = Console.readLine();

        InputLine line = new InputLine(raw);

        System.out.print("결과 : ");

        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }

        boolean hasCustom = line.hasCustom();
        Delimiters ds = Delimiters.delims(line.raw(), hasCustom);
        SumPart part = SumPart.sp_notCustom(line.raw(), hasCustom);

        StringScanner sc = new StringScanner(ds);

        int[] digits = sc.scan(part);

        Sum sum = new Sum();
        int i = 0;
        while (i < digits.length) {
            sum.sum_values(digits[i]);
            i = i + 1;
        }

        System.out.println(sum.toInt());
    }
}
