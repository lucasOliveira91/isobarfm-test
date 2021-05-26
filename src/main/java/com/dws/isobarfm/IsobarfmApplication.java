package com.dws.isobarfm;

import com.dws.isobarfm.integration.BandClient;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IsobarfmApplication {

	public static void main(String[] args) {
		SpringApplication.run(IsobarfmApplication.class, args);
	}

	@Bean
	public BandClient getBandFeign() {
		return  Feign.builder()
				.client(new OkHttpClient())
				.encoder(new GsonEncoder())
				.decoder(new GsonDecoder())
				.logger(new Slf4jLogger(BandClient.class))
				.logLevel(Logger.Level.FULL)
				.target(BandClient.class, "https://iws-brazil-labs-iws-recruiting-bands-staging.iwsbrazil.io/api/full");
	}
}
