package racingcar;

public class Output {

    public enum Message {
        FOR_CAR_NAME("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)"),
        FOR_TRY_COUNT("시도할 회수는 몇회인가요?"),
        RESULT("\n실행 결과"),
        ;

        private final String label;

        Message(String label) {
            this.label = label;
        }

        public String label() {
            return label;
        }
    }

    // 경주할 자동차 이름을 입력하라는 메세지를 출력합니다.
    public static void promptForCarName()
    {
        System.out.println(Message.FOR_CAR_NAME.label());
    }

    // 시도할 회수를 입력하라는 메세지를 출력합니다.
    public static void promptForTryCount() {
        System.out.println(Message.FOR_TRY_COUNT.label());
    }

    // 각 차수별 실행 결과를 출력합니다.
    public static void printResult() {
        System.out.println(Message.RESULT.label());
    }

    public static void printRoundResults(String name, int count) {
        System.out.println(name + " : " + "-".repeat(count));
    }

    public static void printLine()
    {
        System.out.println();
    }

    // TODO : 우승자를 출력합니다. 공동 우승자일 경우 쉼표를 이용하여 구분합니다.

}
