package daniel.zielinski.proxypattern.endpoint.api;

import daniel.zielinski.proxypattern.domain.FileFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/file")
public class FileController {

    private final FileFacade fileFacade;
    @GetMapping
    public void listFiles() {
        fileFacade.listDirectories();
    }

    @DeleteMapping
    public void deleteFile() {
        fileFacade.deleteFile();
    }

}
