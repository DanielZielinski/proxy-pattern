package daniel.zielinski.redundancy.template;


import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
class FtpOperationDeleteFile extends FtpOperationTemplate<String, Boolean> {

    @Override
    protected Boolean command(FTPClient ftpClient, String input) throws IOException {
        return ftpClient.deleteFile(input);
    }
}


