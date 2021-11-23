package com.example.sahibindentwo.dataAccess;

import com.example.sahibindentwo.entities.PaymentMethodForRentalCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodForRentalCarDao extends JpaRepository<PaymentMethodForRentalCar,Integer> {
}
