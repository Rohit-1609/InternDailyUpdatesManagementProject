package com.interndailyupdatesmanagement.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import com.interndailyupdatesmanagement.model.DailyUpdates;
import com.interndailyupdatesmanagement.service.DailyUpdatesService;
import com.interndailyupdatesmanagement.service.SequenceGeneratorService;

/**
 * @author Rohit T
 *
 */
@Controller
public class DailyUpdatesController 
{
   /**
   * Represent the DailyUpdatesService
   */
   @Autowired
   private DailyUpdatesService dailyUpdatesService;

   @Autowired
   private SequenceGeneratorService sequenceGeneratorService;
   
   private static final Logger log = LoggerFactory.getLogger(DailyUpdatesController.class);

   /**
    * This method used to redirect to add dialy updates page
    * @return A String as a add daily updates page name
    */
   @RequestMapping("/adddailyupdates")
  	public String addDailyUpdates() {

  		return "adddailyupdates";
  	}
      
      /**
     * This method used to handle add daily updates operation
     * @param dailyUpdatess The daily updates object
     * @param request The http request object
     * @param model The model object
     * @return A String as redirect  displaydailyupdates page name
     * @throws Exception 
     */
    @RequestMapping(value = "/adddailyupdates_process", method = RequestMethod.POST)
  	public String handleAddDailyUpdatesForm(@ModelAttribute DailyUpdates dailyUpdatess, HttpServletRequest request, Model model) throws Exception {

    	  if(dailyUpdatess.getTopicName().equals("")||dailyUpdatess.getDescription().equals("")|| dailyUpdatess.getNameOfTheIssue().equals("")||
  				dailyUpdatess.getSolutionTried().equals("")||dailyUpdatess.getSolutionWorked().equals("")||
  				dailyUpdatess.getHours().equals("")||dailyUpdatess.getDate().equals("")||dailyUpdatess.getAssignmentDetails().equals(""))
  		{
  		 throw new Exception("The required field in request body is empty");
  		}
  		else
  		{
  			try
  			{
  	            dailyUpdatesService.addDailyUpdates(dailyUpdatess);
  				log.info("daily Updates records inserted");
  		  		model.addAttribute("Message"," Succefully Daily updates created");
  		  		
  		  		return "redirect:/viewdailyupdates";
  			}
  			catch(Exception e)
  			{
  				log.error("couldn't serialize response for content type application/json",e);
  				throw new Exception("please check url or enter required field");
  			}
  		}


  	}
      
      
      
      
      
      
      
      
      
      /**
       * This method used to display the daily updates of an intern's
     * @param model The model object
     * @return A string as redirect to displaydailyupdates page
     */
    @RequestMapping("/viewdailyupdates")
  	public String dailyupdate1(Model model) {
  		List<DailyUpdates> dailyUpdatess = dailyUpdatesService.getAllDailyUpdates();

  		for (DailyUpdates dailyUpdates : dailyUpdatess)
  		{
  			System.out.println(dailyUpdates);
  		}
  		model.addAttribute("dailyUpdatess", dailyUpdatess);
  		return "displaydailyupdates";

  	}
      
    
 		/**
 		 * This method redirect updates page records of intern's
 		 * @param id The intern's id
 		 * @param model the model object
 		 * @return A string as redirect to updates daily updates page
 		 */
 		@RequestMapping("/updatedailyupdates/{id}")
 		public String updateForm(@PathVariable("id") Long id, Model model) {
 			DailyUpdates dailyUpdates = this.dailyUpdatesService.getDailyUpdates(id);
 			model.addAttribute("dailyUpdates", dailyUpdates);
 			return "updatedailyupdates";
 		}

 		/**
 		 * This method perform operation of updating records of an intern's
 		 * @param dailyUpdates The daily updates object
 		 * @param request The http request object
 		 * @param model The model object
 		 * @return A redirectview it redirect to admin page
 		 */
 		@RequestMapping(value = "/updatedailyupdates_process", method = RequestMethod.POST)
 		public RedirectView updateUsers(@ModelAttribute DailyUpdates dailyUpdates, HttpServletRequest request, Model model) {
 		dailyUpdatesService.updateDailyUpdates(dailyUpdates);

 			RedirectView redirectView = new RedirectView();

 			redirectView.setUrl(request.getContextPath() + "/admin");
 			model.addAttribute("Message", dailyUpdates.getId());

 			return redirectView;
 		}
 		 		

 			/**
 			 * This method perform the operation of deleting records of dialy updates
 			 * @param id The intern's id
 			 * @param request the http request object
 			 * @return A redirectview it redirect to viewdailyupdates page
 			 */
 			@RequestMapping("/deletedailyupdates/{id}")
 			public RedirectView deleteProduct(@PathVariable("id") Long id, HttpServletRequest request) {
 				this.dailyUpdatesService.deleteDailyUpdatess(id);
 				RedirectView redirectView = new RedirectView();
 				redirectView.setUrl(request.getContextPath() + "/viewdailyupdates");
 				return redirectView;
 			}
 			
 			
 			
 			
 			
 			
}
