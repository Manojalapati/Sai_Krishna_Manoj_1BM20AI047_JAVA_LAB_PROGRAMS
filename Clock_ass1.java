public class Clock_ass1 {
    int hours,min,sec;
    Clock_ass1(){}
    Clock_ass1(int h,int m,int s)
    {
        this.hours = h;
        this.min = m;
        this.sec = s;
    }
    Clock_ass1(int s)
    {
        min = s/60;
        sec= s%60;
        hours = min/60;
        min = min%60;
    }
    void setClock(int s)
    {
        min = s/60;
        sec= s%60;
        hours = min/60;
        min = min%60;
    }
    int gethours(){
        return this.hours;
    }
    int getmins(){
        return this.min;
    }
    int getsecs(){
        return this.sec;
    }
    void sethours(int h){
        this.hours = h;
    }
    void setmins(int m){
        this.min = m;
    }
    void setsecs(int s){
        this.sec = s;
    }
    void tick()
    {
        this.sec = this.sec + 1;
        if (sec >= 60)
        {
            min +=1;
            {
                if(min >=60)
                {
                    hours+=1;
                    if(hours>=24)
                        hours-=24;
                    min-=60;
                }
            }
            sec-=60;
        }
    }
    void addClock(Clock_ass1 obj)
    {
        this.hours += obj.hours;
        this.min += obj.min;
        this.sec += obj.sec;
        if (this.sec >= 60)
        {
            this.min +=1;
            this.sec -=60;
        }
        if (this.min >=60)
        {
            this.hours += this.min/60;
            this.min %= 60;
        }
        if(this.hours >= 24)
            this.hours %= 24;
    }
    String to_string()
    {
        return "hours:"+"min:"+"sec";
    }
    void tickdown()
    {
        this.sec = this.sec - 1;
    }
    Clock_ass1 subtractclock(Clock_ass1 obj)
    {

    }

}
class hello
