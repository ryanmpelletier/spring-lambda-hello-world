package com.github.ryanp102694.handler;

import com.github.ryanp102694.model.Bar;
import com.github.ryanp102694.model.Foo;
import org.springframework.stereotype.Component;

import java.util.function.Function;

//set a FUNCTION_NAME environment variable to fooHandler to trigger this
@Component("fooHandler")
public class HandlerImplementation implements Function<Foo, Bar> {

    @Override
    public Bar apply(Foo foo) {
        return new Bar("Hello World! " + foo.getValue());
    }
}
