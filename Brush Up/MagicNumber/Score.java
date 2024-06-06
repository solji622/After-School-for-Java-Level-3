package MagicNumber;

public class Score {
    public static final int COMMAND_MATH = 90;
    public static final int COMMAND_ENG = 90;
    public static final int COMMAND_SCI = 90;

    public void calculateAverage() {
        double resultSum = 0; // 결과를 실수형으로 저장
        resultSum += (COMMAND_MATH + COMMAND_ENG + COMMAND_SCI) / 3.0; // 정확한 평균 계산
        System.out.println("Average score: " + resultSum);
    }
}
