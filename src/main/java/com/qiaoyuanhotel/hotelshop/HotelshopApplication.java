package com.qiaoyuanhotel.hotelshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qiaoyuanhotel.hotelshop.dao"})
public class HotelshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelshopApplication.class, args);
	}

}

