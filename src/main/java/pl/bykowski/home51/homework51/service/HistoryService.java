package pl.bykowski.home51.homework51.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.bykowski.home51.homework51.model.History;

@Service
public class HistoryService {

    public History[] histRest() {
        RestTemplate restTemplate = new RestTemplate();
        History[] histEvent = restTemplate.getForObject("https://api.spacexdata.com/v3/history", History[].class);
        return histEvent;
    }
}
