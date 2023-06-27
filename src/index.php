<?php


$con = new mysqli("mysql_server","root","root","mysql");


if ($con) {
   echo "Success";
} else {
   echo "Error";
}


?>
