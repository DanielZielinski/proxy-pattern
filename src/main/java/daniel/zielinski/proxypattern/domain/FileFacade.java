package daniel.zielinski.proxypattern.domain;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileFacade {

    private final FtpProvider ftpProvider;


    public void listDirectories()  {
        ftpProvider.listDirectories();
    }


    public void deleteFile() {
        ftpProvider.deleteFile();
    }

}
