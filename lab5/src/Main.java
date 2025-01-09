public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("+79329489282", "Point");
        Phone phone2 = new Phone("+74789533198", "Lol", 0.15);
        Phone phone3 = new Phone("+77585917417", "SuperPhone",1.0);

        phone1.infoPhone(phone1);
        phone2.infoPhone(phone2);
        phone3.infoPhone(phone3);

        phone1.receiveCall("Петя");
        System.out.println("Номер 1 телефона: " + phone1.getNumber());
        phone2.receiveCall("Саша");
        System.out.println("Номер 2 телефона: " + phone2.getNumber());
        phone3.receiveCall("Александ Евгеневич");
        System.out.println("Номер 3 телефона: " + phone3.getNumber());

        phone1.receiveCall("Женя", "+73489489913");

        phone1.sendMessage("+79443748341", "+74948583421");

        Reader[] readers = new Reader[]{
                new Reader("Голиков П. А.", "48539", "ФМИИТ", "2005-31-12", "+7952859291"),
                new Reader("Адеев И. А.", "00000", "ФМИИТ", "2005-15-08", "+7961671661")
        };
        readers[0].takeBook(3);
        readers[0].takeBook("Три поросенка", "Маша и Медведь", "Теория кодирования");
        readers[1].takeBook(new Book("Записки охотника", "С. И. Тургеньев"), new Book("Руслан и Людмила", "А.С. Пушкин"), new Book("Капитанская дочка", "А.С. Пушкин"));
    }
}