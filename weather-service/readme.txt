Requirements
•	JDK 1.8 installed
•	Wildfly 9:  http://download.jboss.org/wildfly/9.0.2.Final/wildfly-9.0.2.Final.zip
•	Eclipse for Java EE developers

Run Wildfly 9 container
1.	Unpack Wildfly anywhere You like e.g. c:\widfly (WILDFLY_HOME)
2.	Override standalone.xml, mgmt-users.properties, mgmt-groups.properties from attachment in directory WILDFLY_HOME\standalone\configuration
3.	Ensure that JAVA_HOME is set to JDK ( echo %JAVA_HOME% ) if isn’t set it:
	a.	windows command line: set JAVA_HOME c:\path_to_jdk
4.	Run Wildfly from WILDFLY_HOME\bin directory: standalone.bat	

Generate endpoint from wsdl:
in weather-endpoints directory call:
	mvn clean install -P wsdl2java
	
Build all application:
in  weather-service directory call:
	mvn clean install
	
Deploy to wildfly:
in weather-endpoints directory call:
	mvn wildfly:deploy
	
Web service is available by: http://localhost:8080/weather-endpoints/WeatherPortTypeSOAPImpl?wsdl
You can use SoapUI to call this.


