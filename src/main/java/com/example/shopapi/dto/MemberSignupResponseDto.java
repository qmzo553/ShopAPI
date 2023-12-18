package com.example.shopapi.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class MemberSignupResponseDto {

    private Long memberId;
    private String email;
    private String name;
    private LocalDateTime regdate;
}
