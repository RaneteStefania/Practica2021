package com.example.proiect.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public void deleteDevice(Long deviceId) {
        boolean exists = deviceRepository.existsById(deviceId);
       if(!exists){
           throw new IllegalStateException("device with id "+ deviceId + " does not exists");
       }
       deviceRepository.deleteById(deviceId);
    }


    public List<Device> getDevice(){
        return deviceRepository.findAll();
    }

    public void addNewDevice(Device device) {
        Optional<Device> deviceOptional = DeviceRepository.findDeviceByLocatie(device.getLocatie());
        if (deviceOptional.isPresent() ) {
            throw new IllegalStateException("Locatie ocupata");
        }
        deviceRepository.save(device);

       }

    }

