package com.dws.isobarfm.service;

import com.dws.isobarfm.integration.BandClient;
import com.dws.isobarfm.integration.dto.BandResourceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BandService {

    @Autowired
    private BandClient bandClient;

    @Cacheable("bands")
    public List<BandResourceDTO> findBands() {
        return bandClient.findBands();
    }
}
