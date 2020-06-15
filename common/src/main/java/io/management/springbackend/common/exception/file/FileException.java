package io.management.springbackend.common.exception.file;

import io.management.springbackend.common.exception.BaseException;

/**
 * 文件信息异常类
 *
 * @author ruoyi
 */
public class FileException extends BaseException {

    private static final long serialVersionUID = -1665962300094524584L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
