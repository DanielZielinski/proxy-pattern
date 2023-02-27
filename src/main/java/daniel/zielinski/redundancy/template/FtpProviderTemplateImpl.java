package daniel.zielinski.redundancy.template;


import daniel.zielinski.redundancy.endpoint.api.FtpProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class FtpProviderTemplateImpl implements FtpProvider {

    private final FtpOperationTemplate<String, FTPFile[]> ftpOperationListDirectories;
    private final FtpOperationTemplate<String, Boolean> ftpOperationDeleteFile;
    private final FTPClient ftpClient;

    public FTPFile[] listDirectories(String parentDirectory) {
        return ftpOperationListDirectories.execute(ftpClient, parentDirectory);
    }

    public boolean deleteFile(String filePath) {
        return ftpOperationDeleteFile.execute(ftpClient, filePath);
    }
}


