package de.codecentric.maschinenmeister.core.broker;

import io.reactivex.Flowable;


public final class Subscriber {

    private final ClientFunctionalInterface clientFunction;
    private final MessageMatcherFunctionalInterface topicFilterFunction;

    public Subscriber(
            final MessageMatcherFunctionalInterface topicFilterFunction,
            final ClientFunctionalInterface clientFunction
    ){
        this.topicFilterFunction = topicFilterFunction;
        this.clientFunction = clientFunction;
    }

    public void register(final Flowable<Message> messages){

                messages
                        .filter(topicFilterFunction::predicate)
                        .subscribe(clientFunction::receive);
    }


}
