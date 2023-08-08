public class gender_exception extends Throwable {
    public gender_exception() {
    }

    public void gender_exception(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("It`s not correct data: %s", i);
        System.out.println();
    }
}
