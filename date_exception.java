public class date_exception extends Exception{
    public date_exception() {
    }

    public void date_exception(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }
}
