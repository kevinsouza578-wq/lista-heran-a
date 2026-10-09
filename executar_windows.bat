@echo off
chcp 65001 >nul
cd /d "%~dp0"
where javac >nul 2>nul
if errorlevel 1 (
  echo Instale um JDK e confira se javac esta no PATH.
  pause
  exit /b 1
)
if not exist bin mkdir bin
javac -encoding UTF-8 -d bin src\Main.java src\historia1\*.java src\historia2\*.java src\historia3\*.java src\historia4\*.java src\historia5\*.java
if errorlevel 1 (
  pause
  exit /b 1
)
java -cp bin Main
pause
