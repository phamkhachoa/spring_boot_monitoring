package com.ticket.application.service.ticket.impl;

import com.ticket.application.service.ticket.TicketDetailAppService;
import com.ticket.application.service.ticket.cache.TicketDetailCacheService;
import com.ticket.domain.model.entity.TicketDetail;
import com.ticket.domain.service.TicketDetailDomainService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TicketDetailAppServiceImpl implements TicketDetailAppService {

    // CALL Service Domain Module
    @Autowired
    private TicketDetailDomainService ticketDetailDomainService;

    // CALL CACHE
    @Autowired
    private TicketDetailCacheService ticketDetailCacheService;

    @Override
    public TicketDetail getTicketDetailById(Long ticketId) {
//        log.info("Implement Application : {}", ticketId);
        return ticketDetailDomainService.getTicketDetailById(ticketId);
//        return ticketDetailCacheService.getTicketDefaultCacheNormal(ticketId, System.currentTimeMillis());
//        return ticketDetailCacheService.getTicketDefaultCacheVip(ticketId, System.currentTimeMillis());
    }
}
