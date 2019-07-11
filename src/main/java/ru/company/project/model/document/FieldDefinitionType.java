package ru.company.project.model.document;

import ru.company.project.enums.DefinitionTypes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Описание аннотации Random value.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FieldDefinitionType {
    DefinitionTypes value();
}
