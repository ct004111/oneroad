package com.oneroad.newshop.item;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;
    private final ItemRepository itemRepository;

    // @GetMapping("/list")
    // String list(Model model) {
    //     List<Item> result = itemRepository.findAll();
    //     //System.out.println(result.get(0).price);
    //     model.addAttribute("items", result);
    //     return "list.html";
    // }

    // @GetMapping("/write")
    // String write(Model model) {
    //     return "write.html";
    // }

    // @PostMapping("/add")
    // String addPost(String title,
    //                Integer price) {
    //     itemService.saveItem(title, price);
    //     return "redirect:/list";
    // }

    // @GetMapping("/detail/{id}")
    // String detail(@PathVariable Long id, Model model) {

    //     Optional<Item> result = itemRepository.findById(id);
    //     if (result.isPresent()) {
    //         model.addAttribute("data", result.get());
    //         System.out.println(result.get());
    //         return "detail.html";
    //     } else {
    //         return "redirect:/list";
    //     }
    // }

    // @GetMapping("/edit/{id}")
    // String edit(Model model, @PathVariable Long id) {
    //     Optional<Item> result = itemRepository.findById(id);
    //     if (result.isPresent()) {
    //         model.addAttribute("data", result.get());
    //         return "edit.html";
    //     } else {
    //         return "redirect:/list";
    //     }

    // }

    // @PostMapping("/edit")
    // String editItem(String title, Integer price, Long id) {

    //     Item item  = new Item();
    //     item.setId(id);
    //     item.setPrice(price);
    //     item.setTitle(title);
    //     itemRepository.save(item);

    //     return "redirect:/list";

    // }

    // @PostMapping("/test1")
    // String test1(@RequestBody Map<String, Object> body) {
    //     System.out.println(body.get("name"));
    //     return "redirect:/list";
    // }

    // @DeleteMapping("/item")
    // ResponseEntity<String> deleteItem(@RequestParam Long id){
    //     itemRepository.deleteById(id);
    //     return ResponseEntity.status(200).body("삭제완료");
    // }



}

//    @GetMapping("/edit")
//    String edit() {
//    return "edit.html";


