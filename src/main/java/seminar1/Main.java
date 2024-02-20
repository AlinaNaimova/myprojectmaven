package seminar1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Домашнее задание
 * Условие:
 * Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
 * Пример решения:
 * 1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
 * 2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
 * 3. Создайте класс Person с полями firstName, lastName и age.
 * 4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
 * 5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Дарья", "Зотова", 25);
        Person person2 = new Person("Анна", "Кузнецова", 28);
        Person person3 = new Person("Михаил", "Гладков", 35);
        Person person4 = new Person("Ян", "Савельев", 32);

        // создание объекта Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // сериализация объекта класса Person в JSON-формат
        String personToJson1 = gson.toJson(person1);
        String personToJson2 = gson.toJson(person2);
        String personToJson3 = gson.toJson(person3);
        String personToJson4 = gson.toJson(person4);

        System.out.println("Сериализованный JSON для person1:" + personToJson1);
        System.out.println("Сериализованный JSON для person2:" + personToJson2);
        System.out.println("Сериализованный JSON для person3:" + personToJson3);
        System.out.println("Сериализованный JSON для person4:" + personToJson4);

        // десериализация строки в формате JSON в объект класса Person
        Person jsonToPerson1 = gson.fromJson(personToJson1, Person.class);
        Person jsonToPerson2 = gson.fromJson(personToJson2, Person.class);
        Person jsonToPerson3 = gson.fromJson(personToJson3, Person.class);
        Person jsonToPerson4 = gson.fromJson(personToJson4, Person.class);

        System.out.println("Десериализованный объект Person из JSON для person1: " + jsonToPerson1);
        System.out.println("Десериализованный объект Person из JSON для person2: " + jsonToPerson2);
        System.out.println("Десериализованный объект Person из JSON для person3: " + jsonToPerson3);
        System.out.println("Десериализованный объект Person из JSON для person4: " + jsonToPerson4);


    }

}

