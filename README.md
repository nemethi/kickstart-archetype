# kickstart-archetype

This is a Maven archetype based on the [Maven Quickstart Archetype](https://maven.apache.org/archetypes/maven-archetype-quickstart/).
Apart from adding a sample Java file and test file it also includes:
* the [Maven Wrapper](https://github.com/takari/maven-wrapper) (without the JAR)
* a `.gitignore` file
* a configured [Jacoco Plugin](https://www.eclemma.org/jacoco/trunk/doc/maven.html) for test coverage
* my frequently used test dependencies
* an optionally configured [Maven Assembly Plugin](https://maven.apache.org/plugins/maven-assembly-plugin/) 
for creating executable JARs with all the necessary dependencies

## Usage

If the archetype is not in your local Maven repository, clone the Git repo then run `mvn install`.
To create a project from the archetype, run:

    mvn archetype:generate \
    -DarchetypeGroupId=nemethi \
    -DarchetypeArtifactId=kickstart \
    -DarchetypeVersion=1.0

You may specify `-DgroupId=<your-group-id>`, `-DartifactId=<your-artifact-id>` and `-Dversion=<your-version>` but you can edit the default values while generating the project.
With the `-DexecutableJar=<yes|no>` property you may configure whether your project's JAR should include all necessary dependencies and be executable.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
