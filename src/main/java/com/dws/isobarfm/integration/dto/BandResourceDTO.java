package com.dws.isobarfm.integration.dto;

import lombok.Data;
import java.util.List;

@Data
public class BandResourceDTO {

    private String id;
    private String name;
    private String image;
    private String genre;
    private String biography;
    private Long numPlays;
    private List<String> albums;
}
