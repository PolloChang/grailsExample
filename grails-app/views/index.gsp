<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Welcome to Grails</title>
</head>
<body>
<content>
    <g:select name="ex"
              from="${ex.Ex100.list()}"
              noSelection="['':'請選擇']"
              optionKey="id" optionValue="note"
    />
</content>

</body>
</html>
