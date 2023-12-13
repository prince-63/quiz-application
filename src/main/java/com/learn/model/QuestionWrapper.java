package com.learn.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class QuestionWrapper {
    private Long id;
    private String questionName;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    public QuestionWrapper(Long id, String name, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.questionName = questionName;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }
}
