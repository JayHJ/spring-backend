package io.management.springbackend.common.exception.user;

/**
 * 验证码失效异常类
 *
 * @author ruoyi
 */
public class CaptchaExpireException extends UserException {

    private static final long serialVersionUID = 2991897060347094048L;

    public CaptchaExpireException() {
        super("user.jcaptcha.expire", null);
    }
}
