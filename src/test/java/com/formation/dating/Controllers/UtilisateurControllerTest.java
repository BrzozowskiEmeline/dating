package com.formation.dating.Controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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

import com.formation.dating.Enum.Sexe;
import com.formation.dating.Services.AdresseService;
import com.formation.dating.Services.ApparenceService;
import com.formation.dating.Services.CentreInteretService;
import com.formation.dating.Services.SituationService;
import com.formation.dating.Services.UtilisateurService;

@RunWith(SpringRunner.class)
@WebMvcTest(UtilisateurController.class)
public class UtilisateurControllerTest {

	
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
	public void getform() throws Exception {
			this.mockMvc.perform(get("/result"))
			.andExpect(view().name("pages/Formulaire"))
			.andExpect(status().isOk())
			.andExpect(content().contentType("text/html;charset=UTF-8"))
			.andExpect(model().attributeExists("utilisateur"))
			.andExpect(model().attributeExists("apparence"))
			.andExpect(model().size(3))
			;
			}
	

	@Test
	public void getAllUtilisateur() throws Exception {
			this.mockMvc.perform(get("/utilisateurs"))
			.andExpect(view().name("pages/utilisateurs"))
			.andExpect(status().isOk())
			.andExpect(content().contentType("text/html;charset=UTF-8"))
			.andExpect(model().attribute("sexeF", Sexe.F))
			.andExpect(model().attribute("sexeH", Sexe.H))
			.andExpect(model().size(3))
			;}

	@Test 
	public void login() throws Exception{
		this.mockMvc.perform(get("/login") )
		.andExpect(view().name("pages/connexion"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("text/html;charset=UTF-8"))
		;
	}
	
		
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
