package itsj.research.rabbitmq.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class CustomMessage implements Serializable {

    private final String text;
    private final int priority;
    private final boolean secret;

    public CustomMessage(@JsonProperty("text") String text,
                         @JsonProperty("priority") int priority,
                         @JsonProperty("secret") boolean secret) {
        this.text = text;
        this.priority = priority;
        this.secret = secret;
    }
}
