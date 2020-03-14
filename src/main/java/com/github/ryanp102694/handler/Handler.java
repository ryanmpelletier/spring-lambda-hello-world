package com.github.ryanp102694.handler;

import com.github.ryanp102694.model.Bar;
import com.github.ryanp102694.model.Foo;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class Handler extends SpringBootRequestHandler<Foo, Bar> {

}
