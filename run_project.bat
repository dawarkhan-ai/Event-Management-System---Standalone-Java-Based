@echo off
cd src

echo Compiling Java files...
javac -encoding UTF-8 -cp ".;../lib/mysql-connector-j-9.3.0.jar" main/MainFrame.java gui/*.java dao/*.java service/*.java model/*.java database/*.java

if %errorlevel% neq 0 (
    echo ❌ Compilation failed!
    pause
    exit /b
)

echo Running the application...
java -cp ".;../lib/mysql-connector-j-9.3.0.jar" main.MainFrame

pause