package com.dws.isobarfm.integration;

import com.dws.isobarfm.integration.dto.BandResourceDTO;
import feign.RequestLine;

import java.util.List;

public interface BandClient {

    @RequestLine("GET /")
    List<BandResourceDTO> findBands();

}
