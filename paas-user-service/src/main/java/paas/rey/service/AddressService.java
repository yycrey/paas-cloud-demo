package paas.rey.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.transaction.annotation.Transactional;
import paas.rey.model.AddressDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 电商-公司收发货地址表 服务类
 * </p>
 *
 * @author yeycrey
 * @since 2024-12-23
 */
public interface AddressService  {
    //收货地址查询接口开发
    AddressDO findById(long id);
}
