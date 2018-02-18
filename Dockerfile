FROM odenktools/docker-play-base:v1

ENV PROJECT_HOME /opt
ENV PLAY_PORT 9000
ENV PORT 9000
ENV MICROSERVICE_NAME minimal-play-java

RUN mkdir -p ${PROJECT_HOME}/${MICROSERVICE_NAME}
RUN mkdir -p ${PROJECT_HOME}/${MICROSERVICE_NAME}/out
COPY . ${PROJECT_HOME}/${MICROSERVICE_NAME}
WORKDIR ${PROJECT_HOME}/${MICROSERVICE_NAME}

RUN activator clean stage

CMD target/universal/stage/bin/${MICROSERVICE_NAME} -Dhttp.port=${PORT} -DapplyEvolutions.default=true

EXPOSE ${PLAY_PORT}