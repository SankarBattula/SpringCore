Inversion of Control: 
	•Is a design principal using which an external entity injecting dependencies into dependent object.
	•In Spring, Spring Container is the external entity, which injects dependency object into dependent object.
What is DI: 
	•Physical realization of IOC is nothing but DI (Dependency Injection).
	•Resolving the dependencies of among the beans is nothing but Dependency Injection.
	•In spring, dependencies are injected into dependent object (beans ) through DI is generally achieved in 2 ways. 
oSetter Injection :  Use <property> tag in bean configuration file & supply the value.
Spring configuration file: 
<beans ... >
<bean id ="p" class= "Providert'/> 
  <bean id ="c" class="Customer"> 
   <property name="providerU ref="pU></property>
 (or) 
   <property name="providerU ref="pt'/> 
                (or) 
   <property name="provider">
 <ref bean ="pr'/ >
  </property > 
</bean> 
</beans>
oConstructor Injection : Use <constructor-arg> tag in bean configuration file.
Spring configuration file: 
<beans ... > 
<bean id="purseU class="Purse">
    <constructor-arg value="lO"></ constructor-arg> 
(or)
    <constructor-arg value="lOt'/> 
(or) 
    < constructor-arg > 
< value>lO</value> 
    </constructor-arg >
 </bean > 
</beans>
Use <constructor-arg> tag in bean configuration file &supply the value.
 

What is Spring Bean?
	Java class that are controlled by spring container are know as Spring Bean.
Which injection is better?
	•Setter Injection is always preferable because we can change the dependencies value any no.of times as we required.
	•But with constructor we can’t change dependency object value, as and when we require.
Spring bean scopes example
         In Spring, bean scope is used to decide which type of bean instance should be return from Spring container back to the caller and the default scope is singleton.
5 types of bean scopes supported: 
	•singleton – Return a single bean instance per Spring IoC container
	•prototype – Return a new bean instance each time when requested
	•request – Return a single bean instance per HTTP request. *
	•session – Return a single bean instance per HTTP session. *
	•globalSession – Return a single bean instance per global HTTP session. *
    singleton:
    <bean id = "sb" class = "com.sankar.spring.bean.SpringBean" scope="singleton"> 
    prototype:
    <bean id = "sb" class = "com.sankar.spring.bean.SpringBean" scope="prototype"> 

How to resolve Constructor ambiguity 
    <bean id = "sb" class = "com.sankar.spring.bean.SpringBean" scope="prototype">
   	<constructor-arg value="1001" index="0" type="int"></constructor-arg>
   	<constructor-arg value="Sankar" index="1"
 type="java.lang.String"></constructor-arg> 
    </bean>
What are the different types of containers in spring framework?
	1.Bean Factory based 
	2.AppliationContext based
private static BeanFactory factory = new XmlBeanFactory(new
    ClassPathResource("com/sankar/spring/context/applicationContext.xml"));
private static ApplicationContext context = new
    ClassPathXmlApplicationContext("com/sankar/spring/context/
applicationContext.xml");
What is Spring bean life-cycle
	Spring container controls the life cycle of spring bean i.e from instantiation to destruction.
    Spring bean has 4 life cycle states:
	?Instantiation 
	?Initialization 
	?Ready to use (method ready to use state) 
	?Destruction 
    

 Initialization method, destruction method can be given to spring bean in the following ways
?By implementing spring framework given interfaces they are 
	1.InitializingBean 
	2.DisposableBean 

?By configuring custom initialization and destruction method in the spring configuration file using <bean> tag attributes
	oInit-method
	odestroy-method
   <bean id = "sb" class = "com.sankar.spring.bean.SpringBean" 
				init-method="configurationInit"
				destroy-method="configurationDestroy">
   		<property name="name" value="lifeCycleBean"></property>
   </bean> 
?By using annotation 
	oPreDestroy 
	oPostConstruct

dependency-check:  
	•Used to verify all dependencies of been that are configured via injection are injected or not.
	•To implement dependency checking to a spring bean we make use of ‘dependency-check’ attribute of <bean> tag.
This attribute takes any one of the four following values.
	1.none (it won’t check whether dependencies injected or not)
	2.simple (it checks all primitive dependencies injected or not)
	3.object (it checks all the object type dependencies injected or not)
	4.all (it checks both primitives and object type dependencies injected or not)
    <bean id = "carref" class = "com.sankar.spring.bean.Car" dependency-
check="simple">
   Spring dependency checking with @Required Annotation   		
	The RequiredAnnotationBeanPostProcessor can be enabled in two ways.
	1.Include <context:annotation-config />
<beans> 
		<context:annotation-config/>
	        </beans>
	2.Include RequiredAnnotationBeanPostProcessor
<beans>
<bean 
	class=”org.springframework.beans.factory.annotation.
RequiredAnnotationBeanPostProcessor”/>
	       </beans>
AutoWiring :   Means automatically injecting the dependencies.
	•Instead of manually configuring the injection we done it automatically by using auto wiring.
	•To implement autowiring we use autowire attribute of <bean> tag.
	•There are five possible values to use autowire attribute of <bean> tag.
	?no 
	?constructor 
	?byName
	?byType
	?autodetect

   <bean id = "sr" class = "com.sankar.spring.bean.Servlet" autowire="byType">
  <bean id = "sr" class = "com.sankar.spring.bean.Servlet" autowire="byName">
  <bean id = "sr" class = "com.sankar.spring.bean.Servlet" autowire="constructor">
  <bean id = "sr" class = "com.sankar.spring.bean.Servlet" autowire="autodetect">

Spring Auto-Wiring Beans with @Autowired annotation
The @Autowired annotation is auto wire the bean by matching data type.

1.Include <context:annotation-config />
<beans> 
		<context:annotation-config/>
	        </beans>
2.Include AutowiredAnnotationBeanPostProcessor
<beans>
<bean 
	class=”org.springframework.beans.factory.annotation.
AutowiredAnnotationBeanPostProcessor”/>
	       </beans>

     The @Qualifier annotation us used to control which bean should be autowire on a field.

How to work with multiple spring configuration files?

	We can work with multiple spring configuration files in two ways 
	?By importing other spring file into the current configuration file. 
Ex: <import resource="other-spring-beans.xmIm/ > 
	?By passing all spring bean configuration files as a string array to the constructor of the  container 
new ClassPathXmlApplicationContext(new String[] {"beans- 1 l.xml", "beans-
2.xml","beans-3.xml")); 

What is lazy-init attribute of <bean> tag?
	if we configure, lazy-init=”true” for any bean, that bean object will not be created when we create the ApplicationContext based container.That will be created only when we call getBean(“id”);

