package com.example.lombokstudy.beans;

import lombok.*;

/**
 * @Author: ww
 * @Date: 2021/5/18 16:20
 * @Description: 雄性人型生物
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Builder
public class Man {
    Integer age;

    String name;

    Character gender;

    @NonNull
    String address;

}
