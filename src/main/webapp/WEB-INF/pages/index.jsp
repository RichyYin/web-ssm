<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>IDEA搭建SpringMVC并用maven配置的小例子</title>
  </head>
  <%--<link rel="stylesheet" href="/asset/css/style.css"/>--%>
  <script type="text/javascript" src="/web-ssm/plugins/js/jquery-3.3.1.min.js"></script>

  <body>
        <form id="userForm" action="/web-ssm/user/name" method="post">
          用户名：<input type="text" name="username"><br>
          密码：<input type="password" name="password">
          <button type="button" onclick="login()">登录</button>
        </form>
  </body>
<script>
    function login() {
        $.ajax({
            type: 'post',
            url: $('#userForm').attr('action'),
            data: $('#userForm').serialize(),
            dataType: 'json',
            success: function(data){
                if (data.result = "success"){
                    alert("登录成功: " + data.name);
                    location.href='/web-ssm/user/success?name=' + data.name;
                }else{
                    alert("用户名或者密码错误！");
                }
            }
        });
    }


</script>
</html>