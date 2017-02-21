package de.codecentric.maschinenmeister.core.broker;

import org.immutables.value.Value;

/**
 * Created by stefansiprell on 21.02.17.
 */
@Value.Immutable
public interface Message {

    String topic();
    Byte[] payload();
}
