package io.management.springbackend.common.exception.user;

/**
 * 验证码错误异常类
 *
 * @author ruoyi
 */
public class CaptchaException extends UserException {

    private static final long serialVersionUID = 9173023599613935883L;

    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
