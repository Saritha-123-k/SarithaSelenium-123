set projectLocation=C:\Users\91801\eclipse-workspace\Saritha_Modular_Framework
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml