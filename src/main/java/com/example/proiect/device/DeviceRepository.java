package com.example.proiect.device;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {

    //SELECT * FROM device WHERE locatie = ?
    @Query("SELECT d FROM Device d WHERE d.locatie =?1")
    static Optional<Device> findDeviceByLocatie(String locatie) {
      // findDeviceByLocatie(String locatie).
    }
}
