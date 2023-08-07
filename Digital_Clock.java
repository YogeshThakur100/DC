class digitalClock {
    public static void main(String args []) throws InterruptedException {
        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Enter hours: ");
            int hours = sc.nextInt();
            System.out.println("Enter Minutes : ");
            int minutes = sc.nextInt();
            System.out.println("Enter seconds : ");
            int Second = sc.nextInt();
            int delay = 1000;
            
            if (hours > 12 || minutes > 60 || Second > 60) {
                System.out.println("Error !");
                return;
            }

            while(true) {
                Second++;
                if (Second>59) {
                    minutes++;
                    Second=0;
                }
                if (minutes>59) {
                    hours++;
                    minutes = 0;
                }
                if (hours>12) {
                    hours = 1;
                }
                System.out.print("Clock : " + "\n");
                System.out.print(hours + "0:");
                System.out.print(minutes + "0:");
                System.out.println("0" + Second);
                Thread.sleep(delay);
            }
        }
    }
}