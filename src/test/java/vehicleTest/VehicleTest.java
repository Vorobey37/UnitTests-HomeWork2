package vehicleTest;

import org.example.Car;
import org.example.Motorcycle;
import org.example.Vehicle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class VehicleTest {

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром
     * транспортного средства (используя оператор instanceof)
     */
    @Test
    void isCarIsInstanceOfVehicle(){

        Car skoda = new Car("Skoda", "Octavia", 2008);
        assertThat(skoda).isInstanceOf(Vehicle.class);

    }

    /**
     * Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void howManyWheelsInCar(){

        Car skoda = new Car("Skoda", "Octavia", 2008);
        assertThat(skoda.getNumWheels()).isEqualTo(4);

    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами
     */
    @Test
    void howManyWheelsInMotorcycle(){

        Motorcycle suzuki = new Motorcycle("Suzuki", "Rock300", 2023);
        assertThat(suzuki.getNumWheels()).isEqualTo(2);

    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения
     * (используя метод testDrive())
     */
    @Test
    void carSpeedDuringTestDrive(){

        Car skoda = new Car("Skoda", "Octavia", 2008);
        skoda.testDrive();
        assertThat(skoda.getSpeed()).isEqualTo(60);

    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения
     * (используя метод testDrive())
     */
    @Test
    void motorcycleSpeedDuringTestDrive(){

        Motorcycle suzuki = new Motorcycle("Suzuki", "Rock300", 2023);
        suzuki.testDrive();
        assertThat(suzuki.getSpeed()).isEqualTo(75);

    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
     * движения транспорта) машина останавливается (speed = 0)
     */
    @Test
    void carSpeedDuringParking(){

        Car skoda = new Car("Skoda", "Octavia", 2008);
        skoda.testDrive();
        skoda.park();
        assertThat(skoda.getSpeed()).isEqualTo(0);

    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция
     * движения транспорта) мотоцикл останавливается (speed = 0)
     */
    @Test
    void motorcycleSpeedDuringParking(){

        Motorcycle suzuki = new Motorcycle("Suzuki", "Rock300", 2023);
        suzuki.testDrive();
        suzuki.park();
        assertThat(suzuki.getSpeed()).isEqualTo(0);

    }
}