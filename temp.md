Starting FirstProjectApplication using Java 23 with PID 20748 (C:\Users\bharath\projects\spring\firstProject\target\classes started by bharath in C:\Users\bharath\projects\spring\firstProject)
2024-11-25T10:12:36.790+05:30  INFO 20748 --- [firstProject] [  restartedMain] c.f.t.f.FirstProjectApplication          : No active profile set, falling back to 1 default profile: "default"
2024-11-25T10:12:36.934+05:30  INFO 20748 --- [firstProject] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-11-25T10:12:36.934+05:30  INFO 20748 --- [firstProject] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-11-25T10:12:38.604+05:30  INFO 20748 --- [firstProject] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2024-11-25T10:12:38.732+05:30  INFO 20748 --- [firstProject] [  restartedMain] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 107 ms. Found 1 JPA repository interface.
2024-11-25T10:12:40.026+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-11-25T10:12:40.055+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-11-25T10:12:40.056+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.33]
2024-11-25T10:12:40.159+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-11-25T10:12:40.162+05:30  INFO 20748 --- [firstProject] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 3224 ms
2024-11-25T10:12:40.444+05:30  INFO 20748 --- [firstProject] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-11-25T10:12:41.833+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2024-11-25T10:12:41.998+05:30  INFO 20748 --- [firstProject] [  restartedMain] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.6.2.Final
2024-11-25T10:12:42.157+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2024-11-25T10:12:42.907+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2024-11-25T10:12:42.960+05:30  INFO 20748 --- [firstProject] [  restartedMain] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2024-11-25T10:12:44.018+05:30  WARN 20748 --- [firstProject] [  restartedMain] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 08004
2024-11-25T10:12:44.019+05:30 ERROR 20748 --- [firstProject] [  restartedMain] o.h.engine.jdbc.spi.SqlExceptionHelper   : The server requested SCRAM-based authentication, but no password was provided.
2024-11-25T10:12:44.021+05:30  WARN 20748 --- [firstProject] [  restartedMain] o.h.e.j.e.i.JdbcEnvironmentInitiator     : HHH000342: Could not obtain connection to query metadata

org.hibernate.exception.JDBCConnectionException: unable to obtain isolated JDBC connection [The server requested SCRAM-based authentication, but no password was provided.] [n/a]
at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:100) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:58) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:320) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1431) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1502) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1849) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1798) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:601) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:288) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:970) ~[spring-context-6.2.0.jar:6.2.0]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.0.jar:6.2.0]
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.0.jar:3.4.0]
at com.featuring.tasks.firstProject.FirstProjectApplication.main(FirstProjectApplication.java:15) ~[classes/:na]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.4.0.jar:3.4.0]
Caused by: org.postgresql.util.PSQLException: The server requested SCRAM-based authentication, but no password was provided.
at org.postgresql.core.v3.ConnectionFactoryImpl.lambda$doAuthentication$5(ConnectionFactoryImpl.java:854) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.core.v3.AuthenticationPluginManager.withPassword(AuthenticationPluginManager.java:82) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.core.v3.ConnectionFactoryImpl.doAuthentication(ConnectionFactoryImpl.java:851) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.core.v3.ConnectionFactoryImpl.tryConnect(ConnectionFactoryImpl.java:213) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.core.v3.ConnectionFactoryImpl.openConnectionImpl(ConnectionFactoryImpl.java:268) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.core.ConnectionFactory.openConnection(ConnectionFactory.java:54) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.jdbc.PgConnection.<init>(PgConnection.java:273) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.Driver.makeConnection(Driver.java:446) ~[postgresql-42.7.4.jar:42.7.4]
at org.postgresql.Driver.connect(Driver.java:298) ~[postgresql-42.7.4.jar:42.7.4]
at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:137) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:360) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:202) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:461) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:550) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:98) ~[HikariCP-5.1.0.jar:na]
at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:111) ~[HikariCP-5.1.0.jar:na]
at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:126) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:467) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
... 38 common frames omitted

2024-11-25T10:12:44.040+05:30 ERROR 20748 --- [firstProject] [  restartedMain] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2024-11-25T10:12:44.042+05:30  WARN 20748 --- [firstProject] [  restartedMain] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
2024-11-25T10:12:44.051+05:30  INFO 20748 --- [firstProject] [  restartedMain] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2024-11-25T10:12:44.077+05:30  INFO 20748 --- [firstProject] [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2024-11-25T10:12:44.137+05:30 ERROR 20748 --- [firstProject] [  restartedMain] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1802) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:601) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:523) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:336) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:288) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:334) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:204) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:970) ~[spring-context-6.2.0.jar:6.2.0]
at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:627) ~[spring-context-6.2.0.jar:6.2.0]
at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:752) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:439) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1361) ~[spring-boot-3.4.0.jar:3.4.0]
at org.springframework.boot.SpringApplication.run(SpringApplication.java:1350) ~[spring-boot-3.4.0.jar:3.4.0]
at com.featuring.tasks.firstProject.FirstProjectApplication.main(FirstProjectApplication.java:15) ~[classes/:na]
at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103) ~[na:na]
at java.base/java.lang.reflect.Method.invoke(Method.java:580) ~[na:na]
at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.4.0.jar:3.4.0]
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:276) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:226) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:194) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:171) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1431) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1502) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:419) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:400) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1849) ~[spring-beans-6.2.0.jar:6.2.0]
at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1798) ~[spring-beans-6.2.0.jar:6.2.0]
... 18 common frames omitted
Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:191) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:87) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:181) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:392) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:129) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:81) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.6.2.Final.jar:6.6.2.Final]
... 33 common frames omitted