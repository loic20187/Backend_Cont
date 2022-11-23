package survey.backend.dto;

import lombok.*;
import survey.backend.controller.PoeController;

import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PoeDto {
    private Integer id;
    private String PoeTitle;
    private LocalDate beginDate;
    private LocalDate endDate;
    private PoeTypeDto TypePoe;






}
