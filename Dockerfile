FROM java:8-jdk

ENV LANGUAGE 'chinese'

RUN mkdir /app

COPY ./build/libs/*.jar /app

WORKDIR /app

ENTRYPOINT java -jar /app/*.jar $LANGUAGE