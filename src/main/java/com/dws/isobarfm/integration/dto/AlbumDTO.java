package com.dws.isobarfm.integration.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AlbumDTO {

    private String name;
    private String image;
    private String band;
    private Integer duration;
    private LocalDateTime releasedDate;
}
