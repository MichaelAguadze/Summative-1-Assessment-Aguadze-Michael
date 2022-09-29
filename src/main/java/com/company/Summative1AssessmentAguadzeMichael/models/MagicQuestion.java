package com.company.Summative1AssessmentAguadzeMichael.models;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class MagicQuestion {
    // Since object will be created from user JSON input, attributes are not final and default constructor define

        @NotEmpty(message = "Please enter a question.")
        private String text;

        public MagicQuestion() {
        }

        public MagicQuestion(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        @Override
        public int hashCode() {
            return Objects.hash(getText());
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            MagicQuestion magicQuestion = (MagicQuestion) obj;
            return getText().equals(magicQuestion.getText());
        }
    }
