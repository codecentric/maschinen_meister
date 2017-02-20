package de.codecentric.maschinenmeister.outside.api;

/**
 * Created by stefansiprell on 20.02.17.
 */
public interface ConnAck {

    Boolean sessionPresent();

    ConnectReturnCode returnCode();

}
