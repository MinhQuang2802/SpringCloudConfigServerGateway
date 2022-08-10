package com.example.ticket.service;

import com.example.ticket.entity.Ticket;
import com.example.ticket.repository.TicketServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketServiceIml implements  TicketService{
    @Autowired
    TicketServiceRepository ticketServiceRepository;
    @Override
    public Ticket findByType(String lv) {
        Ticket tickets = ticketServiceRepository.findAllByLoaiVe(lv);
        return tickets;
    }
    @Override
    public Ticket findAllById(Integer id) {
        Ticket tickets = ticketServiceRepository.findAllById(id);
        return tickets;
    }


}
