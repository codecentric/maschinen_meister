package de.codecentric.maschinenmeister.core.broker;

import io.reactivex.Flowable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * Created by stefansiprell on 21.02.17.
 */
@ExtendWith(MockitoExtension.class)
public class SubscriberTest {

    @Test
    public void testSimpleSubscriptionSetup(){
        //Given there is a stream with one element
        final Flowable<Message> flow = createDemoMessageFlow();

        //When the subscriber is created
        ClientFunctionalInterface client = mock(ClientFunctionalInterface.class);
        MessageMatcherFunctionalInterface filter = mock(MessageMatcherFunctionalInterface.class);
        when(filter.predicate(any())).thenReturn(true);
        final Subscriber subscriber = new Subscriber(filter, client);
        //and  the subscriber is registered
        subscriber.register(flow);

        //Then the client is called once
        verify(client).receive(any());
    }

    @Test
    public void testUnmatchedTopicSubscriptionSetup(){
        //Given there is a stream with one element
        final Flowable<Message> flow = createDemoMessageFlow();

        //When the subscriber is created
        ClientFunctionalInterface client = mock(ClientFunctionalInterface.class);
        MessageMatcherFunctionalInterface filter = mock(MessageMatcherFunctionalInterface.class);
        when(filter.predicate(any())).thenReturn(false);
        final Subscriber subscriber = new Subscriber(filter, client);
        //and  the subscriber is registered
        subscriber.register(flow);

        //Then the client is called
         verifyZeroInteractions(client);
    }

    private static Flowable<Message> createDemoMessageFlow(){
        final Message message = ImmutableMessage.builder().topic("/codecentric/stefan").payload(new Byte[]{}).build();
        final Flowable<Message> flow = Flowable.just(message);
        return flow;
    }

}
