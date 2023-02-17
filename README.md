# Audit Data Menggunakan JPA & Hibernate

- Reload project
    mvn clean install -Dskiptests=true
- Check image docker
    docker ps
- jalankan aplikasi
    docker-compose up
- hapus image
    docker rm $(docker ps -a -q)
- check database
    docker exec -it {idImage} psql -U postgres employeedb

jika terjadi error coba ganti ke jdk17
