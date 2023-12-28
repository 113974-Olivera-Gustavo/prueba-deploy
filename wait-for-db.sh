#!/bin/sh
# wait-for-db.sh

set -e

host="$1"
shift
cmd="$@"

until PGPASSWORD=$POSTGRES_PASSWORD psql -h "$host" -U "$POSTGRES_USER" -d "$POSTGRES_DB" -c '\q'; do
  >&2 echo "La base de datos no está disponible todavía - esperando..."
  sleep 1
done

>&2 echo "La base de datos está disponible, continuando..."
exec $cmd
