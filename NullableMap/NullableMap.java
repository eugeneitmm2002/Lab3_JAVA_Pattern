import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NullableMap extends MapDecorator {
    private int overTime;
    LocalTime startTime;


    public NullableMap(Map map, int seconds) {
        super(map);
        this.overTime = seconds;
        startTime = LocalTime.now();
    }

    public Object put(Object key, Object value) {
        startTime = LocalTime.now();
        return super.put(key, value);
    }

    public Object get(Object key) {
        if (startTime.plus(overTime, ChronoUnit.SECONDS).isBefore(LocalTime.now())) {
            return null;
        }
        return super.get(key);
    }

    public int size() {
        return super.size();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public boolean containsKey(Object key) {
        return super.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return super.containsValue(value);
    }

    public Object remove(Object key) {
        return super.remove(key);
    }

    public void putAll(Map m) {
        super.putAll(m);
    }

    public void clear() {
        super.clear();
    }

    public Set keySet() {
        return super.keySet();
    }

    public Collection values() {
        return super.values();
    }

    public Set<Entry> entrySet() {
        return super.entrySet();
    }
}
