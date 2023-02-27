package daniel.zielinski.redundancy.functionalinterface;


import daniel.zielinski.redundancy.endpoint.api.FtpProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
class FtpProviderFunctionalInterfaceImpl implements FtpProvider {

    private final FtpOperationTemplate ftpOperationTemplate;

    public FTPFile[] listDirectories(String parentDirectory) {
        return ftpOperationTemplate.execute(ftpClient -> ftpClient.listDirectories(parentDirectory));
    }

    public boolean deleteFile(String filePath) {
        return ftpOperationTemplate.execute(ftpClient -> ftpClient.deleteFile(filePath));
    }
}


