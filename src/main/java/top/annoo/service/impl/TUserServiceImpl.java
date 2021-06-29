package top.annoo.service.impl;

import top.annoo.entity.TUser;
import top.annoo.mapper.TUserMapper;
import top.annoo.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author nongshichao
 * @since 2021-06-29
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
