package ru.company.project.factory.document;

import ru.company.project.model.document.Document;

/**
 * Данный интерфейс передает ссылку на документ в генератор для заполнения его полей данных
 * Зполнение происходит посредством аннотируемых полей
 */
public interface DocumentObtainable {
    public void documentObtain(Document document) throws IllegalAccessException;


}
