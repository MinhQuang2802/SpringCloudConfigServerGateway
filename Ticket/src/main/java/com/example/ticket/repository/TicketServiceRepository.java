package com.example.ticket.repository;

import com.example.ticket.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketServiceRepository extends JpaRepository<Ticket,Integer > {
    Ticket findAllByLoaiVe(String lv);
    Ticket findAllById(Integer id);
}
