# Application Bootstrap

This is a simple bootstrap to create an Windows executable from a Kotlin project.

Current features:
- Gradle Project
- Kotlin configured
- creates EXE with 'packaged' JRE

## Commands

- `gradle test` -> runs all tests
- `gradle build` -> builds everything, runs tests
- `gradle run` -> starts project
- `gradle exe` -> creates the executable

## Insights
Launch4J offers the possibility to specify the JRE path to define the JRE to use on clients
computer.
- First `createExe` (from Launch4J) is called. Here the exe and jars are created.
- Secondly `copyJre` is called. It extracts the `java.zip` from `./jre/` ... (this needs to be placed there manually)

At this point it is possible to start the exe within the folder.

- At last the whole Launch4J folder will be zipped and placed in `launch4j-zip` to 
have a ready-to-deliver artifact
