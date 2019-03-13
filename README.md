# Project  Avalon

## Requirements

1. user can register account and login with email/password
  + Planed to use OAuth2 flow. 
2. after user login, user will have the access to the service to do maxSum calculation
  + This project is fully decoupled FE & BE architecture.
  + the front-end is Angular 7 SPA, which requires no servlet to render.
  + The front-end part will be served by `Nginx` server.
  + The back-end part will be served by `Spring Boot (Tomcat)` server.
  + Two parts are connected using reverse proxy.
  + Because of this. This project can be deployed to serverlees environment (e.g. AWS Lambda).
3. design a way so user can pass the tree to backend service
  + Ideal UX will be user seeing a live-rendered tree whiling inputting data.
    + This will involve HTML5 canvas rendering, maybe some WebGL.
    + This function itself can takes days to complete.
    + I have provided a minimal UI which let user to input data in BFS array notation.
4. Which DB to use will be your own choice
  + MongoDB in container.
5. the whole application will be running in an isolated env e.g. docker
  + There're tree images - client, server and DB.
  + Using `docker-compose` to group them together.
6. need to think about situations like: what if the tree is big, what if lots of users are using the service at same time, how can your service handle the load
  + The plan is below (have no time to implement):
    + Each request will be stored to DB as a `TaskQueue`.
    + A workflow will be processing the queue and save the result.
    + The data will be cached to speed up duplicated queries. (e.g. when the same tree was inputted again,
      retrieves the result from the cache)
      + The key of the cache can be the hash value of the tree values.
    + When the workflow is completed process a `TaskQueue` send notification to the user.
      + The notification can be implemented using WebSocket.
      + For the case when the process takes long time, we can use HTML5 push notification.
      
      
### What is completed
+ Client - server - DB architecture.
+ Client - Angular SPA
  + Basic RWD
+ Server - SpringBoot (MVC)
  + Also save and get data from DB.
+ Docker images and docker-compose config.
+ The Tree algorithms.
  + Make a Binary tree from BFS array notation.
  + Calculate the result.
+ The build script


## Build

### Prerequisites

+ node v8+ and npm
+ docker
+ gradle

### How to build

Just execute `build.sh`

### How to start

`docker-compose up`
Visit `http://localhost` to access the website.