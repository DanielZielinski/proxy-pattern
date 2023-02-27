package daniel.zielinski.redundancy.proxyaop.infrastructure;

import daniel.zielinski.redundancy.endpoint.api.FtpProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Slf4j
@Service
@RequiredArgsConstructor
class FtpProviderProxyAopImpl implements FtpProvider {

    private final FTPClient ftpClient;
    @Override
    @FtpOperation
    public FTPFile[] listDirectories(String directory) throws IOException {
        return ftpClient.listDirectories(directory);
    }

    @Override
    @FtpOperation
    public boolean deleteFile(String filePath) throws IOException {
       return ftpClient.deleteFile(filePath);
    }


}
