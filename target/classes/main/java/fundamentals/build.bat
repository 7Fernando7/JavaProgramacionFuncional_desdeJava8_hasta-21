@echo off
setlocal

rem Ruta relativa de tu archivo fuente
set SRC_DIR=src
set OUT_DIR=out
set MAIN_CLASS=fundamentals.real_applications.StrategyLambdas

rem Crear carpeta de salida si no existe
if not exist %OUT_DIR% (
    mkdir %OUT_DIR%
)

rem Compilar
echo Compilando...
javac -d %OUT_DIR% %SRC_DIR%\fundamentals\real_applications\StrategyLambdas.java
if %errorlevel% neq 0 (
    echo ❌ Error al compilar.
    exit /b %errorlevel%
)

rem Ejecutar
echo Ejecutando...
java -cp %OUT_DIR% %MAIN_CLASS%

endlocal
pause