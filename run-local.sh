#!/usr/bin/env sh

# cd api-user-mso
# gradle clean buildImage 

cd discovery-server
./generaImagen.sh

cd ../

cd api-user-mso
./generaImagen.sh

cd ../

cd api-user
./generaImagen.sh

# cd ../

# cd api-post-mso
# ./generaImagen.sh

# cd ../

# cd api-date-mso
# ./generaImagen.sh

docker-compose up --build

docker-compose stop
docker-compose kill
docker-compose rm -f
