#!/bin/bash

JAVA_HOME=/opt/jdk1.7.0_45
CLASSPATH=$JAVA_HOME/lib/tools.jar:$JAVA_HOME/jre/lib/rt.jar:$CLASSPATH:../spring-shell-showcase.jar:../config/:..

echo ""
echo "JAVA_HOME $JAVA_HOME"
echo ""
echo "CLASSPATH $CLASSPATH"
echo ""
echo "***************************************************************"
echo "StartUp spring-shell-showcase"
echo "***************************************************************"

$JAVA_HOME/bin/java $JAVA_OPTIONS com.njq.nongfadai.Application

read -n1 -p "Please any key to continue..."
 