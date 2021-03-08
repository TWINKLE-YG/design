package cn.design.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: XILIULOU
 * @description:   结果
 * @author: Mr.YG
 * @create: 2021-03-02 17:12
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LotteryResult {
    private String uid;
    private String msg;
    private Date date;
    private String lottery;

    public LotteryResult(String uid, String lottery, Date date) {
        this.uid = uid;
        this.date = date;
        this.lottery = lottery;
    }
}
