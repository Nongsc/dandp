package top.annoo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 问答表
 * </p>
 *
 * @author NongShiChao
 * @since 2021-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_questions")
public class Questions implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键Id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 问题/回复
     */
    private String title;

    /**
     * 问题id
     */
    private Integer parentId;

    /**
     * 医生Id
     */
    private Integer doctorId;

    /**
     * 问题所属患者id
     */
    private Integer patientId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;


}
