package de.fcernota.tasks;

import de.fcernota.repository.FeedRepository;
import de.fcernota.repository.RoleRepository;
import de.fcernota.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class ImportSpieldaten {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FeedRepository feedRepository;

    @Autowired
    RoleRepository roleRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(ImportSpieldaten.class);

    private static boolean needToRunStartupMethod = true;

    @Scheduled(fixedRate = 1)
    public void keepAlive() {
        //log "alive" every hour for sanity checks
        LOGGER.debug("alive");
        if (needToRunStartupMethod) {
            runOnceOnlyOnStartup();
            needToRunStartupMethod = false;
        }
    }

    public void runOnceOnlyOnStartup() {
        LOGGER.debug("running startup job");


    }

}

