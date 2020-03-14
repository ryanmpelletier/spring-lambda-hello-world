package com.github.ryanp102694;

import com.github.ryanp102694.handler.HandlerImplementation;
import com.github.ryanp102694.model.Bar;
import com.github.ryanp102694.model.Foo;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ApplicationTest {

	@Test
	public void test() {
		HandlerImplementation handlerImplementation = new HandlerImplementation();
		Bar result = handlerImplementation.apply(new Foo("value"));
		assertThat(result.getValue()).isEqualTo("Hello World! value");
	}

}
