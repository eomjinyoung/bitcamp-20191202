# 컴퓨터와 소프트웨어		
[ ]컴퓨터와 소프트웨어의 관계를 이해한다.		
[ ]시스템 소프트웨어와 응용 소프트웨어를 구분할 수 있다.		

# 프로그램의 구동 원리		
[ ]컴퓨터에서 프로그램이 실행되는 원리를 이해한다.		
[ ]CPU 인스트럭션이 무엇인지 이해한다. (ARM CPU 기준)	검색	http://vision.gel.ulaval.ca/~jflalonde/cours/1001/h17/docs/arm-instructionset.pdf
[ ]CPU 인스트럭션과 실행 파일, OS의 관계를 이해한다.		
[ ]같은 CPU에 맞춰 작성된 실 행 파일이더라도 OS가 다르면 실행되지 않는 이유를 설명할 수 있다.		

# 중간 언어와 가상 머신		
[ ]중간 언어와 가상 머신이 등장한 이유와 이점을 설명할 수 있다.		
[ ]VM과 인터프리터, 런타임, 플레이어, 엔진의 역할을 이해한다.		
[ ]JIT(Just-in-time)과 AOT(ahead-of-time)이 무엇이고 등장한 이유를 이해한다.		

# 자바 바이트코드와 자바 가상 머신		
[ ]자바 바이트코드 실행 환경을 준비할 수 있다.		OpenJDK 설치, JAVA_HOME 과 PATH 환경 변수 설정, Sublime 편집기 설치
[ ]자바 바이트코드를 이해한다.	검색	https://docs.oracle.com/javase/specs/jvms/se13/jvms13.pdf
[ ]바이트코드와 클래스 파일(.class)의 관계를 이해한다.	/HelloWorld.class	https://medium.com/@davethomas_9528/writing-hello-world-in-java-byte-code-34f75428e0ad
[ ]클래스 파일과 JVM의 관계를 이해한다.		$ javap HelloWorld.class, $ javap -verbose HelloWorld.class
[ ]JVM을 이용하여 클래스 파일을 실행할 수 있다.		$ java HelloWorld

# 프로그래밍 언어와 컴파일		
[ ]컴파일 방식 프로그래밍이 등장한 이유를 이해한다.		
[ ]프로그래밍 언어와 컴파일, CPU 인스트럭션의 관계를 이해한다.		
[ ]컴파일러를 이용하여 소스 코드를 목적 코드(CPU 인스트럭션)로 생성하는 과정을 이해한다. (C 프로그래밍 언어 기준)	/module.c, /main.c	$ gcc -c 소스파일
[ ]링커를 이용하여 목적 코드가 들어 있는 파일을 하나로 묶어 실행 파일을 만드는 과정을 이해한다. (C 프로그래밍 언어 기준)		$ ld -o 실행파일 목적파일 목적파일 … -lSystem -macosx_version_min 10.13
[ ]"소스 파일, 목적파일, 실행 파일"과 "컴파일러, 링커"의 관계를 이해한다. (C 프로그래밍 언어 기준)		

# 컴파일러와 인터프리터		
[ ]인터프리트 방식 프로그래밍과 실행 과정을 이해한다.		
[ ]Node.js 자바스크립트 인터프리터를 준비할 수 있다.		https://nodejs.org/en/
[ ]인터프리터를 사용하여 소스 파일을 직접 실행하는 과정을 이해한다. (Node.js 기준)	/hello.js	$ node hello.js
[ ]컴파일 방식과 인터프리트 방식의 구동 원리를 이해한다.		
[ ]컴파일 방식과 인터프리트 방식의 장단점을 비교할 수 있다.		

# 자바 프로그래밍 절차		
[ ]자바의 프로그래밍 방식과 실행 원리를 이해한다.		
[ ]자바 코드와 바이트코드, 소스 파일과 클래스 파일의 관계를 이해한다.		
[ ]자바 컴파일러와 JVM의 역할을 이해한다.		
[ ]CLI 환경에서 컴파일을 수행할 수 있다.	/Hello.java	$ javac Hello.java
[ ]CLI 환경에서 자바 클래스 파일을 실행할 수 있다.	/Hello.java	$ java  Hello

# 소스 파일과 컴파일 결과 파일 분리 		
[ ]Maven 표준 디렉토리 구조를 만들 수 있다.		Maven 표준 디렉토리 구조에 맞춰 폴더를 생성
[ ]각 디렉토리의 용도를 이해한다.		
[ ]프로젝트 디렉토리에서 소스 디렉토리에 있는 자바 소스 파일을 컴파일 할 수 있다.	src/main/java/Hello2.java	$ javac src/main/java/Hello2.java
[ ]컴파일 할 때 컴파일 결과로 생성된 클래스 파일을 별도 디렉토리에 분리할 수 있다.	src/main/java/Hello2.java	$ javac -d bin/main src/main/java/Hello2.java
[ ]다른 디렉토리에 있는 클래스 파일을 실행할 수 있다.	src/main/java/Hello2.java	$ java -classpath bin/main Hello2

# 패키지와 소스 파일		
[ ]패키지의 용도를 이해하고 패키지를 생성할 수 있다.	com.ohoracs.basic	src/main/java/com/ohoracs/basic 디렉토리 생성
[ ]소스 파일에 작성한 코드가 패키지에 소속되게 할 수 있다.	src/main/java/com/ohoracs/basic/Hello3.java	
[ ]패키지에 소속된 소스 파일의 적절한 디렉토리 경로와 왜 그 위치에 놓아야 하는지 이해한다.		
[ ]컴파일 한 후 생성된 클래스 파일의 디렉토리 경로와 그 위치에 있어야 하는 이유를 안다.		
[ ]패키지에 소속된 클래스 파일을 실행할 수 있다.	src/main/java/com/ohoracs/basic/Hello3.java	$ java -cp bin/main com.ohoracs.basic.Hello3
[ ]패키지를 적용하지 않은 채로 그 소스 파일을 그냥 패키지 폴더에 둔다면 컴파일 할 때 어떤 문제가 발생하는지 안다.	src/main/java/com/ohoracs/basic/Hello4.java	

# Gradle 빌드 도구		
[ ]Gradle 빌드 도구를 이용하여 작업 폴더를 자바 프로젝트 폴더로 구성할 수 있다.	/프로젝트폴더	$ gradle init
[ ]Gradle로 생성된 src 디렉토리의 구조를 이해하고 설명할 수 있다.	/src	
[ ]src 디렉토리 외에 다른 디렉토리나 파일의 용도를 이해한다.		
