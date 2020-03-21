# MahjongLogger

## Architecture

- API: SpringBoot
- Front: Vue + TS
- DB: PostgreSQL11 on CloudSQL

## Run on your local docker

### Windows Docker ToolBox

1. get the VM IP using `docker system info`
    ```
    No Proxy: 192.168.99.100
    ```
1. edit docker-compose.yaml, replace "localhost" with the VM IP

    ```docker-compose.yaml
    SERVER_NAME: 192.168.99.100
    ```
1. `docker-compose up -d`

### Others

```
docker-compose up -d
```

## GKE Services

- production: http://34.97.121.22
- staging: http://34.97.69.219