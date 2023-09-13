/**
 * 在这里给出对类 temp_calc 的描述。
 * 
 * @作者（你的名字）
 * @版本（一个版本号或者一个日期）
 */
public class temp_calc
  {
    public void celsiusToFahrenheit() { 
        double c;
        double f;
        c=10.0;
        f=c*(9/5)+32;
        System.out.println(c+"°C = "+f+"°F");
    }
    
    public void elapsedTime() { 
    int h, m, s;
    double temptime;
    double perc;
    h=10;
    m=16;
    s=20;
    temptime=(h*60*60+m*60+s);
    perc=(temptime/86400)*100;
    System.out.print("The current time is "+h+":"+m+":"+s+".");
    System.out.println(" It has been "+(h*60*60+m*60+s)+" seconds since the day began.");
    System.out.println("There are "+(86400-(h*60*60+m*60+s))+" seconds left in the day.");
    System.out.println("The day is "+perc+"% done.");
  }
   public void secondsToHMS() {  
    int sec=7500;
    System.out.print(sec+" seconds = "+sec/3600+" hours, "+((sec%3600)/60));
    System.out.println(" minutes, and "+sec%60+" seconds.");
    }
    
}
