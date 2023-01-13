import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Author levTolsoi = new Author("Лев ", "Толстой");
        System.out.println("Автор1 = " + levTolsoi.getFirstName() + levTolsoi.getLastName());

        Author kizaru = new Author("Олег ", "Нечипоренко");
        System.out.println("Автор2 = " + kizaru.getFirstName() + kizaru.getLastName());

        //Книга №1
        Book warAndPeace = new Book("Война и мир", levTolsoi, 1876);
        System.out.println("Название = " + warAndPeace.getName());
        System.out.println("Автор книги = " + levTolsoi.getFirstName() + levTolsoi.getLastName());
        System.out.println("Релиз = " + warAndPeace.getYearOfPublication());

        //Книга №2
        Book dejavu = new Book("Дежавю", kizaru, 2022);
        System.out.println("Название = " + dejavu.getName());
        System.out.println("Автор = " + kizaru.getFirstName() + kizaru.getLastName());
        System.out.println("Релиз = " + dejavu.getYearOfPublication());
        dejavu.setYearOfPublication(2023);
        System.out.println("Проверка " + dejavu.getYearOfPublication());

    }
}