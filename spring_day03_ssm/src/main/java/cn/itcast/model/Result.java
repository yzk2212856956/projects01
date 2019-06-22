package cn.itcast.model;

import cn.itcast.domain.TbBrand;

import java.io.Serializable;
import java.util.List;

public class Result  implements Serializable{
    private boolean success;
    private String message;
    private Object data;

    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
        this.data = null;
    }

    public Result(boolean success, String message, Object data) {

        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {

        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
