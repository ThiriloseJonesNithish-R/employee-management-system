package com.wipro.cpc.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private String email;
    private String department;
    private double salary;  // Include salary in API requests
}
