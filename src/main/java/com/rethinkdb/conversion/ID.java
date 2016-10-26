package com.rethinkdb.conversion;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by thejp on 10/25/2016.
 */

/**
 * Annotate the primary key/id field of any pojo with this.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ID
{
}
