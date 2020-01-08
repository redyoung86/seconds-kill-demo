package com.sonake.seconds.kill.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sonake.seconds.kill.order.dao.OrderDao;
import com.sonake.seconds.kill.order.dao.TradeDao;
import com.sonake.seconds.kill.order.entity.Orders;
import com.sonake.seconds.kill.order.entity.Trade;
import com.sonake.seconds.kill.order.service.IStorageService;
import com.sonake.seconds.kill.order.service.OrderService;
import com.sonake.seconds.kill.order.service.TradeService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：xzyuan
 * @date ：Created in 2020/1/2 12:30
 * @description：
 * @version:
 */
@Service("tradeService")
@Slf4j
public class TradeServiceImpl extends ServiceImpl<TradeDao, Trade> implements TradeService {

    @Override
    @GlobalTransactional
    public void saves(Trade t) {
        log.info("调用物流服务,当前 XID: {}", RootContext.getXID());
        this.save(t);
    }



}
