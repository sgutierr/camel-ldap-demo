# Camel LDAP demo 

This example demonstrates how to implement a Fuse-LDAP validator integrated with the 3scale API Gateway and authenticate inbound API calls against LDAP. This component based on Apache Camel with Spring Boot acts also as a reverse proxy forwarding all API traffic to the 3scale API Gateway.

This is the diagram architecture of this component (LDAP validator):
![](doc/ScreenshotCamel-LDAP.png)

### Building

The example can be built with

    mvn clean install

### Running in spring-boot

The example can run in spring-boot

    mvn spring-boot:run


### Running the example in OpenShift

It is assumed that:
- OpenShift platform is already running, if not you can find details how to [Install OpenShift at your site](https://docs.openshift.com/container-platform/3.3/install_config/index.html).
- Your system is configured for Fabric8 Maven Workflow, if not you can find a [Get Started Guide](https://access.redhat.com/documentation/en/red-hat-jboss-middleware-for-openshift/3/single/red-hat-jboss-fuse-integration-services-20-for-openshift/)

The example can be built and run on OpenShift using a single goal:

    mvn oc:deploy

When the example runs in OpenShift, you can use the OpenShift client tool to inspect the status

To list all the running pods:

    oc get pods

Then find the name of the pod that runs this quickstart, and output the logs from the running pods with:

    oc logs <name of pod>

You can also use the OpenShift [web console](https://docs.openshift.com/container-platform/3.3/getting_started/developers_console.html#developers-console-video) to manage the
running pods, and view logs and much more.

### LDAP for testing

Note: this free LDAP service can be used for testing this component --> [link](https://www.zflexldapadministrator.com/index.php/blog/82-free-online-ldap): 

    https://www.zflexldapadministrator.com/index.php/blog/82-free-online-ldap

Example of a test call
![](doc/ScreenshotTestCamel-LDAP.png)

