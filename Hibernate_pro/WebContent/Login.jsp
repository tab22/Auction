<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"/>

<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>


<style>

.form-container{
border: 1px solid #fff; padding:  50px 50px; margin-top:20vh;
-webkit-box-shadow: -2px 3px 5px 17px rgba(0,0,0,0.75);
-moz-box-shadow: -2px 3px 5px 17px rgba(0,0,0,0.75);
box-shadow: -2px 3px 5px 17px rgba(0,0,0,0.75);

}

.bg { 
  background: url(http://lorempixel.com/1920/1920/city/9/) no-repeat center center fixed; 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.panel-default {
opacity: 0.9;
margin-top:30px;
}
.form-group.last { margin-bottom:0px; }
</style>
</head>
<body>






 <div class="container-fluid bg">
    <div class="row">
        <div class="col-md-5 col-md-offset-5">
            <div class="panel panel-primary" style="width:100%;height:80%">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-lock"></span> Login</div>
                <div class="panel-body">
                    <form class="form-container form-horizontal " role="form">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-3 control-label">
                            Username</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" id="uname"  name="name" placeholder="Email" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-3 control-label">
                            Password</label>
                        <div class="col-sm-9">
                            <input type="password" class="form-control" id="pwd"  name="password" placeholder="Password" required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="col-sm-offset-3 col-sm-9">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox"/>  Remember me </label>
                              
                            </div>
                        </div>
                    </div>
                    <div class="form-group last">
                        <div class="col-sm-offset-3 col-sm-9">
                            <button type="submit" class="btn btn-success btn-sm">
                                Sign in</button>
                                 <button type="reset" class="btn btn-default btn-sm">
                                Reset</button>
                        </div>
                    </div>
                    </form>
                </div>
                <div class="panel-footer" style="text-align: center">
                    Not Registred? 
                    <br><br><a href="InserBidder.jsp">Bidder Registration</a> &nbsp;&nbsp;  <a href="InsertSeller.jsp">Seller Registration</a></div>
            </div>
        </div>
    </div>                                             
</div>

    
    


<div class="container-fluid ">
<div class="row">
<div class="col-md-4 col-xs-12"></div>
<div class="col-md-4 ">

</div>
<div class="col-md-4 col-xs-12"></div>
 
</div>
</div>




</body>
</html>