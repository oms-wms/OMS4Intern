package cn.com.connext.oms.service;

import cn.com.connext.oms.entity.TbReceiver;

public interface TbReceiverService {

    /**
    * @Description: 更改收货人信息
    * @Param: [tbReceiver]
    * @return: boolean
    * @Author: Lili Chen
    * @Date: 2019/1/14
    */
    boolean updateReceiver(TbReceiver tbReceiver);
   /* *//**
     * 功能描述:根据订单查看收货人信息
     * @param:
     * @return:
     * @auther: Jun.Zhao
     * @date: 2019/1/15 19:58
     *//*
    TbReceiver getReceiverById(Integer orderId);*/


    /**
    * @Description: 根据id查看收货人
    * @Param: [receiverId]
    * @return: cn.com.connext.oms.entity.TbReceiver
    * @Author: Lili Chen
    * @Date: 2019/1/14
    */
    TbReceiver getReceiverById(Integer receiverId);
}
