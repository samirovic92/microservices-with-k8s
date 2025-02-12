# Microservices with Kubernetes (K8s)

### Overview
In this project, I created three services (**departments**, **users**, and **api-gateway**). I built the image of each service using Docker Compose and deployed them in a local Kubernetes cluster (Minikube).

Only the **API Gateway** is accessible from outside the cluster via **Ingress**.

**Note:** Before starting, ensure you have **Docker** and **Minikube** installed on your local machine.

---

## Building the Project with Maven

From the root of the project, run the following commands:

```sh
cd ./departement-service && ./mvnw clean package

cd ./user-service && ./mvnw clean package

cd ./api-gateway && ./mvnw clean package

  ```

### Building the Images with Docker Compose

  ```
docker compose up
  ```

### Loading Local Images into Minikube

If your K8s cluster is running inside Minikube, it won’t see your local Docker images. You need to load the image into
Minikube:

  ```
minikube image load user-service-app:latest department-service-app:latest api-gateway-app:latest
  ```

### Deploying All Components in Kubernetes :

Run the following command inside the k8s directory:

  ```
 kubectl apply -f .
  ```

### Exposing the API Gateway Outside the Cluster

✅ Enable Ingress: 
  ```
minikube addons enable ingress
  ```

✅ Start the tunnel: (Keep this window open!)
  ```
minikube tunnel 
  ```

**For Mac Os :**

  ```
127.0.0.1 my-api.example.com
  ```

**For Linux :**
✅ Find Minikube IP: 
  ```
minikube ip
  ```

✅ Update /etc/hosts (replace 172.17.0.15 with the actual Minikube IP):

  ```
172.17.0.15 my-api.example.com
  ```

### Testing the API

**Create department :**

  ```
curl --location 'http://my-api.example.com/department' \
        --header 'Content-Type: application/json' \
        --data '{
            "name": "Department 1",
            "address" : "Paris, France"
        }'
  ```

**Retrieve a Department by Id :**

  ```
curl --location 'http://my-api.example.com/department/1'
  ```

**Create User :**

  ```
curl --location 'http://my-api.example.com/user' \
     --header 'Content-Type: application/json' \
        --data-raw '{
                    "firstName": "user firstname",
                    "lastName": "user lastname",
                    "email": "user@gmail.com",
                    "departmentId": "1"
        }'
  ```

**Retrieve User by Id :**

Replace ${id} with the ID from the previous API response:

  ```
curl --location 'http://my-api.example.com/user/${id}'
  ```