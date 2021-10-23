package one.digitalinnovation.personapi.dto.response.request;

import java.time.LocalDate;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    
    private Long id;
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String firtName;
    
    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;
    
    @NotEmpty
    @cpf
    private String cpf;
    
    private LocalDate birthDate;
    
    @Valid
    @NotEmpty
    private List<Phone> phones;
}
