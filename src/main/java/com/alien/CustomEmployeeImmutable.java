package com.alien;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomEmployeeImmutable {

	private final String name;
	private final Date doj;
	private final List<String> mobile;

	public CustomEmployeeImmutable(String name, Date doj, List<String> mobile) {
		super();
		this.name = name;
		this.doj = doj;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public Date getDoj() {
		return (Date) doj.clone();
	}

	public List<String> getMobile() {
		return new ArrayList<>(mobile);
	}

	@Override
	public String toString() {
		return "CustomEmployeeImmutable [name=" + name + ", doj=" + doj + ", mobile=" + mobile + "]";
	}

	public static void main(String[] args) {
		CustomEmployeeImmutable custom = new CustomEmployeeImmutable("chetan", new Date(),
				Arrays.stream(new String[] { "1244", "1432", "3454" }).collect(Collectors.toList()));
		
		System.out.println(custom);
		custom.getDoj().setDate(5);
		System.out.println(custom);
		
		
		custom.getMobile().add("123456789");
		
		System.out.println(custom);

	}
}
