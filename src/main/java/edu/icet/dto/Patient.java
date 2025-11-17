package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private Long id;

    private String fullName;

    private String email;

    private String telephone;

    private String gender;

    private String address;

    private String nic;

}
