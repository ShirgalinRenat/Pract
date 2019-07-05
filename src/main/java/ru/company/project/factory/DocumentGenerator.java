package ru.company.project.factory;

import ru.company.project.datamodel.Document;

/**
 * Данный интерфейс передает ссылку на документ в генератор для заполнения его полей данных
 * Зполнение происходит посредством аннотируемых полей
 */
public interface DocumentGenerator {
    public void documentObtain(Document document) throws IllegalAccessException;


}
