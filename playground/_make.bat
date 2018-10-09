cd /d %~dp0

copy ..\reference\Test.java src\*.*

pushd src
javac Test.java
java Test
popd
pause