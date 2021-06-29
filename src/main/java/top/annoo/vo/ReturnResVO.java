package top.annoo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 前端接收数据对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReturnResVO implements Serializable {
    private String msg;//返回提示消息
    private Integer status;//返回状态码
    private Object data;//响应数据

    public static ReturnResVO success() {
        return new ReturnResVO("success", 200, null);
    }

    public static ReturnResVO success(String message) {
        return new ReturnResVO(message, 200, null);
    }

    public static ReturnResVO success(String message, Integer status) {
        return new ReturnResVO(message, status, null);
    }

    public static ReturnResVO success(Integer status, Object data) {
        return new ReturnResVO("success", status, data);
    }

    public static ReturnResVO success(String message, Object data) {
        return new ReturnResVO(message, 200, data);
    }

    public static ReturnResVO success(String message, Integer status, Object data) {
        return new ReturnResVO(message, status, data);
    }

    public static ReturnResVO fail() {
        return new ReturnResVO("fail", 500, null);
    }

    public static ReturnResVO fail(String message) {
        return new ReturnResVO(message, 500, null);
    }

    public static ReturnResVO fail(String message, Integer status) {
        return new ReturnResVO(message, status, null);
    }

    public static ReturnResVO fail(Integer status, Object data) {
        return new ReturnResVO("fail", status, data);
    }

    public static ReturnResVO fail(String message, Object data) {
        return new ReturnResVO(message, 500, data);
    }

    public static ReturnResVO fail(String message, Integer status, Object data) {
        return new ReturnResVO(message, status, data);
    }

}
