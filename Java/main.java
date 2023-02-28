class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        UberX UberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"), "Chevrolet", "Spark");
        UberX.setPassenger(2);
        UberX.printDataCar();

//        Car car2 = new Car("QWE567", new Account("Andrea Herrera", "AMD456"));
//        car2.passenger = 3;
//        car2.printDataCar();
      };
    }