package de.codecentric.maschinenmeister.core.broker;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

/**
 * Created by stefansiprell on 21.02.17.
 */
@ExtendWith(MockitoExtension.class)
public class SubscriberTest {

    @Test
    public void testSubscription(){
        //Given there is a stream with one element
        final Message message = ImmutableMessage.builder().topic("/codecentric/stefan").payload(new Byte[]{}).build();
        final Flowable<Message> flow = Flowable.just(message);

        //When the subscriber is created
        ClientFunctionalInterface client = Mockito.mock(ClientFunctionalInterface.class);
        final Subscriber subscriber = new Subscriber(client);
        //and  the subscriber is registered
        subscriber.register(flow);

        //Then the client is called
        Mockito.verify(client).receive(Mockito.any());

    }
}
