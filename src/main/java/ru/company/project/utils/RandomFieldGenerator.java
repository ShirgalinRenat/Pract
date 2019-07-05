package ru.company.project.utils;

import ru.company.project.datamodel.Document;
import ru.company.project.factory.DocumentGenerator;
import ru.company.project.staff.StaffGenerator;
import ru.company.project.datamodel.RandomValue;
import org.apache.hadoop.util.ReflectionUtils;
import ru.company.project.staff.Staff;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Генератор данных
 *
 */
public class RandomFieldGenerator implements DocumentGenerator, StaffGenerator {

    private int constForGenerate=1000;

    private Random random=new Random();

    private List<String> numbers= Arrays.asList(
            "9612589634",
            "9843654785",
            "9814785368",
            "9652589436",
            "9351435896"
    );

    private List<String> persons= Arrays.asList(
            "Иванов Иван Алексеевич",
            "Васильев Михаил Юрьевич",
            "Аксенов Эдуард Евгеньевич",
            "Портнов Владислав Аркадьевич",
            "Прыглов Артем Викторович"
    );

    private List<String> deliveryTypes = Arrays.asList(
            "Курьерская доставка",
            "Доставка на почтовый адрес",
            "Доставка на работу",
            "Доставка на эл почту"
    );

    private List<String> docTypes= Arrays.asList(
            "INCOMING",
            "OUTGOING",
            "TASK"
    );

    private List<String> docNames= Arrays.asList(
            "Накладная",
            "Отчет",
            "Смета"
    );

    private List<String> position= Arrays.asList(
            "Директор",
            "Бухгалтер",
            "Оператор"
    );

    String doRandomPerson() {
        return persons.get(random.nextInt(persons.size()));
    }

    String doRandomNames() {
        return docNames.get(random.nextInt(docNames.size()));
    }

    String doRandomDevType(){
        return deliveryTypes.get(random.nextInt(deliveryTypes.size()));
    }

    String doRandomDocType(){
        return docTypes.get(random.nextInt(docTypes.size()));
    }

    String doRandomNumber(){
        return numbers.get(random.nextInt(numbers.size()));
    }

    String doRandomPosition(){
        return position.get(random.nextInt(position.size()));
    }

    Date doRandomDate(){
        return new Date(System.currentTimeMillis() - random.nextInt(1000 * 3600 * 24 * 1000));
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("максильмальное значение должно быть больше минимального");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    /**
     * Реализация интерфейса DocumentGenerator
     * @param document
     * @throws IllegalAccessException
     */
    @Override
    public void documentObtain(Document document) throws IllegalAccessException {

        for (Field field : ReflectionUtils.getDeclaredFieldsIncludingInherited(document.getClass()))
            if (field.isAnnotationPresent(RandomValue.class)) {

                Object value = null;
                switch (field.getAnnotation(RandomValue.class).value()) {
                    case INTEGER:
                        value = random.nextInt(constForGenerate);
                        break;
                    case DATE:
                        value = doRandomDate();
                        break;
                    case TEXT:
                        value = "Текст документа";
                        break;
                    case NAME:
                        value = doRandomNames();
                        break;
                    case HUMANNAME:
                        value = doRandomPerson();
                        break;
                    case REGNUM:
                        value = String.valueOf(random.nextInt(constForGenerate));
                        break;
                    case BOOLEAN:
                        value = true;
                        break;
                }
                field.setAccessible(true);
                field.set(document, value);
            }
    }

    @Override
    public void staffObtain(Staff staff) throws IllegalAccessException {

        for (Field field : ReflectionUtils.getDeclaredFieldsIncludingInherited(staff.getClass()))
            if (field.isAnnotationPresent(RandomValue.class)) {

                Object value = null;
                switch (field.getAnnotation(RandomValue.class).value()) {
                    case TEXT:
                        value = "Текст документа";
                        break;
                }
                field.setAccessible(true);
                field.set(staff, value);
            }
    }

}
