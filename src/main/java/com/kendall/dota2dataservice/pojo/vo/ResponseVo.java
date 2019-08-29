package com.kendall.dota2dataservice.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * 规范的HTTP接口Json响应对应的VO，Controller可以直接返回VO
 *
 * @since 2016/7/21
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_EMPTY)
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class ResponseVo<T> {

    /**
     * 响应状态码
     * <p>
     */
    private String respCode;

    /**
     * 响应消息
     * <p>
     */
    private String respMsg;

    /**
     * 分页场景使用，当{@link #data}为集合时，<code>total</code>即为<code>data</code>父集合的size
     */
    private Long total;

    /**
     * 响应数据
     */
    private T data;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ResponseVo() {

    }

    public ResponseVo(String respCode, String respMsg) {
        this.respCode = respCode;
        this.respMsg = respMsg;
    }

    public ResponseVo(String respCode, String respMsg, T data) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResponseVo{" +
                "respCode='" + respCode + '\'' +
                ", respMsg='" + respMsg + '\'' +
                ", total=" + total +
                ", data=" + data +
                '}';
    }
}
