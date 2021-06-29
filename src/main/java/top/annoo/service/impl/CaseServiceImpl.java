package top.annoo.service.impl;

import top.annoo.entity.Case;
import top.annoo.mapper.CaseMapper;
import top.annoo.service.CaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 病例表 服务实现类
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@Service
public class CaseServiceImpl extends ServiceImpl<CaseMapper, Case> implements CaseService {

}
