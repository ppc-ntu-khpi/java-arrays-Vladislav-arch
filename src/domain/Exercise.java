package domain;

public class Exercise {
    private int[] arr = new int[2];
    public void Calculate(){
        while(arr[0] != 24)
        {
            arr[1]++;
            if (arr[1] == 60) 
            {
                arr[1] = 0;
                arr[0] += 1;
            }
            if (arr[0] % 10 == arr[1] / 10 && arr[0] / 10 == arr[1] % 10 ) {
                if (arr[0] < 10)
                    System.out.println("0" +arr[0]+":"+arr[1]);
                else if(arr[1] < 10)
                    System.out.println("" +arr[0]+":0"+arr[1]);
                else
                    System.out.println("" +arr[0]+":"+arr[1]);
            }
        }
    }
}
