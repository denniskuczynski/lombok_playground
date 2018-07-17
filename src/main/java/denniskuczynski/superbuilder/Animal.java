package denniskuczynski.superbuilder;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString
@SuperBuilder
public abstract class Animal {
    private int legs;
}