package homework6;

public class Animal {
    private final int maxRunLength;
    private final int maxSwimLength;
    /* В принципе, следующие параметры не обязательны в данном случае. Можно было ограничится максимальным расстоянием равном нулю.
     * Но логически, возможна ситуация когда кот умеет держаться на воде и не тонуть, а вот проплыть расстояние не может.
     * В таком случае его максимальное расстояние будет равно нулю, но чисто в теории плавать он умеет, не тонет, значит параметр умения будет true.
     * И обратно, могут быть животные умеющие плавать, не умеющие бегать, но способные стоять на одном месте.*/
    private final boolean knowsRun;
    private final boolean knowsSwim;
    /* Как я понимаю, минус данного метода в том, что мы отслеживаем только количество созданных объектов с момента запуска программы и
     * не отслеживаем количество активных объектов в куче. Т.е. если к обьекту больше не обращаются, то через какое-то время он будет удален из памяти,
     * а счетчик это ни как не отобразит. Но способа посчитать активные объекты в памяти я не знаю. */
    static int numberObjects = 0;

    public Animal(int maxRunLength, int maxSwimLength, boolean knowsRun, boolean knowsSwim) {
        numberObjects++;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.knowsRun = knowsRun;
        this.knowsSwim = knowsSwim;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }

    public boolean isRun() {
        return knowsRun;
    }

    public boolean isKnowsSwim() {
        return knowsSwim;
    }

    public void swimind(int distanceSwim) {
        if (knowsSwim && distanceSwim <= maxSwimLength) {
            System.out.println(" проплыл " + distanceSwim + "m");
        } else {
            System.out.println(" не проплыл " + distanceSwim + "m");
        }
    }

    public void runind(int distanceRun) {
        if (knowsRun && distanceRun <= maxRunLength) {
            System.out.println(" пробежал " + distanceRun + "m");
        } else {
            System.out.println(" не пробежал " + distanceRun + "m");
        }
    }
}