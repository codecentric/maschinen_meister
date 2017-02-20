package de.codecentric.maschinenmeister.outside.api;

/**
 * Created by stefansiprell on 20.02.17.
 */
public interface Publish {

    Boolean duplicate();

    QoSLevel qos();

    Boolean retain();

    String topicName();

    Short packetId();

    Byte[] payload();



}
