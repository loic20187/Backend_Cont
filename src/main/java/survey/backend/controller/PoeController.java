package survey.backend.controller;

import lombok.Builder;
import org.springframework.web.bind.annotation.*;
import survey.backend.dto.PoeDto;
import survey.backend.dto.PoeTypeDto;
import survey.backend.dto.TraineeDto;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import static survey.backend.dto.PoeTypeDto.POEC;
import static survey.backend.dto.PoeTypeDto.POEI;

@RestController()
@RequestMapping("api/poe")
@Builder
public class PoeController {
    @GetMapping
    public Set<PoeDto> list() {
        return Set.of(
                PoeDto.builder()
                        .id(1)
                        .PoeTitle("Java Fullstack")
                        .beginDate(LocalDate.of(2022, 10, 24))
                        .endDate(LocalDate.of(2023, 1, 27))
                        .TypePoe(POEI)
                        .build(),
                PoeDto.builder()
                        .id(2)
                        .PoeTitle("Java Fullstack")
                        .beginDate(LocalDate.of(2022,11,2))
                        .endDate(LocalDate.of(2023, 2, 3))
                        .TypePoe(POEC)
                        .build()
        );
    }

    @GetMapping("{id}")
    public Optional<PoeDto> one(@PathVariable("id") int id){
//        return Optional.empty();
        return Optional.of(PoeDto.builder()
                .id(id)
                .PoeTitle("Java Fullstack")
                .beginDate(LocalDate.of(2022, 8, 16))
                .endDate(LocalDate.of(2023, 10, 20))
                .TypePoe(POEI)
                .build());
    }

    @GetMapping("search")
    public Set<PoeDto> search(
            @RequestParam(name="title_Poe", required = false) String titre_Poe,
            @RequestParam(name="type_Poe", required = false) String type_Poe
    ){
        return Set.of(
                PoeDto.builder()
                        .PoeTitle("Consultant Devops")
                        .beginDate(LocalDate.of(2022, 6, 13))
                        .endDate(LocalDate.of(2022, 9, 16))
                        .TypePoe(POEC)
                        .build(),
                PoeDto.builder()
                        .id(57)
                        .PoeTitle("Consultant Cyber Sécurité")
                        .beginDate(LocalDate.of(2021, 9, 13))
                        .endDate(LocalDate.of(2021, 11, 16))
                        .TypePoe(POEI)
                        .build()
        );
    }
}
