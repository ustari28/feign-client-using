# Using Feign
Client which uses Feign by easier communication with other micro-services. Feign by defaut uses Ribbon balancing for 
knowing the locations of micro-services, in this case we disabled Ribbon balancing to set up *ribbon.eureka
.enabled=false* and we get all control about request. In addition we use Eureka for registering services.

## Notes
See all related repositories at [Simple Eureka server](https://github.com/ustari28/simple-eureka-server)
