package com.ticket.controller.http;

import com.ticket.application.service.ticket.TicketDetailAppService;
import com.ticket.controller.model.enums.ResultUtil;
import com.ticket.controller.model.vo.ResultMessage;
import com.ticket.domain.model.entity.TicketDetail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.security.SecureRandom;

@RestController
@RequestMapping("/ticket")
@Slf4j
public class TicketDetailController {

    // CALL Service Application
    @Autowired
    private TicketDetailAppService ticketDetailAppService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{ticketId}/detail/{detailId}")
    public ResultMessage<TicketDetail> getTicketDetail(
            @PathVariable("ticketId") Long ticketId,
            @PathVariable("detailId") Long detailId
    ) {
        log.info("MEMBER TIPS GO");
        log.info(" ticketId:{}, detailId:{}", ticketId, detailId);
        SecureRandom secureRandom = new SecureRandom();
        int productId = secureRandom.nextInt(20) + 1;
        String url = "https://fakestoreapi.com/products/" + productId;
        restTemplate.getForObject(url, String.class);
//        restTemplate.getForObject(url, String.class);
        return ResultUtil.data(ticketDetailAppService.getTicketDetailById(detailId));
    }
}
