package io.management.springbackend.common.exception.file;

/**
 * 文件名大小限制异常类
 *
 * @author ruoyi
 */
public class FileSizeLimitExceededException extends FileException {

    private static final long serialVersionUID = -684728408917025777L;

    public FileSizeLimitExceededException(long defaultMaxSize) {
        super("upload.exceed.maxSize", new Object[]{defaultMaxSize});
    }
}
