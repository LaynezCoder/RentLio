package com.chamodshehanka.rentlio.server.services.impl.custom;

import com.chamodshehanka.rentlio.common.dto.DriverDTO;
import com.chamodshehanka.rentlio.common.dto.ReservationDTO;
import com.chamodshehanka.rentlio.common.dto.VehicleDTO;
import com.chamodshehanka.rentlio.common.observer.ReservationObserver;
import com.chamodshehanka.rentlio.common.services.custom.ReservationService;
import com.chamodshehanka.rentlio.server.business.BOFactory;
import com.chamodshehanka.rentlio.server.business.custom.ReservationBO;
import com.chamodshehanka.rentlio.server.observable.AdminObservable;
import com.chamodshehanka.rentlio.server.observable.ReservationObservable;
import com.chamodshehanka.rentlio.server.reservation.ReservationImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * @author chamodshehanka on 3/14/2018
 * @project RentLio
 **/
public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService{

    private ReservationBO reservationBO;
    private static ReservationImpl<ReservationService> reservationServiceReservation;
    private static final ReservationObservable RESERVATION_OBSERVABLE = new ReservationObservable();
    private static final AdminObservable ADMIN_OBSERVABLE = new AdminObservable();

    public ReservationServiceImpl() throws RemoteException {
        reservationBO = (ReservationBO) BOFactory.getInstance()
                .getBOFactory(BOFactory.BOTypes.RESERVATION);
    }

    @Override
    public boolean addReservation(ReservationDTO reservationDTO, VehicleDTO vehicleDTO, DriverDTO driverDTO) throws Exception {
        updateReservation(reservationDTO);
        return reservationBO.addReservation(reservationDTO,vehicleDTO,driverDTO);
    }

    @Override
    public boolean updateReservation(ReservationDTO reservationDTO) throws Exception {
        return reservationBO.updateReservation(reservationDTO);
    }

    @Override
    public boolean deleteReservation(String reservationId) throws Exception {
        return reservationBO.deleteReservation(reservationId);
    }

    @Override
    public ReservationDTO findById(String reservationId) throws Exception {
        return reservationBO.getReservationById(reservationId);
    }

    @Override
    public List<ReservationDTO> getAllReservations() throws Exception {
        return reservationBO.getAllReservations();
    }

    @Override
    public boolean addReservationObserver(ReservationObserver reservationObserver) throws Exception {
        return RESERVATION_OBSERVABLE.addReservationObserver(reservationObserver);
    }

    @Override
    public boolean removeReservationObserver(ReservationObserver reservationObserver) throws Exception {
        return RESERVATION_OBSERVABLE.removeReservationObserver(reservationObserver);
    }

    @Override
    public List<ReservationDTO> findCustomerReservation(String customerId) throws Exception {
        return reservationBO.findReservationCustomer(customerId);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return reservationServiceReservation.reserve(id,this,false);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return reservationServiceReservation.release(id);
    }
}
