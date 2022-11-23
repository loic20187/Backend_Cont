package survey.backend.dto;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TraineeDtoTest {
    @Test
     void testConstructorDefault(){
         var traineeDto = new TraineeDto();
         assertAll(
                 ()-> assertNull(traineeDto.getId(),"id"),
                 ()-> assertNull(traineeDto.getFirstName(),"firstname"),
                 ()-> assertNull(traineeDto.getLastName(),"lastname"),
                 ()-> assertNull(traineeDto.getEmail(),"email"),
                 ()-> assertNull(traineeDto.getPhoneNumber(),"phone number"),
                 ()-> assertNull(traineeDto.getBirthDate(),"birthdate")
         );
         //var listTraine = List.of(new TraineeDto());
     }

     @Test
     void testAllArgsConstructor(){
        int id = 257;
        String lastName = "Lasker";
        String firstName = "Emanuel";
        String Mail = "manulasker@gmail.com";
        String PhoneNumber = "0702050411";
        LocalDate DateBirth = LocalDate.of(1941,1,11);

        TraineeDto StageDto = new TraineeDto(id,lastName,firstName,Mail,PhoneNumber,DateBirth);

         assertEquals(id,StageDto.getId(),"Error Id");
         assertEquals(firstName,StageDto.getFirstName(),"Error FirstName");
         assertEquals(lastName,StageDto.getLastName(),"Error LastName");
         assertEquals(Mail,StageDto.getEmail(),"Error Email");
         assertEquals(PhoneNumber,StageDto.getPhoneNumber(),"Error PhoneNumber");
         assertEquals(DateBirth,StageDto.getBirthDate(),"Error DateOfBirth");

     }

     @Test
    void TestPartialBuilder(){
        int id = 257;
        String LN = "Rensch";
        String FN = "Danny";
        TraineeDto Stage_Dto_Test = TraineeDto.builder()
                .id(id)
                .lastName(LN)
                .firstName(FN)
                .build();

         assertEquals(id,Stage_Dto_Test.getId(),"Error Id");
         assertEquals(FN,Stage_Dto_Test.getFirstName(),"Error FirstName");
         assertEquals(LN,Stage_Dto_Test.getLastName(),"Error LastName");


         assertAll(
                 ()-> assertNotNull(Stage_Dto_Test.getId(),"id"),
                 ()-> assertNotNull(Stage_Dto_Test.getFirstName(),"firstname"),
                 ()-> assertNotNull(Stage_Dto_Test.getLastName(),"lastname"),
                 ()-> assertEquals(id,Stage_Dto_Test.getId(),"Error Id"),
                 ()-> assertEquals(FN,Stage_Dto_Test.getFirstName(),"Error FirstName"),
                 ()-> assertEquals(LN,Stage_Dto_Test.getLastName(),"Error LastName")
         );

     }

}