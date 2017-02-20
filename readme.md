# Maschinen Meister
## IoT for the Masses

_Maschinen Meister is a MQTT Proxy. Meaning it adapts an **outside** MQTT world to an **inside** functional world._

MQTT is a protocol adapted to embedded hardware constraints and very lousy connection options.
This does not map nicely to a world of distributed stream processing, big data and the likes.
Hence we developed Maschinen Meister to connect these worlds as a slim proxy to adapt the worlds.

## Session

Each session is represented by its own object.
The class collaborates with following domain objects:
* Connection: A connection will initiate a session, but may be lost and recovered.  
* Subscription: A subscription is session specific and will if required pull and queue messages from central topics.
* Topic: Is a client / session agnostic broker system on which messages are exhanged.
