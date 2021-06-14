package com.project.onlineAdminisionSystem.repository;

import com.project.onlineAdminisionSystem.entity.Address;

public interface IAddressRepository
{
	public Address addAddress(Address address);
	public int deleteAddressById(int addressId);
//	public int deleteAddressByCity(String city);
	public boolean updateAddress(Address newAddress);
	public Address getAddressById(int addressId);
	

}
