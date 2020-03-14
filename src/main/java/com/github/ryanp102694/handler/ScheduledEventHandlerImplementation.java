package com.github.ryanp102694.handler;

import com.amazonaws.services.lambda.runtime.events.ScheduledEvent;
import com.github.ryanp102694.model.Bar;
import org.springframework.stereotype.Component;

import java.util.function.Function;

//set a FUNCTION_NAME environment variable to scheduledEventHandler to trigger this
@Component("scheduledEventHandler")
public class ScheduledEventHandlerImplementation  implements Function<ScheduledEvent, Bar> {

    @Override
    public Bar apply(ScheduledEvent scheduledEvent) {
        return new Bar("We handled a scheduledEvent! " + scheduledEvent.getTime());
    }
}
