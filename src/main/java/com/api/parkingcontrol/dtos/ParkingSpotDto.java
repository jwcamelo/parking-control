package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ParkingSpotDto {
	
	public ParkingSpotDto(){}

	@NotBlank
	private String parkingSpotNumber;
	
	@NotBlank
	@Size(max = 7)
	private String licensePlateCar;
	
	@NotBlank
	private String brandCar;
	
	@NotBlank
	private String modelCar;
	
	@NotBlank
	private String colorCar;
	
	@NotBlank
	private String responsibleName;
	
	@NotBlank
	private String apartment;
	
	@NotBlank
	private String block;

	@Override
	public String toString() {
		return "ParkingSpotDto [apartment=" + apartment + ", block=" + block + ", brandCar=" + brandCar + ", colorCar="
				+ colorCar + ", licensePlateCar=" + licensePlateCar + ", modelCar=" + modelCar + ", parkingSpotNumber="
				+ parkingSpotNumber + ", responsibleName=" + responsibleName + "]";
	}

	public String getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public String getLicensePlateCar() {
		return licensePlateCar;
	}

	public String getBrandCar() {
		return brandCar;
	}

	public String getModelCar() {
		return modelCar;
	}

	public String getColorCar() {
		return colorCar;
	}

	public String getResponsibleName() {
		return responsibleName;
	}

	public String getApartment() {
		return apartment;
	}

	public String getBlock() {
		return block;
	}

	
	
	
}
