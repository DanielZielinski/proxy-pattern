package daniel.zielinski.proxypattern.infrastructure;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@Slf4j
@Aspect
@Component
public class FtpOperationProxy {

    @Around("@annotation(daniel.zielinski.proxypattern.infrastructure.FtpOperation)")
    public Object handle(ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            log.info("connect to ftp");
            log.info("login to ftp");
            return joinPoint.proceed();
        } catch (IOException | IllegalAccessException | InvocationTargetException ex) {
            log.error("Something went wrong", ex);
            throw new RuntimeException(ex);
        } finally {
            log.info("logout from ftp");
            log.info("disconnect from  ftp");
        }

    }
}


