package com.certification.chapter_8_class_design.final_variables;

public class MouseHouse {
    private final int volume;
    private final String type;

    {
        this.volume = 5;
    }

    public MouseHouse() {
        // this.volume = 10; volume is final
        type = "happy";
    }
}
