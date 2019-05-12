package com.demo.javamail.resources;

/*
 @Author Milan Paudyal
 @Date 5/11/19, Sat
*/

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmailDto {
    private String receiverName;
    private String receiverEmail;
    private String subject;
    private String message;
}
