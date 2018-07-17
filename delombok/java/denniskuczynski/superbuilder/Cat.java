// Generated by delombok at Mon Jul 16 22:06:49 EDT 2018
package denniskuczynski.superbuilder;

public class Cat extends Animal {
    private boolean claws;


    @java.lang.SuppressWarnings("all")
    public static abstract class CatBuilder<C extends Cat, B extends CatBuilder<C, B>> extends Animal.AnimalBuilder<C, B> {
        @java.lang.SuppressWarnings("all")
        private boolean claws;

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected abstract B self();

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public abstract C build();

        @java.lang.SuppressWarnings("all")
        public B claws(final boolean claws) {
            this.claws = claws;
            return self();
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public java.lang.String toString() {
            return "Cat.CatBuilder(super=" + super.toString() + ", claws=" + this.claws + ")";
        }
    }


    @java.lang.SuppressWarnings("all")
    private static final class CatBuilderImpl extends CatBuilder<Cat, CatBuilderImpl> {
        @java.lang.SuppressWarnings("all")
        private CatBuilderImpl() {
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        protected CatBuilderImpl self() {
            return this;
        }

        @java.lang.Override
        @java.lang.SuppressWarnings("all")
        public Cat build() {
            return new Cat(this);
        }
    }

    @java.lang.SuppressWarnings("all")
    protected Cat(final CatBuilder<?, ?> b) {
        super(b);
        this.claws = b.claws;
    }

    @java.lang.SuppressWarnings("all")
    public static CatBuilder<?, ?> builder() {
        return new CatBuilderImpl();
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Cat(super=" + super.toString() + ", claws=" + this.claws + ")";
    }
}
