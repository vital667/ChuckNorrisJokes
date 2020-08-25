package ChuckNorrisJokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/chuck")
    public String getChuck(ModelMap map){
        ChuckNorrisQuotes chuck = new ChuckNorrisQuotes();

        map.put("chuck",chuck.getRandomQuote());
        return "chuck";
    }

}
