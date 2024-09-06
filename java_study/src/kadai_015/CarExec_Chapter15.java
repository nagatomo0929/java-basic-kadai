package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        // 車クラスのインスタンスを作成する
        Car_Chapter15 myCar = new Car_Chapter15();

        // ギアチェンジメソッドを実行する（引数に3を渡す）
        myCar.gearChange(3);

        // 走行メソッドを実行する
        myCar.run();
    }
}
