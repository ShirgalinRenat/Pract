package ru.company.project.datamodel;

import ru.company.project.enums.DefinitionTypes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**

 * Интерфейс Random value.

 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface RandomValue {
    DefinitionTypes value();
}
