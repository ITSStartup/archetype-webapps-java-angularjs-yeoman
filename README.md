###archetype-webapps-java-angularjs-yeoman
================================

webapps-java-angularjs-yeoman archetype for creating web application with AngularJS 1.0.x with ngResource ,
 Hibernate 4.x, Spring Core 3.x, Jersey 1.x, DBUnit, Yeoman 1.0.x, Twitter BootStrap 2.3


###Required 

* Maven installed 

###Features & Benefits 

* DAO Generic implemented; 
* Service Generic implemented; 
* Structure for DBUnit done; 
* Spring 3.x and Hibernate 4.x configured; 
* MySql 5.x 
* Jersey 1.x Configured; 
* AngularJS 1.0.x;
* [Yeoman 1.0](http://yeoman.io)
* Twitter BootStrap

###How to Install local?

**Step 1**

```java
git clone 
```

**Step 2**

* Go to the folder and execute: 

```java
mvn clean install 
```

**Step 3**

* create new maven project via Eclipse ;
* in Catalog choose **All Catalogs**;
* in filter type: br.

Now its is expected you see in group id: *br.com.its.archetypes.angularjs.java.yeoman*

* choose the archetype and go ahead clicking in next 

Done your project was created with Java + angularJS

###Yeoman 

Observe que this project was created with Yeoman structure.

###How to custom? What should I change? 

Update thease files according to your configuration for project, such as: data base connection, packages names etc. There are comments where you should inform data. 

* app-context.xml 

* test-context.xml


###Conclusion 

webapps-module-java-angularjs was created to avoid and help to create JEE project using angularjs with basic structure with basic frameworks. Of course we can update, remove any framework that you do not need for you project. Feel free and send pull request. 
