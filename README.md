# X-Components

## *Multi-Cache Provider(MCP) `🚀️ V1.0.0`*

### 📚 Dependency

Please refer to `dependencies-control-center` for the version number.

| groupId                    | artifactId        | scope    | 
|----------------------------|-------------------|----------|
| com.fasterxml.jackson.core | jackson-databind  | provider | 
| ricciliao.x                | common-components | provider | 

### Artifacts Output (org.apache.maven.plugins:maven-assembly-plugin)

* mcp-common-component-`${version}`.jar
    * **assembly**: src/assembly/common.xml
    * **install**
        * **POM**: src/assembly/common-pom.xml
        * **Group Id**: ricciliao.x
        * **Artifact Id**: mcp-common-component
* mcp-consumer-component-`${version}`.jar
    * **assembly**: src/assembly/consumer.xml
    * **install**
        * **POM**: src/assembly/consumer-pom.xml
        * **Group Id**: ricciliao.x
        * **Artifact Id**: mcp-consumer-component
