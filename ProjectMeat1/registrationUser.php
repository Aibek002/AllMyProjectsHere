<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
    <link rel="stylesheet" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/dist/mdb5/standard/core.min.css">
    <link rel="stylesheet" id="roboto-subset.css-css" href="https://mdbcdn.b-cdn.net/wp-content/themes/mdbootstrap4/docs-app/css/mdb5/fonts/roboto-subset.css?ver=3.9.0-update.5" type="text/css" media="all">
    <link rel="stylesheet" href="css/loginstyle.css">    
    <title>Document</title>
</head>
<body  class="text-center">
    <form action="database/signup.php" "enctype="multipart/form-data" id="form1" method="post" class="form-signin">
    
      <h1 id="h1Font" class="h3 mb-3 font-weight-normal">Please sign in</h1>
     <input type="text" id="inputName" name="full_name" class="form-control" placeholder="full name" required="" autofocus=""> <label for="inputEmail" class="sr-only">Full Name</label><br>
     </p><p>
      <br><br>
      <input type="email" id="inputEmail" name="email" class="form-control" placeholder="Email address" required="" autofocus=""></p>
      
      <br>
      <br>
      
      <br>
      <label for="inputPassword" name="password" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required="">
      
            <br><div class="checkbox mb-3">
        <label>
          <br><br><br>
        <input type="password" name="confirmpassword" id="inputPassword1" class="form-control" placeholder="Confitm Password" required="">
       
      <br><div class="checkbox mb-3">
  <label>
        </label>
      </div>
      
      <br>
      <br>
      <button id="buttonSubmit" class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>

      <br>
      <br>
      <br>
      <br>
<p >
      <span style="margin: 10%;">Если у вас уже есть аккаунта то <a href="login.php"> Авторизуйтесь</a> </span></p>
     
    </form>
  

</body>
</html>
