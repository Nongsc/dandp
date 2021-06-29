package top.annoo.service.impl;

import top.annoo.entity.Department;
import top.annoo.mapper.DepartmentMapper;
import top.annoo.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 医院科室表 服务实现类
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {

}
