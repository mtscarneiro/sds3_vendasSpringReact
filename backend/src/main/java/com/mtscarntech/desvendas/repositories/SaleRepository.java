package com.mtscarntech.desvendas.repositories;

import java.util.List;

import com.mtscarntech.desvendas.dto.SaleSuccessDTO;
import com.mtscarntech.desvendas.dto.SaleSumDTO;
import com.mtscarntech.desvendas.entities.Sale;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.mtscarntech.desvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupedBySeller();

    @Query("SELECT new com.mtscarntech.desvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();

}
