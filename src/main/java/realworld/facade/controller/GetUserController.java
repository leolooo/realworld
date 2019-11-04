package realworld.facade.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import realworld.application.service.GetCurrentUserService;
import realworld.domin.model.user.User;

@RestController
@RequestMapping(path = "api")
public class GetUserController {

    private GetCurrentUserService getCurrentUserService;

    @Autowired
    public GetUserController(GetCurrentUserService getCurrentUserService) {
        this.getCurrentUserService = getCurrentUserService;
    }

    @GetMapping("get-current-user/{userName}")
    public User getCurrentUser(@PathVariable("userName") String userName){
        return getCurrentUserService.getCurrentUser(userName);
    }

    @PostMapping("update-current-user")
    public void updateCurrentUser(@RequestParam("userInfo") User user){

    }

}
