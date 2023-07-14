package com.howthere.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/diary/*")
public class DiaryController {
    @GetMapping("list")
    public void list() {;}

    @GetMapping("article")
    public void article() {;}

    @GetMapping("write")
    public void goToWriteForm() {;}

    @PostMapping("write")
    public void write() {;}

    @GetMapping("modify")
    public void goToModifyForm() {;}

    @PostMapping("modify")
    public void modify() {;}
}
