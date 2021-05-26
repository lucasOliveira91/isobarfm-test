package com.dws.isobarfm.controller;

import com.dws.isobarfm.integration.dto.BandResourceDTO;
import com.dws.isobarfm.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("bands")
public class BandController {

    @Autowired
    private BandService bandService;

    @GetMapping
    public List<BandResourceDTO> getBands() {
        return  bandService.findBands();
    }

}
