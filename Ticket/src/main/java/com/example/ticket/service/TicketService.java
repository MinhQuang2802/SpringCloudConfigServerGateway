package com.example.ticket.service;

import com.example.ticket.entity.Ticket;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
public interface TicketService {

    Ticket findByType(String lv);

    Ticket findAllById(Integer id);
}
