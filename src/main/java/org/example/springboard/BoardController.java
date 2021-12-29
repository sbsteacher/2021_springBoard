package org.example.springboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public void list(Model model) {
        model.addAttribute("list", service.selBoardList());
    }

    @GetMapping("/detail")
    public void detail(Model model, BoardEntity entity) {
        model.addAttribute("data", service.selBoard(entity));
    }

    @GetMapping("/write")
    public void write() {}

    @PostMapping("/write")
    public String writeProc(BoardEntity entity) {
        System.out.println(entity);
        int result = service.insBoard(entity);
        return "redirect:/board/list";
    }
}

