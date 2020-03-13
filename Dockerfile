FROM bdinnovations/java8:1.0.1



ARG JAR_FILE
#ARG APP_FILE
ENV APP_JAR_FILE=$JAR_FILE
COPY ${JAR_FILE} /home/app/
EXPOSE 9696
RUN echo "java -jar $APP_JAR_FILE --spring.config.location=file:./application.yml" > ./entrypoint.sh && mv *.jar $APP_JAR_FILE
ENTRYPOINT ["sh", "./entrypoint.sh"]
