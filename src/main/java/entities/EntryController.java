package entities;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EntryController {
    private String json;
    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/sendentry")
    public String getEntryJSON() {
        try {
            Entry entry = new Entry("words", "re", "", "", "");
            this.json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(entry);
            return json;
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {

        }
        return "o";
    }


}






