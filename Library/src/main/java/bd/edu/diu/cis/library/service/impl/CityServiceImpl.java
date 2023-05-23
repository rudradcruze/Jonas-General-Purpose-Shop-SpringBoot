package bd.edu.diu.cis.library.service.impl;

import bd.edu.diu.cis.library.repository.CityRepository;
import bd.edu.diu.cis.library.model.City;
import bd.edu.diu.cis.library.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
