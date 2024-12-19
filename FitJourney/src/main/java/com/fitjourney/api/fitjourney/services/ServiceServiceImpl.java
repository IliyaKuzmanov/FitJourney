package com.fitjourney.api.fitjourney.services;

import com.fitjourney.api.fitjourney.repositories.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceServiceImpl implements ServiceService {

    private final ServiceRepository serviceRepository;

    public ServiceServiceImpl(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }


    @Override
    public List<com.fitjourney.api.fitjourney.models.Service> getAllServices() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<com.fitjourney.api.fitjourney.models.Service> getServiceById(Long id) {
        return serviceRepository.findById(id);
    }

    @Override
    public com.fitjourney.api.fitjourney.models.Service createService(com.fitjourney.api.fitjourney.models.Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void deleteService(Long id) {
        if (serviceRepository.existsById(id)) {
            serviceRepository.deleteById(id);
        } else {
            throw new RuntimeException("Service not found with id: " + id);
        }
    }
}
