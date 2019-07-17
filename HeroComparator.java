import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class HeroComparator implements Comparator<Hero> {


    @Override
    public int compare(Hero hero1, Hero hero2) {
        return hero1.getAge() - hero2.getAge();
    }

    @Override
    public Comparator<Hero> reversed() {
        return null;
    }

    @Override
    public Comparator<Hero> thenComparing(Comparator<? super Hero> other) {
        return null;
    }

    @Override
    public <U> Comparator<Hero> thenComparing(Function<? super Hero, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return null;
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Hero> thenComparing(Function<? super Hero, ? extends U> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Hero> thenComparingInt(ToIntFunction<? super Hero> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Hero> thenComparingLong(ToLongFunction<? super Hero> keyExtractor) {
        return null;
    }

    @Override
    public Comparator<Hero> thenComparingDouble(ToDoubleFunction<? super Hero> keyExtractor) {
        return null;
    }
}
