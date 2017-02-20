package de.codecentric.maschinenmeister.outside.api;

/**
 * Created by stefansiprell on 20.02.17.
 */
public interface Subscribe {

    Short packetIdentifier();

    Iterable<Subscription> subscriptions();

    interface Subscription {
        String topicName();
        QoSLevel requestedQoS();
    }
}


