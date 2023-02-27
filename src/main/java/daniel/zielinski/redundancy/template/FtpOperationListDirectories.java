package daniel.zielinski.redundancy.template;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
class FtpOperationListDirectories extends FtpOperationTemplate<String, FTPFile[]> {

    @Override
    protected FTPFile[] command(FTPClient ftpClient, String input) throws IOException {
        return ftpClient.listDirectories(input);
    }
}


