package com.ticket.application.service.ticket;


import com.ticket.domain.model.entity.TicketDetail;

public interface TicketDetailAppService {

    TicketDetail getTicketDetailById(Long ticketId); // should convert to TickDetailDTO by Application Module
}
