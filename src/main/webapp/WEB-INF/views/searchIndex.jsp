<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <!-- This file has been downloaded from Bootsnipp.com. Enjoy! -->
    <title>Forgot Password</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
        body{
    background:#c460e2;
}
.forget-pwd > a{
    color: #dc3545;
    font-weight: 500;
}
.forget-password .panel-default{
    padding: 31%;
    margin-top: -27%;
}
.forget-password .panel-body{
    padding: 15%;
    margin-bottom: -50%;
    background: #fff;
    border-radius: 5px;
    -webkit-box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
img{
    width:40%;
    margin-bottom:10%;
}
.btnForget{
    background: #c0392b;
    border:none;
}

.btnLogin{
    background: #982bc0;
    border:none;
}


.forget-password .dropdown{
    width: 100%;
    border: 1px solid #ced4da;
    border-radius: .25rem;
}
.forget-password .dropdown button{
    width: 100%;
}
.forget-password .dropdown ul{
    width: 100%;
}
    </style>
    <script src="http://code.jquery.com/jquery-1.11.1.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container forget-password">
            <div class="row">
                <div class="col-md-12 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-body">
                            <div class="text-center">
                                <img src="images/search1.png" alt="search-key" border="0">
                              
                                <div id="container">
                                    <h1 class="style-1">Search</h1>
                                </div>
                                <div id="container">
                                    <h1 class="style-2">Enter</h1>
                                </div>
                                <div id="container">
                                    <h1 class="style-3">Full Name</h1>
                                </div>
                                <!-- partial -->
                                
                            
                            
                                <form method="post" name="frm" action="search">
                                    <input type="text" name="findname" id="findname">
                                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<button class="btn btn-primary" type="submit" name="submit" value="Search">Search</button><br>
                                    <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="list" class="btn btn-warning">BACK TO USERLIST</a><br>
                                </form>
                            
                                  

                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<script type="text/javascript">

</script>
</body>
</html>
