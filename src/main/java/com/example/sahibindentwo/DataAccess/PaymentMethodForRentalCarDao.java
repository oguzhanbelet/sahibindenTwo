package com.example.sahibindentwo.DataAccess;

import com.example.sahibindentwo.Entities.Concretes.PaymentMethodForRentalCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodForRentalCarDao extends JpaRepository<PaymentMethodForRentalCar,Integer> {
}
