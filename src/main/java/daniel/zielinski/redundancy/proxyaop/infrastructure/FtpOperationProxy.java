package daniel.zielinski.redundancy.proxyaop.infrastructure;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Slf4j
@Aspect
@Component
@RequiredArgsConstructor
public class FtpOperationProxy {

    private final FTPClient ftpClient;

    @Around("@annotation(daniel.zielinski.redundancy.proxyaop.infrastructure.FtpOperation)")
    public Object handle(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            ftpClient.connect("host", 22);
            ftpClient.login("username", "password");
            return joinPoint.proceed();
        } catch (IOException ex) {
            log.error("Something went wrong", ex);
            throw new RuntimeException(ex);
        } finally {
            try {
                ftpClient.logout();
                ftpClient.disconnect();
            } catch (IOException ex) {
                log.error("Something went wrong while finally", ex);
            }
        }
    }
}


