package com.example.ticket.controller;

import com.example.ticket.entity.Ticket;
import com.example.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    TicketService ticketService;
//    @GetMapping("/{lv}")
//    public Ticket findByType(@PathVariable String lv){
//        Ticket tickets = ticketService.findByType(lv);
//        return tickets;
//    }
    @GetMapping("/{id}")
    public Ticket findAllById(@PathVariable(value = "id") Integer id){
        Ticket tickets = ticketService.findAllById(id);
        return tickets;
    }
}
