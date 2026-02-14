FROM openjdk:17-jdk-slim


WORKDIR /server-core


COPY build/libs/LuaClanCore.jar /app/plugins/LuaClanCore.jar

CMD ["java", "-Xmx2G", "-jar", "paper.jar", "nogui"]
