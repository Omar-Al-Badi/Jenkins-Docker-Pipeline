<?php

$con = new mysqli("mysql_db","root","root","mysql");

if ($con) {
    echo "Success";
} else {
    echo "Error";
}

?>