package io.github.cmt.easystrategy.test.function.multi;

import io.github.cmt.easystrategy.StrategyIdentifier;
import org.springframework.core.annotation.Order;

/**
 * @author shengchaojie
 * @date 2019-09-19
 **/
@StrategyIdentifier(identifyCode = "2")
@StrategyIdentifier(identifyCode = "3")
@Order(1)
public class DValidation implements Validation{
    @Override
    public void validate() {
        System.out.println("DDDDD");
    }
}
