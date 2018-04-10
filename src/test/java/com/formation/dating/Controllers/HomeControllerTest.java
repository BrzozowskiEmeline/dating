package com.formation.dating.Controllers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.flash;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.formation.dating.Services.AdresseService;
import com.formation.dating.Services.ApparenceService;
import com.formation.dating.Services.CentreInteretService;
import com.formation.dating.Services.SituationService;
import com.formation.dating.Services.UtilisateurService;


@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

	
	@Autowired // Injection de dépendances
	MockMvc mockMvc;
	
	@MockBean
	private UtilisateurService us;
	
@MockBean
	private SituationService ss;
	
	@MockBean
	private CentreInteretService cis;
	
	@MockBean
	private AdresseService as;
	
	@MockBean
	private ApparenceService aps;
	
	
	
	
	@Test
	public void index2() throws Exception {
		this.mockMvc.perform(get("/"))
		.andExpect(view().name("index"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("text/html;charset=UTF-8"))
		.andExpect(model().attribute("hello", "Bienvenue"))
		.andExpect(model().size(1))
		.andExpect(model().attributeExists("hello"))
		.andExpect(flash().attributeCount(0))
		.andExpect(content().string(containsString("DOCTYPE")))
		;}
//		 
	@ContextConfiguration
	@WebAppConfiguration
	public class CsrfShowcaseTests {
		@Autowired
		private WebApplicationContext context;

		private MockMvc mvc;

		@Before
		public void setup() {
			mvc = MockMvcBuilders
					.webAppContextSetup(context)
					.build();
			}
		
	
		
		
		
		
		
		
		
	
	}
}

	
	



