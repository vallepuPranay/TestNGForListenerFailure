#!/bin/bash
javadoc -docletpath target/TestNGForListenerFailure-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet Pranay.TestNGForListenerFailure.Doclet "$@"
