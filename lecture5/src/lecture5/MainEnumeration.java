package lecture5;

public class MainEnumeration {
    public static void main( String[] args){
        for( Day day: Day.values()){
            System.out.println( day );
        }
        System.out.println();
        for( Day day: Day.values()){
            System.out.println( day.name() + " : " + day.ordinal() );
        }
    }
}

enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY
}


