public class Sports {
    void playerCount(){}
}

class Cricket extends Sports{


    void playerCount() {
        System.out.println("11");
    }
}

class Football extends Sports{
    Football (String x){
        System.out.println("Team :- " + x);
    }
}

class OneBounce extends Cricket{
    @Override
    void playerCount() {
        super.playerCount();
        System.out.println("Java class onr bounce team!");
    }
}

class Rugby extends Sports{
    Rugby(String x) {
        System.out.println("Team :- " + x );
        System.out.println("11");
    }
}

class Test4 {
    public static void main(String[] args) {
        Sports s;
        s= new Cricket();
        s.playerCount();
        s =new Football("Alnssr");
        s.playerCount();
        s = new Rugby("New Zealand");
        s.playerCount();
        Cricket c = new OneBounce();
        c.playerCount();

    }
}