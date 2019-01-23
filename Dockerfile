FROM rabbitmq:3.7.8-management
LABEL maintainer = "serkaneren89@gmail.com"

RUN rabbitmq-plugins enable rabbitmq_stomp --offline

#Expose ports
EXPOSE 5672
EXPOSE 15674
EXPOSE 61613