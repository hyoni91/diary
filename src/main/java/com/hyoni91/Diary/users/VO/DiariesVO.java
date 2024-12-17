package com.hyoni91.Diary.users.VO;

import lombok.Data;

@Data
public class DiariesVO {
    private int dNum;
    private String title;
    private String content;
    private String dDate;
    private int userNum;
    private int cateNum;
}
