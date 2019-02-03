package cn.com.connext.oms.mapper;

import cn.com.connext.oms.entity.TbReturnGoods;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

@Repository
public interface TbReturnGoodsMapper extends MyMapper<TbReturnGoods> {

    /**
    * @Description: 根据商品ID查看退货商品表
    * @Param: [orderId]
    * @return: java.util.List<cn.com.connext.oms.entity.TbReturnGoods>
    * @Author: Lili Chen
    * @Date: 2019/1/23
    */
    List<TbReturnGoods> getListReturnGoodsByOrderId(Integer orderId);
}