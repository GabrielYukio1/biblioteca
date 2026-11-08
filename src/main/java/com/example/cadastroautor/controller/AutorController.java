package com.example.cadastroautor.controller;

import com.example.cadastroautor.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AutorController {

    @GetMapping("/autores/novo")
    public String formulario(Model model) {
        model.addAttribute("autor", new Autor());
        return "autores/form";
    }

    @PostMapping("/autores/salvar")
    public String salvar(@ModelAttribute Autor autor, Model model) {
        model.addAttribute("autor", autor);
        return "autores/confirmacao";
    }
}
