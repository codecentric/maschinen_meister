package de.codecentric.maschinenmeister.core.broker;

/**
 * Created by stefansiprell on 21.02.17.
 */
public abstract class MessageMatchers {

    public static MessageMatcherFunctionalInterface ALL = (m) -> true;
    public static MessageMatcherFunctionalInterface NONE = (m) -> false;

}
