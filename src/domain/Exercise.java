package domain;

public class Exercise {
    private int[] time = new int[2];
    public void Calculate(){
        while(time[0] != 24)
        {
            time[1]++;
            if (time[1] == 60) 
            {
                time[1] = 0;
                time[0] += 1;
            }
            if (time[0] % 10 == time[1] / 10 && time[0] / 10 == time[1] % 10 ) {
                if (time[0] < 10)
                    System.out.println("0" +time[0]+":"+time[1]);
                else if(time[1] < 10)
                    System.out.println("" +time[0]+":0"+time[1]);
                else
                    System.out.println("" +time[0]+":"+time[1]);
            }
        }
    }
}
