<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css">
    <title>PHP web site</title>

</head>
<body>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
      <h5 class="my-0 mr-md-auto font-weight-normal">School Portal</h5>
      <nav id="загаловка1" class="my-2 my-md-0 mr-md-3">
        <a class="p-2 text-dark" href="#">Главная</a>
        <a class="p-2 text-dark" href="#">Контакты</a>

      </nav>
      <a class="btn btn-outline-primary" href="#">Sign up</a>
    </div>
 
    <div id="container" class="row row-cols-md-5 mb-3 text-center">
      <?php
        for($i = 0 ;$i < 4;  $i++):
    ?>    
    <div  class="col">
        <div class="card-deck mb-3 text-center">

                <div class="card mb-2 box-shadow">
                        <div class="card-header">
                            <h4 class="my-0 ">Наша Школа</h4>
                        </div>
                        <div class="card-body">
                            <img id="imgSchools" src="img/schools/<?php echo($i+1)?>.jpg" class="img-thumbnail">
                            <h1 class="card-title pricing-card-title">$0 <small class="text-muted">/ mo</small></h1>
                            <ul class="list-unstyled mt-3 mb-4">
                            <li>10 users included</li>
                            <li>2 GB of storage</li>
                            <li>Email support</li>
                            <li>Help center access</li>
                            </ul>
                            <button type="button" class="btn btn-lg btn-block btn-outline-primary">Sign up for free</button>
                        </div>
                        </div>
        </div>
        </div>
    <?php endfor?>
    </div>
    
  
</body>
</html>