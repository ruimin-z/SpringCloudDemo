## Distributed Backend Service through SpringCloud & Consul
ServiceProvider1 -> port 8001

ServiceProvider2 -> port 8002

ServiceConsumer -> port 8003


### Process
1. Provider1 (8001) register at Consul, named as ServiceProvider1
2. Provider2 (8002) register at Consul, named as ServiceProvider2
3. `User` call on `Consumer` API
4. `Consumer` send request to `Consul` via `OpenFeign RPC` to ask for registered providers (Round Robin)
5. `Consul` returns an available `Provider_k` to `Consumer` via `OpenFeign RPC` 
6. `Consumer` call on the given `Provider_k` via `OpenFeign RPC` to get response
7. `Consumer` returns the response to `User`

## Consul
### Download
https://developer.hashicorp.com/consul/downloads
### Execute
1. `./consul agent -dev`
2. http://localhost:8500/ 

### Provider1 and Provider2 Connection
1. （外部和内部）SpringCloud: HTTP API  
2. （内部和内部）OpenFeign (RPC) - faster than HTTP API
3. （长链接通道）WebSocket
4. (deprecated, replaced by WebSocket) 长轮询 Long Polling 


