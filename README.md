# Finagle-Thrift example

I put together this simple finagle/thrift client/server to enable me to experment with the protocol.

The server does not do anything useful. It is not intended to

built with with SBT 1.1.6 further dependencies in build.sbt

To run the server:

```
sbt "runMain server.ServerRunner"
```

To run the client:

```
sbt "runMain server.ClientRunner"
```
