# Appium Confluedent Test
Se trata de un proyecto de automatización de pruebas para aplicaciones móviles usando Appium con Java.

## Requisitos previos
Antes de empezar a trabajar con este proyecto, debes asegurarte de tener lo siguiente instalado:

- Java Development Kit (JDK) versión 8 o superior.
- Android SDK instalado y configurado correctamente. También debes configurar tus variables de entorno ANDROID_HOME y PATH.
- Appium instalado y configurado correctamente. También debes configurar tus variables de entorno APPIUM_HOME y PATH.
- Un dispositivo Android o un emulador configurado (Android Studio y Appium Server) y listo para ser usado.

## Configuración del proyecto
Clona este repositorio en tu máquina local:
```git clone https://github.com/boorjagallegoo/appiumWithJava.git```

Importa el proyecto en tu IDE de preferencia. En este caso, recomendamos usar IntelliJ IDEA.

Configura las dependencias necesarias. Estas se encuentran en el archivo `pom.xml`.

## Ejecución
Para ejecutar las pruebas, simplemente puedes ejecutar cada feature file o el archivo `appiumConfuedentTest/src/test/java/com/RunCukeTest.java`

## Estructura del proyecto
```

└── appiumConfluedentTest/
    ├── .run/
    ├── src/
    │   ├── main/
    │   └── test/
    │       ├── java/
    │       │   └── com/
    │       │       ├── appium/
    │       │       │   ├── pages/
    │       │       │   ├── scripts/
    │       │       │   └── stepsDefinitons/
    │       │       ├── hooks/
    │       │       ├── utils/
    │       │       └── RunCukeTest.java
    │       └── resources/  
    ├── pom.xml
    ├── .gitignore
    └── README.md
```
- run/: contiene los archivos de configuracion para la ejecucion de los test con JUNIT
- pages/: Contiene los elementos, los metodos de cada Screen y `baseAppium.java`.
- scripts/: Contiene los metodos personalizados para manejar los elementos y archivos de datos para las pruebas.
- stepsDefinitons/: Contiene las definiciones de los pasos.
- hooks/: contiene los Hooks.
- utils/: contiene la clase `propertyLoader.java`
- resources/: contiene los features file, y las properties(keys y params), en los ficheros params configuraremos los directorios donde almacenemos las APPS
- .gitignore: Archivo de configuracion de git.
- README.md: Archivo de documentación del proyecto.

## Contribución
Si quieres contribuir a este proyecto, puedes hacer un fork y crear un pull request con tus cambios. También puedes abrir un issue si encuentras algún problema o bug.
