public class Main {
    public static void main(String[] args) {

        Time time1 = new Time(8, 9, 58);
        System.out.println("EXPECTED RESULT: 08:09:58");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();


        for (int i = 0; i < 3; i++) {
            time1.tick();
            System.out.println("EXPECTED RESULT: [time incremented by one second]");
            System.out.println("ACTUAL RESULT: " + time1);
            System.out.println();
        }


        time1 = new Time(8, 59, 59);
        time1.tick();
        System.out.println("EXPECTED RESULT: 09:00:00");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();


        time1 = new Time(23, 59, 59);
        time1.tick();
        System.out.println("EXPECTED RESULT: 00:00:00");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();


        Time time2 = new Time(1, 2, 3);
        time1.addTime(time2);
        System.out.println("EXPECTED RESULT: 01:02:03");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();


        time1 = new Time(23, 59, 50);
        time2 = new Time(0, 0, 15);
        time1.addTime(time2);
        System.out.println("EXPECTED RESULT: 00:00:05");
        System.out.println("ACTUAL RESULT: " + time1);
        System.out.println();

        time1 = new Time(10, 10, 10);
        for (int i = 0; i < 5; i++) {
            time2 = new Time(0, 0, 59);
            time1.addTime(time2);
            System.out.println("EXPECTED RESULT: [time incremented by 59 seconds, rolling over when necessary]");
            System.out.println("ACTUAL RESULT: " + time1);
            System.out.println();
        }
    }
}
