package com.fitjourney.api.fitjourney.services;

import com.fitjourney.api.fitjourney.models.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceService {

    List<Service> getAllServices();
    Optional<Service> getServiceById(Long id);
    Service createService(Service service);
    void deleteService(Long id);
}
