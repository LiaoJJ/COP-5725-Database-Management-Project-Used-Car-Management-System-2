#!/bin/bash

source ~/.bash_profile

echo "The port is "
echo $PORT

java -Xss512k -Xmx256m -jar /app.jar --server.port=$PORT

sleep 5


/tini -- /usr/local/bin/docker-entrypoint.sh eswrapper  &


