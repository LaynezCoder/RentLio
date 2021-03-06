package com.chamodshehanka.rentlio.common.services.custom;

import com.chamodshehanka.rentlio.common.dto.DriverDTO;
import com.chamodshehanka.rentlio.common.services.SuperService;

import java.util.List;

/**
 * @author chamodshehanka on 3/13/2018
 * @project RentLio
 **/
public interface DriverService extends SuperService{

    public boolean addDriver(DriverDTO driverDTO)throws Exception;

    public boolean updateDriver(DriverDTO driverDTO) throws Exception;

    public boolean deleteDriver(String driverId) throws Exception;

    public DriverDTO findByIdDriver(String driverId)throws Exception;

    public List<DriverDTO> getAllDrivers() throws Exception;

}
