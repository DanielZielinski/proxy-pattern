package daniel.zielinski.redundancy.endpoint.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FileFacade {

    private final FtpProvider ftpProvider;


//    public void listDirectories()  {
//        ftpProvider.listDirectories();
//    }
//
//
//    public void deleteFile() {
//        ftpProvider.deleteFile();
//    }

}
