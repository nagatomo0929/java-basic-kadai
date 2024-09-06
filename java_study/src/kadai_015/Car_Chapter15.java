package kadai_015;

public class Car_Chapter15 {
    // フィールド
    private int gear = 1;    // ギア
    private int speed = 10;  // 速度

    // ギアチェンジメソッド
    public void gearChange(int afterGear) {
        // ギアが変わったかどうかを確認
        if (this.gear != afterGear) {
            System.out.println("ギア " + this.gear + " から " + afterGear + " に切り替えました。");
        }
        
        this.gear = afterGear;
        
        // ギアに応じた速度の設定
        switch (gear) {
            case 1:
                speed = 10;
                break;
            case 2:
                speed = 20;
                break;
            case 3:
                speed = 30;
                break;
            case 4:
                speed = 40;
                break;
            case 5:
                speed = 50;
                break;
            default:
                speed = 10;
                break;
        }
    }

    // 走行メソッド
    public void run() {
        System.out.println("現在のギアは " + gear + " 速で、速度は " + speed + " km/h です。");
    }
}
