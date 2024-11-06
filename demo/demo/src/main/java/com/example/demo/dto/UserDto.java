package com.example.demo.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;



@Data
@Builder
public class UserDto {

    private Long id;
    private String username;
    private String password;



    private LocalDateTime createdOn;

    private LocalDateTime updatedOn;
}


