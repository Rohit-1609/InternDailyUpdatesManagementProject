package com.interndailyupdatesmanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
import com.interndailyupdatesmanagement.model.Intern;
import com.interndailyupdatesmanagement.service.LoginService;
import com.interndailyupdatesmanagement.service.SequenceGeneratorService;


/**
 * @author Rohit T
 * @version 1.0
 */

@Controller
public class LoginController 
{
    /**
     * Represent the LoginService
     */
    @Autowired
    private LoginService loginService;
    
    @Autowired
    private SequenceGeneratorService sequenceGeneratorService;
    
    
    @RequestMapping("/")
    public String home() {
		return "index";

	}
    
    
    /**
     * This method used to redirect to register page
     * @return A String as a register page name
     */
    @RequestMapping("register")
	public String addDailyUpdates() {

		return "register";
	}
    
    
    /**
     * This method perform operation of handle registration operation
     * @param intern The intern object
     * @param request The http request
     * @param model The model object
     * @return A String messsage as success message
     * @throws Exception 
     */
    @RequestMapping(value = "/register_process", method = RequestMethod.POST)
 			public String handleRegister(@ModelAttribute Intern intern, HttpServletRequest request, Model model) throws Exception {

 				// if (br.hasErrors())
 				// return "registration_page"; //it returns the error messages to the same page

 				System.out.println(intern);
 				intern.setId(sequenceGeneratorService.getSequenceNumber(Intern.SEQUENCE_NAME));
 				loginService.addIntern(intern);
 				model.addAttribute("Message", intern.getFullName() + " Succefully Registered");
 				
 				return "redirect:/";
 			}
  
    
	/**
	 * This method used to display records of intern on admin page
	 * @param model The model object
	 * @return A string admin page 
	 */
	@RequestMapping("/admin")
	public String displayAdmin(Model model) {
		List<Intern> interns = loginService.getAllInterns();

		for (Intern intern : interns) {
			System.out.println(intern);
		}
		model.addAttribute("intern", interns);
		return "admin";

	}
	
	
	// for the login handle	    
			/**
			 * This method verify the role of intern and redirect to respective page
			 * @param email The intern's email
			 * @param password The intern's password
			 * @param request The http request
			 * @param model The model parameter
			 * @return A string message username and password valid or not
			 */
			@RequestMapping(value = "/validate", method = RequestMethod.POST)
			public String validateUsr(@RequestParam("email") String email,
					@RequestParam("password") String password, HttpServletRequest request, Model model) {
				// User user = careerManagementService.findUserByUsername(userEmail);
				Intern intern= loginService.findByInternFullName(email, password);
				System.out.println(intern);
				if(intern == null) {
					model.addAttribute("Message", "   Username or Password is Invalid");
					return "login";

				}
				else if (intern.getRole().equalsIgnoreCase("Admin")) {
					//System.out.println("Admin user");

					return "redirect:/admin";
				} else if (intern.getRole().equalsIgnoreCase("User")) {
					System.out.println("normal user");
					return "redirect:/login";
				} else {

					model.addAttribute("Message", "   Username or Password is Invalid");

				}
				return "login";

			}

			
	 		/**
	 		 * This method perform operation of displaying update page
	 		 * @param id The intern's id
	 		 * @param model A model object
	 		 * @return A String representing name of updates page
	 		 */
	 		@RequestMapping("/updateintern/{id}")
	 		public String updateForm(@PathVariable("id") Long id, Model model) {
	 			Intern intern= this.loginService.getInternById(id);
	 			model.addAttribute("intern", intern);
	 			return "updateintern";
	 		}

	
	 		/**
	 		 * This method used to update the intern's records using id
	 		 * @param intern The intern object
	 		 * @param request The http request object
	 		 * @param model The model object
	 		 * @return redirectView
	 		 */
	 		@RequestMapping(value = "/updateintern_process", method = RequestMethod.POST)
	 		public RedirectView updateIntern(@ModelAttribute Intern intern, HttpServletRequest request, Model model) {
	 		loginService.updateInterns(intern);

	 			RedirectView redirectView = new RedirectView();

	 			redirectView.setUrl(request.getContextPath() + "/admin");
	 			model.addAttribute("Message", intern.getId());

	 			return redirectView;
	 		}
	 		
	 		
	 
	 		/**
	 		 * This method perform operation of deleting 
	 		 * @param id The intern's id
	 		 * @param request the httprequest object
	 		 * @return redirectView
	 		 */
	 		@RequestMapping("/deleteintern/{id}")
	 		public RedirectView deleteIntern(@PathVariable("id") Long id, HttpServletRequest request) {
	 			this.loginService.deleteInterns(id);
	 			RedirectView redirectView = new RedirectView();
	 			redirectView.setUrl(request.getContextPath() + "/admin");
	 			return redirectView;
	 		}
	 			
	
}
