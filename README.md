# druid-pwd-provider-extn-sample

This repository contains sample code for writing a Druid extension which shows how to write
a "secure" druid "io.druid.metadata.PasswordProvider" that enables you to store/specify your database
password in more secure ways than to write them in plain text in the druid configuration file.

General Documentation for writing Druid Extensions is available at -- http://druid.io/docs/latest/Modules.html

Basically, your project should contain an implementation of "io.druid.initialization.DruidModule" which is
specified in "META-INF/services/io.druid.initialization.DruidModule"

Here is the most basic project layout for druid extension.

```
$ tree
.
|-- pom.xml
`-- src
    `-- main
        |-- java
        |   `-- io
        |       `-- druid
        |           `-- samplepwdext
        |               |-- SecurePasswordProvider.java
        |               `-- SecurePwdProviderModule.java
        `-- resources
            `-- META-INF
                `-- services
                    `-- io.druid.initialization.DruidModule
```
  
