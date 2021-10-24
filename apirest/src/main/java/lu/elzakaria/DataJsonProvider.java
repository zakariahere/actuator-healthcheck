package lu.elzakaria;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DataJsonProvider {

    @GetMapping("random")
    public String getRandomString()
    {
        return "data".concat(String.valueOf(new Random().nextDouble()));
    }

}
