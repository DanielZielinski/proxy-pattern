package daniel.zielinski.redundancy.template;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Slf4j
@Service
abstract class FtpOperationTemplate<T, K> {

    protected abstract K command(FTPClient ftpClient, T input) throws IOException;

    public K execute(FTPClient ftpClient, T input) {
        try {
            ftpClient.connect("host", 22);
            ftpClient.login("username", "password");
            return command(ftpClient, input);
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


