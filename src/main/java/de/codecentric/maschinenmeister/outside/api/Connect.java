package de.codecentric.maschinenmeister.outside.api;

import java.util.Optional;

/**
 * Created by stefansiprell on 20.02.17.
 */
public interface Connect {
    //TODO: Should be mapped to a 7bit Number according to SPEC
    Integer protocolLevel();

    Boolean cleanSession();

    QoSLevel willQOS();

    Boolean willRetain();

    String willTopic();

    Byte[] willMessage();

    String clientId();

    Optional<String> userName();

    Optional<Byte[]> password();
}


