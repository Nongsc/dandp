package top.annoo.service.impl;

import top.annoo.entity.Questions;
import top.annoo.mapper.QuestionsMapper;
import top.annoo.service.QuestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 问答表 服务实现类
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@Service
public class QuestionsServiceImpl extends ServiceImpl<QuestionsMapper, Questions> implements QuestionsService {

}
