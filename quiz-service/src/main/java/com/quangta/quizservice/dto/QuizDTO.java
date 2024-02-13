package com.quangta.quizservice.dto;

import lombok.Data;

@Data
public class QuizDTO {
    private String categoryName;
    private Integer numQuestions;
    private String title;
}
