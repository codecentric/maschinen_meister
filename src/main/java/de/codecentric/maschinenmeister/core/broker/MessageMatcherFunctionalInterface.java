package de.codecentric.maschinenmeister.core.broker;

/**
 * Created by stefansiprell on 21.02.17.
 */
public interface MessageMatcherFunctionalInterface {
    
    boolean predicate(Message message);

}
