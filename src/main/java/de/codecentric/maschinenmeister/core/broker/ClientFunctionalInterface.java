package de.codecentric.maschinenmeister.core.broker;

/**
 * Created by stefansiprell on 21.02.17.
 */
@FunctionalInterface
public interface ClientFunctionalInterface {

    void receive(Message message);

}
