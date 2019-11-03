package cn.zhu.controller;

import cn.zhu.domain.Items;
import cn.zhu.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

@Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model) {
        Items items = itemsService.findById(1);
        model.addAttribute("items",items);
        return "itemDetail";
    }


}
