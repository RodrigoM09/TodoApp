package com.TodoApp.springboot.MyFirstWebApplication.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class WelcomeController {

//    private AuthenticationService authenticationService;
//
//    public LoginController(AuthenticationService authenticationService) {
//        super();
//        this.authenticationService = authenticationService;
//    }

    @GetMapping("/Welcome")
    public String goToWelcome(ModelMap model){
        model.put("name", getLoggedInUsername());
        return "Welcome";
    }

    private String getLoggedInUsername(){
        Authentication authentication =
            SecurityContextHolder.getContext().getAuthentication();
       return authentication.getName();
    }
//    @RequestMapping(value="login",method = RequestMethod.POST)
//    public String goToWelcome(@RequestParam String name, @RequestParam String password, Model model){
//
//        if(authenticationService.authentication(name, password)) {
//
//            model.addAttribute("name", name);
//            //Authentication
//            //name - Rodrigo
//            //password - genius
//            return "Welcome";
//        }
//        model.addAttribute("errorMessage", "Invalid Credentials! Please try again.");
//        return "login";
//    }


    // ADDS ABILITY TO LOG INFO TO TERMINAL------------------------------------>
    //  private Logger logger = LoggerFactory.getLogger(getClass());

   // @RequestMapping("login")
   // public String goToLogin(@RequestParam String name, Model model){
   //     model.addAttribute("name", name);
        // REQUIRED TO VIEW LOG INFORMATION IN CONSOLE------------------------>
       // logger.debug("Request param is {}", name);
   //     return "login";
  //  }
}
