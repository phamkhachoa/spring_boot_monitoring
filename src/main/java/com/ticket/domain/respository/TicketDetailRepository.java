package com.ticket.domain.respository;


import com.ticket.domain.model.entity.TicketDetail;

import java.util.Optional;

public interface TicketDetailRepository {

    Optional<TicketDetail> findById(Long id);
}
