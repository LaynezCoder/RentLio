package com.chamodshehanka.rentlio.server.business.custom;

import com.chamodshehanka.rentlio.common.dto.DriverDTO;
import com.chamodshehanka.rentlio.common.dto.ReservationDTO;
import com.chamodshehanka.rentlio.common.dto.VehicleDTO;
import com.chamodshehanka.rentlio.server.business.SuperBO;

import java.util.List;

/**
 * @author chamodshehanka on 3/14/2018
 * @project RentLio
 **/
public interface ReservationBO extends SuperBO{

    public boolean addReservation(ReservationDTO reservationDTO, VehicleDTO vehicleDTO, DriverDTO driverDTO)throws Exception;

    public boolean updateReservation(ReservationDTO reservationDTO)throws Exception;

    public boolean deleteReservation(String reservationId)throws Exception;

    public ReservationDTO getReservationById(String reservationId)throws Exception;

    public List<ReservationDTO> getAllReservations()throws Exception;

    public List<ReservationDTO> findReservationCustomer(String customerId)throws Exception;

}
