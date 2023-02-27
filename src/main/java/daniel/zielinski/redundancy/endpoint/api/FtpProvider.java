package daniel.zielinski.redundancy.endpoint.api;

import org.apache.commons.net.ftp.FTPFile;

import java.io.IOException;

public interface FtpProvider {

    FTPFile[] listDirectories(String directory) throws IOException;
    boolean deleteFile(String filePath) throws IOException;
}
