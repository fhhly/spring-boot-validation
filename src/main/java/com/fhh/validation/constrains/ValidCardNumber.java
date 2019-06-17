package com.fhh.validation.constrains;

import com.fhh.validation.ValidCarNumberConstrainValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-01-11 16:48
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {ValidCarNumberConstrainValidator.class})
public @interface ValidCardNumber {
	String message() default "{com.fhh.bean.validation.invalid.card.number.message}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}