@echo off
SETLOCAL
SET DIRNAME=%~dp0%
IF "%DIRNAME%" == "" SET DIRNAME=.
SET APP_BASE_NAME=%~n0%
SET APP_HOME=%DIRNAME%
SET MAVEN_PROJECTBASEDIR=%MAVEN_BASEDIR%
IF NOT DEFINED MAVEN_PROJECTBASEDIR SET MAVEN_PROJECTBASEDIR=%APP_HOME%
FOR /F "tokens=*" %%i IN ('"findstr /C:"^#.*%APP_BASE_NAME%\.bat" "%~f0"') DO SET "MAVEN_CMD_LINE_ARGS=%%i"
SET MAVEN_CMD_LINE_ARGS=%MAVEN_CMD_LINE_ARGS:#=%
CALL "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" >NUL 2>&1 && SET MAVEN_JAVA_EXE=%JAVA_HOME%\bin\java && goto OkJHome
SET MAVEN_JAVA_EXE=java && goto OkJHome
:OkJHome
IF DEFINED JAVA_HOME IF EXIST "%JAVA_HOME%\bin\java.exe" SET MAVEN_JAVA_EXE="%JAVA_HOME%\bin\java.exe"
@REM Execute "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" to get JVM config
CALL "%MAVEN_PROJECTBASEDIR%\.mvn\jvm.config" >NUL 2>&1
"%MAVEN_JAVA_EXE%" %MAVEN_OPTS% -classpath "%MAVEN_PROJECTBASEDIR%\.mvn\wrapper\maven-wrapper.jar" "-Dmaven.home=%M2_HOME%" "-Dmaven.multiModuleProjectDirectory=%MAVEN_PROJECTBASEDIR%" "-Dmaven.wagon.http.ssl.easy=false" org.apache.maven.wrapper.MavenWrapperMain %MAVEN_CMD_LINE_ARGS%
ENDLOCAL