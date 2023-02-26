package daniel.zielinski.proxypattern.infrastructure;

import daniel.zielinski.proxypattern.domain.FtpProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class FtpProviderImpl implements FtpProvider {

    @Override
    @FtpOperation
    public void listDirectories() {
        log.info("Fetching directories");
    }

    @Override
    @FtpOperation
    public void deleteFile() {
        log.info("Deleting file");
    }


}
