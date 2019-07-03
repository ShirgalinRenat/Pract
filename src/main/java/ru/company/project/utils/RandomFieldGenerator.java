package ru.company.project.utils;

import ru.company.project.datamodel.Document;
import ru.company.project.factory.DataOptainable;
import ru.company.project.datamodel.RandomValue;
import org.apache.hadoop.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class RandomFieldGenerator implements DataOptainable {

    private static Random random=new Random();

    public RandomFieldGenerator(){

    }

    private static List<String> persons= Arrays.asList(
            "Иванов Иван Алексеевич",
            "Васильев Михаил Юрьевич",
            "Аксенов Эдуард Евгеньевич",
            "Портнов Владислав Аркадьевич",
            "Прыглов Артем Викторович"
    );

    private static List<String> deliveryTypes = Arrays.asList(
            "Курьерская доставка",
            "Доставка на почтовый адрес",
            "Доставка на работу",
            "Доставка на эл почту"
    );

    private static List<String> docTypes= Arrays.asList(
            "INCOMING",
            "OUTGOING",
            "TASK"
    );

    private static List<String> docNames= Arrays.asList(
            "Накладная",
            "Отчет",
            "Смета"
    );

    public static String takeRandomPerson() {
        return persons.get(random.nextInt(persons.size()));
    }

    public static String takeRandomNames() {
        return docNames.get(random.nextInt(docNames.size()));
    }

    public static String takeRandomDevType(){
        return deliveryTypes.get(random.nextInt(deliveryTypes.size()));
    }

    public static String takeRandomDocType(){
        return docTypes.get(random.nextInt(docTypes.size()));
    }

    public static Date takeRandomDate(){
        return new Date(System.currentTimeMillis() - random.nextInt(1000 * 3600 * 24 * 1000));
    }

    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("максильмальное значение должно быть больше минимального");
        }

        return (int)(Math.random() * ((max - min) + 1)) + min;
    }

    @Override
    public void dataOptain(Document document) throws IllegalAccessException {

        for (Field field : ReflectionUtils.getDeclaredFieldsIncludingInherited(document.getClass()))
            if (field.isAnnotationPresent(RandomValue.class)) {

                Object value = null;
                switch (field.getAnnotation(RandomValue.class).value()) {
                    case INTEGER:
                        value = random.nextInt(1000);
                        break;
                    case DATE:
                        value = takeRandomDate();
                        break;
                    case TEXT:
                        value = "Текст документа";
                        break;
                    case NAME:
                        value = takeRandomNames();
                        break;
                    case HUMANNAME:
                        value = takeRandomPerson();
                        break;
                    case REGNUM:
                        value = String.valueOf(random.nextInt(1000));
                        break;
                    case BOOLEAN:
                        value = true;
                        break;
                }
                field.setAccessible(true);
                field.set(document, value);
            }
    }
}
