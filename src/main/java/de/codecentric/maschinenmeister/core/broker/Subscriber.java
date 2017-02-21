package de.codecentric.maschinenmeister.core.broker;

import io.reactivex.Flowable;


public final class Subscriber {

    private final ClientFunctionalInterface clientFunction;

    public Subscriber(final ClientFunctionalInterface clientFunction){
        this.clientFunction = clientFunction;
    }

    public void register(final Flowable<Message> messages){
        messages.subscribe(clientFunction::receive);
    }


}
