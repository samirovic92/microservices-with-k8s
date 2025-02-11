# Microservices with k8s

### Build project with maven

cd ./departement-service/mvnw clean package

cd ./user-service/mvnw clean package

### Run Docker Compose

docker-compose up

### Load the Local Image into Minikube (If Using Minikube)
If your K8s cluster is running inside Minikube, it won’t see your local Docker images. You need to load the image into Minikube:

minikube image load user-service-app:latest

minikube image load department-service-app:latest



### Deploy all components in k8s directory :

k apply -f .
