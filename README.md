# spring-boot-elasticseach


## ELK stack

![alt text](./documents/imgs/big-picture.png "big-picture")



## Compare Database vs Elasticsearch
![alt text](./documents/imgs/comparetable.png "comparetable")



We use docker-compose to create ELK instance. Below a few command are step of 
up the instance. 

### Open a terminal and go to the project directory. use `cd documents` command to locate to the docker-compose.yml file.

```
cd documents
```
### Run `docker-compose up -d` command
```
docker-compose up -d
```
Open your web browser `http://localhost:5601/`. 

![alt text](./documents/imgs/kibana.png "kibana")

Check a cluster name by `http://localhost:9200/`

![alt text](./documents/imgs/cluster.png "Cluster")


### Test create document via postman tools
![alt text](./documents/imgs/postman.png "Postman")


### Test search via Kibana Dev Tools

```
GET customer/_search
{
  "query": {
    "terms": {
      "firstName.keyword": [ "Boonkuae" ] 
    }
  }
}

```

![alt text](./documents/imgs/search-via-dev-tools.png "Search Via Dev Tools")
