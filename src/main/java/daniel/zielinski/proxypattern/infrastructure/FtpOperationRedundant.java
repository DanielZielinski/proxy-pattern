package daniel.zielinski.proxypattern.infrastructure;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.stereotype.Service;

import java.io.IOException;

@RequiredArgsConstructor
@Slf4j
@Service
public class FtpOperationRedundant {

//    private final FTPClient ftpClient;
//
//    public FTPFile[] listDirectories(String parentDirectory) {
//        try {
//            ftpClient.connect("host", 22);
//            ftpClient.login("username", "password");
//            return ftpClient.listDirectories();
//        } catch (IOException ex) {
//            log.error("Something went wrong", ex);
//            throw new RuntimeException(ex);
//        } finally {
//            try {
//                ftpClient.logout();
//                ftpClient.disconnect();
//            } catch (IOException ex) {
//                log.error("Something went wrong while finally", ex);
//            }
//        }
//    }
//
//    public boolean deleteFile(String filePath) {
//        try {
//            ftpClient.connect("host", 22);
//            ftpClient.login("username", "password");
//            return ftpClient.deleteFile(filePath);
//        } catch (IOException ex) {
//            log.error("Something went wrong", ex);
//            throw new RuntimeException(ex);
//        } finally {
//            try {
//                ftpClient.logout();
//                ftpClient.disconnect();
//            } catch (IOException ex) {
//                log.error("Something went wrong while finally", ex);
//            }
//        }
//    }


}


