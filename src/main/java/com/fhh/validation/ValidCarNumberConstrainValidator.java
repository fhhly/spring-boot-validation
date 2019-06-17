package com.fhh.validation;

import com.fhh.validation.constrains.ValidCardNumber;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * 功能描述：（）
 *
 * @author: biubiubiu小浩
 * @date: 2019-01-14 15:10
 */
public class ValidCarNumberConstrainValidator implements ConstraintValidator<ValidCardNumber,String> {
	@Override
	public void initialize(ValidCardNumber constraintAnnotation) {
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		String[] split = value.split("-");

		if (ArrayUtils.getLength(split) != 2){
			return false;
		}

		String prefix = split[0];
		String suffix = split[1];

		boolean validPrefix = Objects.equals("fhh", prefix);

		boolean validSuffix = StringUtils.isNumeric(suffix);

		return validPrefix && validSuffix;
	}
}