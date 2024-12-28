package paas.rey.enums;

import lombok.Getter;

/**
 * @Author yeyc
 * @Description 全局通用相应状态码（统一状态码跟错误信息）
 * @Date 2024/12/23
 * @Param
 * @Exception
 **/

@Getter
public enum BizCodeEnum {

    /**
     * 通用操作码
     */
    OPS_REPEAT(110001,"重复操作"),
    /**
     *验证码
     */
    CODE_TO_ERROR(240001,"接收号码不合规"),
    CODE_LIMITED(240002,"验证码发送过快"),
    CODE_ERROR(240003,"验证码错误"),
    CODE_CAPTCHA(240101,"图形验证码错误"),
    /**
     * 账号
     */
    ACCOUNT_REPEAT(250001,"账号已经存在"),
    ACCOUNT_UNREGISTER(250002,"账号不存在"),
    ACCOUNT_PWD_ERROR(250003,"账号或者密码错误"),
    ACCOUNT_SUCCESS(250004,"用户登录成功"),
    /*
    随机数错误枚举类
     */
    CODE_LEGTH_ERROR(270001,"随机数长度不符合规范，理应在0~9之间"),

    /*
    附件上传
     */
    CODE_FILE_USER_IMAGE(300001,"上传用户头像失败");

    private final String message;
    private final int code;

    //有参构造函数私有化
    BizCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }


}
