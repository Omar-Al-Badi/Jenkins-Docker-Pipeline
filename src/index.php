<?php

$con = new mysqli("MariaDB_db", "root", "root", "mysql");

if ($con) {
   echo "Success";
} else {
   echo "Error";
}
?>
