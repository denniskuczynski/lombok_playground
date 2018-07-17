package denniskuczynski.superbuilder;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString(callSuper=true)
public class Cat extends Animal {
    private boolean claws;
}