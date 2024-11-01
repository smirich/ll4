package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.managers.LinkedListManager;

@RestController
public class HomeController {

    LinkedListManager<String> linkedListManager = new LinkedListManager<>();

    @GetMapping("/")
    public String home()
    {
        return "Welcome to the linked list manager";
    }

    @GetMapping("/add")
    public String addToList(@RequestParam String payload, @RequestParam int index)
    {
        if (!linkedListManager.addAtIndex(payload, index))
        {
            return "Sorry, operation failed - list is currently: " + linkedListManager.toString();
        }
        return "Added " + payload + " to list at index " + index + "- List is currently: " + linkedListManager.toString();
    }

    @GetMapping("/size")
    public String size()
    {
        return "The size of the list is: " + linkedListManager.size();
    }

    @GetMapping("/get")
    public String get()
    {
        return linkedListManager.toString();
    }

    @GetMapping("/get/{index}")
    public String getAtIndex(@PathVariable int index)
    {
        String returnValue = linkedListManager.getAtIndex(index);
        if (returnValue == null)
        {
            return "Sorry, operation failed - list is currently: " + linkedListManager.toString();
        }
        return "The payload at index " + index + " is: " + returnValue;
    }

}