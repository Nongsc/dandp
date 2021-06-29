package top.annoo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 挂号表
 * </p>
 *
 * @author nongshichao
 * @since 2021-06-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TRegistration implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 唯一编号
     */
    private String number;

    /**
     * 预约时间，默认为当前时间
     */
    private Date time;

    /**
     * 挂号时间
     */
    private Date createTime;

    /**
     * 挂号医生
     */
    private Integer doctorId;

    /**
     * 挂号患者Id
     */
    private Integer patientsId;

    /**
     * 0:未处理，1已处理
     */
    private Integer status;

    /**
     * 满意，一般，不满意
     */
    private String evaluate;

    /**
     * 状态，1为采纳，2为不采纳
     */
    private Integer accept;

    /**
     * 是否需要病历本
     */
    private Boolean isCases;

    /**
     * 金额
     */
    private BigDecimal amountPayable;

    /**
     * 结算类型
     */
    private String type;

    /**
     * 挂号级别
     */
    private String level;

    /**
     * 是否开票
     */
    private Boolean isInvoice;

    /**
     * 发票代码
     */
    private String invoiceCode;

    /**
     * 发票号
     */
    private String invoiceNumber;

    /**
     * 开票日期
     */
    private Date invoiceDate;


}
