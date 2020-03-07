package pl.bykowski.home51.homework51.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.bykowski.home51.homework51.service.HistoryService;

@Controller
public class HistoryContoller {

    private HistoryService historyService;

    @Autowired
    public HistoryContoller(HistoryService historyService) {
        this.historyService = historyService;
    }

    @GetMapping
    public String getHistoryFacts (Model model) {
        model.addAttribute("histories", historyService.histRest());
        return "history";
    }




}
