package com.ticket.domain.service;


import com.ticket.domain.model.entity.TicketDetail;

public interface TicketDetailDomainService {

    TicketDetail getTicketDetailById(Long ticketId);
}
