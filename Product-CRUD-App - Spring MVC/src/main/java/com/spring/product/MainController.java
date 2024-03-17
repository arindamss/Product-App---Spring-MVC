package com.spring.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.Entity.Product;
import com.spring.Service.DataBaseAccessClass;

@Controller
public class MainController {
	@Autowired
	private DataBaseAccessClass db;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/allProduct";
	}
	
	@RequestMapping("/addForm")
	public String addForm() {
		return "addForm";
	}
	
	@RequestMapping(path="/formAdd", method=RequestMethod.POST)
	public String formSave(@ModelAttribute Product pdt ) {
		try {
			int x=db.insert(pdt);
			return "redirect:/allProduct";
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error : "+e);
		}
		return "addForm";
	}
	
	@RequestMapping("/allProduct")
	public String productList(Model m) {
		m.addAttribute("data",db.getAll());
		return "productList";
	}
	
	@RequestMapping("delete/{id}")
	public String deleteProduct(@PathVariable() int id) {
		try {
			db.delete(id);
			return "redirect:/allProduct";
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error : "+e);
		}
		return "";
	}
	
	@RequestMapping("/update/{id}")
	public String updateProduct(@PathVariable() int id,Model m) {
		Product p=db.get(id);
		System.out.println("Controller : "+p);
		m.addAttribute("pdt",p);
		return "updateForm";
	}
	
	@RequestMapping("/formUpdate")
	public String productUpdate(@ModelAttribute Product pdt) {
		try {
			System.out.println("I am here"+pdt);
			db.update(pdt);
			return "redirect:/allProduct";
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error : "+e);
		}
		return "";
	}
	
}




