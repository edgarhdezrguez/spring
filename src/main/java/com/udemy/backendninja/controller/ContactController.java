package com.udemy.backendninja.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.udemy.backendninja.constant.ViewConstant;
import com.udemy.backendninja.model.ContactModel;
import com.udemy.backendninja.service.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {

		private static final Log LOG= LogFactory.getLog(ContactController.class);
	
		@Autowired
		@Qualifier("contactServiceImpl")
		private ContactService contactService;
		
		@GetMapping("/cancel")
		public String cancel() {
			return ViewConstant.CONTACTS;
			
		}
		
		@GetMapping("/contactform")
		private String redirectContactForm(Model model){
			
			model.addAttribute("contactModel", new ContactModel());
			LOG.info("METHOD: redirectContactForm()");
			return ViewConstant.CONTACT_FORM;
			
		}
		
		@PostMapping("/addcontact")
		public String addContact(@ModelAttribute(name="contactModel") ContactModel contactModel,
				Model model) {
			
			
			LOG.info("METHOD: addContact() -- PARAMS: contactModel=" + contactModel.toString());
			
			if( null != contactService.addContact(contactModel))
			{
				model.addAttribute("result", 1);
				
			}else{
				
				model.addAttribute("result", 0);
			}
			
			
			return ViewConstant.CONTACTS;
			
		}
}
