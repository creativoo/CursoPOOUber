<?php
require_once('Car.php');
require_once('UberX.php');
require_once('UberPool.php');
require_once ("Account.php");

$UberX = new UberX("CHF234", new Account ("Andres Herrera", "AND456"), "Chevrolet", "Spark");
$UberX ->printDataCar();

$UberPool = new UberPool("CHF234", new Account ("Andrea Ferran", "ANDA27"), "Dodge", "Attitude");
$UberPool -> printDataCar();
?>