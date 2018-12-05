FROM java:8

RUN mkdir app
COPY ./target/maihama-dockside.war /app
WORKDIR /app
CMD ["java", "-jar", "maihama-dockside.war"]