# Calculadora Spring-Boot
Calculadora como micro-servicio (API) utilizando Spring-boot y Maven con funcionalidades básicas de sumar, restar, multiplicar y dividir.
<<<<<<< HEAD
Leer el [enunciado](https://github.com/oscarga/calculadora/blob/master/enunciado.md) para más información.

Comunicación a través de una API REST (p.e. ```GET /api/calculadora?numero1=2&numero2=3&operador=suma```)

Contiene la integración de las librerías locales [tracer](https://github.com/oscarga/calculadora/tree/master/lib) en maven mediante el [maven-install-plugin](https://github.com/oscarga/calculadora/blob/master/pom.xml#L75) por lo que es necesario ejecutar `mvn clean install` antes de poder utilizar el proyecto.
=======
Leer el [enunciado](https://github.com/oscargasoy/calculadora/blob/main/enunciado.md) para más información.

Comunicación a través de una API REST (p.e. ```GET /api/calculadora?numero1=2&numero2=3&operador=sumar```)

Contiene la integración de las librerías locales [tracer](https://github.com/oscargasoy/calculadora/tree/main/lib) en maven mediante el [maven-install-plugin](https://github.com/oscarga/calculadora/blob/main/pom.xml#L75) por lo que es necesario ejecutar `mvn clean install` antes de poder utilizar el proyecto.
>>>>>>> 83ef775 (segundo commit)

## Requisitos previos
Necesario disponer de la ultima versión de Maven instalada. Tambien hace falta tener JAVA instalado en el sistema.

## Como utilizar

<<<<<<< HEAD
1. Descargar el repositorio girhub
=======
1. Descargar el repositorio github
>>>>>>> 83ef775 (segundo commit)
2. Ejecutar una verificación de Maven
3. Instalación limpia de Maven
4. Ejecutar el JAR de la carpeta /target

Abrir una consola y ejecutar:

```
<<<<<<< HEAD
git clone https://github.com/oscarga/calculadora
=======
git clone https://github.com/oscargasoy/calculadora
>>>>>>> 83ef775 (segundo commit)
cd calculadora
mvn validate
mvn verify
mvn clean install
```

<<<<<<< HEAD
A estas alturas debería haberse generado una carpeta `/target` con el JAR definitivo del programa `calculadora-spring-boot.jar`. Para ejecutarlo:

`java -jar target/calculadora-spring-boot.jar`

Con estos pasos deberiamos tener a nuestra disposición una API REST escuchando en `http://localhost:8080/api/calcula`

Si has tenido algun error con la ejecución de las instrucciones anteriores, en el proyecto ya hay un JAR definitivo compilado con todas las dependencias, si quieres probar el proyecto directamente puedes (1) clonar el proyecto en local y (2) ejecutar el JAR precompilado [calculadora-spring-boot.jar](https://github.com/oscarga/calculadora/blob/master/target/calculadora-spring-boot.jar).

```
git clone https://github.com/oscarga/calculadora
java -jar calculadora/target7calculadora-spring-boot.jar
=======
A estas alturas debería haberse generado una carpeta `/target` con el JAR definitivo del programa `calculadora-0.0.1-SNAPSHOT.jar`. Para ejecutarlo:

`java -jar target/calculadora-0.0.1-SNAPSHOT.jar`

Con estos pasos deberiamos tener a nuestra disposición una API REST escuchando en `http://localhost:8080/api/calculadora`

Si has tenido algun error con la ejecución de las instrucciones anteriores, en el proyecto ya hay un JAR definitivo compilado con todas las dependencias, si quieres probar el proyecto directamente puedes (1) clonar el proyecto en local y (2) ejecutar el JAR precompilado [calculadora-spring-boot.jar](https://github.com/oscargasoy/calculadora/blob/main/target/calculadora-spring-boot.jar).

```
git clone https://github.com/oscargasoy/calculadora
java -jar calculadora/target/calculadora-spring-boot.jar
>>>>>>> 83ef775 (segundo commit)
```

## API REST
Si has seguido correctamente los pasos anteriores, deberias tener el puerto 8080 abierto y escuchando peticiones REST GET.

<<<<<<< HEAD
Los parámetros se le deben pasar por URL en formato URLEncoded. Los parametros son los siguientes `primero` el primer numero de la operación,
`segundo` el segundo numero de la operación y `operacion` una cadena de texto describiendo la operación a realizar (valores aceptados `suma`, `resta`, `multiplicación`, `division`). Por ejemplo:

`GET http://localhost:8080/api/calcula?primero=4&segundo=9&operacion=suma`

El resultado será un valor numerico con decimales (3 + 8 = 11):

`11.0`

## Ejecutar tests

Si has clonado e instalado todas las dependencias de maven en local, para ejecutar los [tests](https://github.com/oscarga/calculadora/tree/master/src/test/java) debes ejecutar el comando `mvn clean test`.

Si has encontrado algun error, no dudes en abrir una [issue](https://github.com/oscarga/calculadora/issues). Licencia Apache 2.0.
=======
Los parámetros se le deben pasar por URL en formato URLEncoded. Los parametros son los siguientes `numero1` el primer numero de la operación,
`numero2` el segundo numero de la operación y `operador` una cadena de texto describiendo la operación a realizar (valores aceptados `sumar`, `restar`, `multiplicar`, `dividir`). Por ejemplo:

`GET http://localhost:8080/api/calculadora?numero1=4&numero2=9&operador=sumar`

El resultado será un valor numerico con decimales (4 + 9 = 13):

`13.0`

## Ejecutar tests

Si has clonado e instalado todas las dependencias de maven en local, para ejecutar los [tests](https://github.com/oscargasoy/calculadora/tree/main/src/test/java/com/calculadora/test) debes ejecutar el comando `mvn clean test`.

Si has encontrado algun error, no dudes en abrir una [issue](https://github.com/oscargasoy/calculadora/issues). Licencia Apache 2.0.
>>>>>>> 83ef775 (segundo commit)

## Direcciones disponibles
localhost:8080/api/calculadora?numero1=4&numero2=9&operador=sumar

localhost:8080/api/calculadora?numero1=4&numero2=9&operador=restar

<<<<<<< HEAD
localhost:8080/api/calculadora?numero1=4&numero2=9&operador=dividir
=======
localhost:8080/api/calculadora?numero1=4&numero2=2&operador=dividir
>>>>>>> 83ef775 (segundo commit)

localhost:8080/api/calculadora?numero1=4&numero2=9&operador=multiplicar
