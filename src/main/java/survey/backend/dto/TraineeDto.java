package survey.backend.dto;

import lombok.*;

import java.time.LocalDate;
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class TraineeDto {
    private Integer id;
    private String lastName;
    private String firstName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;

    //public TraineeDto(){
      //  id = 0;
    //}
}
