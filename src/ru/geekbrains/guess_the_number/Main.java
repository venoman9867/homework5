package ru.geekbrains.guess_the_number;

public class Main {

    public static void main(String[] args) {
        Employers Person1= new Employers();
        Employers Person2= new Employers();
        Employers[] personArray=new Employers[5];
        personArray[0]= new Employers();
        Employers PersonArray0= new Employers("Дуайт Шрут","Главный продавец","RealOldSchool@gmail.com", "+7(999)555-22-77", 900, 43);
        personArray[1]= new Employers();
        Employers PersonArray1= new Employers("Макс Лобанов Юрьевич","Уборщик","GazProm@gmail.com", "+7(567)276-12-13", 160, 22);
        personArray[2]= new Employers();
        Employers PersonArray2= new Employers("Люба Рахманенко Константиновна","Кассир","KosmeticPro@gmail.com", "+7(333)333-33-33", 220, 38);
        personArray[3]= new Employers();
        Employers PersonArray3= new Employers("Анастасия Жукова Максимовна","Консультант","SampleText@gmail.com", "+7(444)444-44-44", 280, 25);
        personArray[4]= new Employers();
        Employers PersonArray4= new Employers("Альфред Пенниуорт","Дворецкий","Batman@gmail.com", "засекречено", 0, 65);
        Person1.Name="Майкл Гэри Скотт";
        Person1.Rang="Менеджер";
        Person1.email="BigBoss1965@icloud.com";
        Person1.Call="+7(843)222-34-11";
        Person1.salary=800;
        Person1.age=55;
        Person2.Name="Пэм Бисли";
        Person2.Rang="Секретарь";
        Person2.email="CooLLady@gmail.com";
        Person2.Call="+7(845)123-33-44";
        Person2.salary=690;
        Person2.age=32;


        OutPut(Person1);
        OutPut2(Person2);
        //TaskLast(personArray[1]);

    }
    //метод выводит информацию об объекте в консоль
    static void OutPut(Employers person1) {
        System.out.print("Сотрудник 1: "+"Имя: "+person1.Name+" \nДолжность: "+person1.Rang+" \nemail: "+person1.email+" \nТелефон: "+person1.Call+" \nЗарплата: "+person1.salary+" \nВозраст: "+person1.age);
    }
    static void OutPut2(Employers person2) {
        System.out.println("\nСотрудник 2: "+"Имя: "+person2.Name+" \nДолжность: "+person2.Rang+" \nemail: "+person2.email+" \nТелефон: "+person2.Call+" \nЗарплата: "+person2.salary+" \nВозраст: "+person2.age);
    }
    static void TaskLast(Employers person){
        boolean i=true;
        while (i=true){
            if(person.age>=40){
            System.out.println(person);}
            else{
                i=false;
            }
        }
    }


}
