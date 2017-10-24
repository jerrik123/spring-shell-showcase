@ECHO OFF

SETLOCAL

@REM Initialize the common environment.

set JAVA_HOME=D:\tools\Java\jdk1.7.0_79
set CLASSPATH=$JAVA_HOME/lib/tools.jar;$JAVA_HOME/jre/lib/rt.jar;$CLASSPATH;../lib/;../spring-shell-showcase.jar;../config/;..

echo .
echo CLASSPATH=%CLASSPATH%
echo .
echo PATH=%PATH%
echo .
echo ***************************************************
echo *  StartUp spring-shell		                   *
echo ***************************************************

java -classpath %CLASSPATH% com.njq.nongfadai.Application


ENDLOCAL
pause