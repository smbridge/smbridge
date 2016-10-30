package de.fcernota.rest;

import de.fcernota.entity.Feed;
import de.fcernota.entity.User;
import de.fcernota.repository.FeedRepository;
import de.fcernota.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cernota on 07.10.16.
 */
@RestController
@RequestMapping(path = "/api/v1/feed")
public class FeedRestRepository {

    @Autowired
    FeedRepository feedRepository;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Feed> getFeedList(){
        return feedRepository.findAll();
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Feed add(@PathVariable String userId, @RequestBody Feed body) {
        User user = userRepository.findOne(Long.valueOf(userId));
        body.setUser(user);

        return feedRepository.save(body);
    }
}
