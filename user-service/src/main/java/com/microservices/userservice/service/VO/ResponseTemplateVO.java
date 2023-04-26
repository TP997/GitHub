package com.microservices.userservice.service.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ResponseTempleteVO {
    private User user;
    private Department department;
}
