package com.FirstSpringBoot.demo.of.First.Spring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long departmentId;

    //to make the name notnull
    @NotBlank(message= "Please Add Department Name")

  /*  @Length(max=5,min=1)
    @Size(max=3,min=1)
    positive,negative,positiveorzero,future,past,presentorpast,futureorpast
   */

    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
