public class Central_bank {
    double getRevenue(){
        return 10.76;
    }
}
class DFCC extends Central_bank {
    @Override
    double getRevenue() {
        return 2.765;
    }
}
class BOC extends Central_bank {
    @Override
    double getRevenue() {
        return 4.76;
    }
}
class CDB extends Central_bank {
    @Override
    double getRevenue() {
        return 1.876;
    }
}
class Test {
    public static void main(String[] args) {
        Central_bank cb;
        cb = new DFCC();
        System.out.println("Revenue :- " + cb.getRevenue());
        cb = new BOC();
        System.out.println("Revenue :- " + cb.getRevenue());
        cb = new CDB();
        System.out.println("Revenue :- " + cb.getRevenue());
    }
}