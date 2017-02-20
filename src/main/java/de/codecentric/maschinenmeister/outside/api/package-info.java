/**
* The api interfaces reflect the request / response objects as described in the MQTT specification.
 * Static Header information, which are common between all instances of the messages are omitted from the interface,
 * as they are considered wire-level specific without any value.
 * Payload messages are inlined as regular methods, as there is no need to differentiate header / payload on this leve.
 * If a payload is marked as optional by analysing a header flag, it will be represented as an Optional<T> field.
 * These objects contain no plausibility checks, so if a valid configuration requires a special combination of values
 * across multiple fields, an additional check is required.
 * This may be implemented by builders and specific access operations.
 * As these parameters are immutable, they are represented as interfaces.
 * They may be decorated by a framework like immutables.
 * @see <a href="http://docs.oasis-open.org/mqtt/mqtt/v3.1.1/os/mqtt-v3.1.1-os.html">MQTT Specification</a>
 * @see <a href="https://immutables.github.io">Immutables Framework</a>
 * @see java.util.Optional
 * */
 package de.codecentric.maschinenmeister.outside.api;