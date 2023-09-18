package com.example.restclientbrandnewwebinterface.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Post {

    private Integer userId;
    private Integer id ;
    private String title;
    private String body ;
}
