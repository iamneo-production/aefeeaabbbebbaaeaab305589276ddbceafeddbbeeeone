package com.example.springapp;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.File;


@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootTest(classes = SpringappApplication.class)

@AutoConfigureMockMvc

class SpringappApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test



	void testadd() throws Exception {

		String st = "{\"sportsId\": 112,\"nameOfSport\": \"Demo\", \"numOfPlayers\": 15}";
		mockMvc.perform(MockMvcRequestBuilders.post("/")
		.contentType(MediaType.APPLICATION_JSON)
		 				.content(st)
		 				.accept(MediaType.APPLICATION_JSON))
						.andExpect(MockMvcResultMatchers.status().isOk())
						.andExpect(jsonPath("$").value(true))
						.andReturn();


	}

    @Test

    void testgetByID() throws Exception{

         mockMvc.perform(get("/112")

                        .accept(MediaType.APPLICATION_JSON))

                        .andDo(print())

                        .andExpect(status().isOk())

                        .andExpect(jsonPath("$.numOfPlayers").value(15))

                        .andReturn();

    }

	 @Test

	 void testgetAll() throws Exception{  
 
		  mockMvc.perform(get("/")
 
						 .accept(MediaType.APPLICATION_JSON))
 
						 .andDo(print())
 
						 .andExpect(status().isOk())
 
						 .andExpect(jsonPath("$").isArray())
 
						 .andReturn();
 
	 }

	 @Test

	 void testupdateDetails() throws Exception {  
 
		String st = "{\"sportsId\": 112,\"nameOfSport\": \"khokho\", \"numOfPlayers\": 15}";
 
		   mockMvc.perform(MockMvcRequestBuilders.put("/112")
 
						 .contentType(MediaType.APPLICATION_JSON)
 
						 .content(st)
 
						 .accept(MediaType.APPLICATION_JSON))
 
						 .andExpect(MockMvcResultMatchers.status().isOk())
 
						 .andExpect(jsonPath("$.numOfPlayers").value(15))

						 .andReturn();
 
	 }
	   @Test

    void testdeleteById() throws Exception{



String st = "{\"sportsId\": 112,\"nameOfSport\": \"khokho\", \"numOfPlayers\": 15}";
 
		   mockMvc.perform(MockMvcRequestBuilders.put("/112")
 
						 .contentType(MediaType.APPLICATION_JSON)
 
						 .content(st)
 
						 .accept(MediaType.APPLICATION_JSON))
 
						 .andExpect(MockMvcResultMatchers.status().isOk())
 
						 .andExpect(jsonPath("$.numOfPlayers").value(15))

						 .andReturn();

    }

	 @Test

    public void controllerfolder() {

        String directoryPath = "src/main/java/com/example/springapp/controller"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void controllerfile() {

        String filePath = "src/main/java/com/example/springapp/controller/SportsController.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


	@Test

    public void testModelFolder() {

        String directoryPath = "src/main/java/com/example/springapp/model"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

	@Test

    public void testModelFile() {

        String filePath = "src/main/java/com/example/springapp/model/Sports.java";

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	@Test

    public void testrepositoryfolder() {

        String directoryPath = "src/main/java/com/example/springapp/repository"; // Replace with the path to your directory

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testrepositoryFile() {

        String filePath = "src/main/java/com/example/springapp/repository/SportsRepo.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }


    @Test

    public void testServiceFolder() {

        String directoryPath = "src/main/java/com/example/springapp/service"; 

        File directory = new File(directoryPath);

        assertTrue(directory.exists() && directory.isDirectory());

    }

   

    @Test

    public void testServieFile() {

        String filePath = "src/main/java/com/example/springapp/service/ApiService.java";

        // Replace with the path to your file

        File file = new File(filePath);

        assertTrue(file.exists() && file.isFile());

    }

	 

}
