package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: h.a.ai */
public class C89043ai extends C89042ah {
    static {
        Covode.recordClassIndex(105127);
    }

    /* renamed from: a */
    public static final int m154411a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public static final <K extends Comparable<? super K>, V> SortedMap<K, V> m154413a(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        return new TreeMap(map);
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m154412a(C89378p<? extends K, ? extends V> pVar) {
        C89219l.m154721d(pVar, "");
        Map<K, V> singletonMap = Collections.singletonMap(pVar.getFirst(), pVar.getSecond());
        C89219l.m154716b(singletonMap, "");
        return singletonMap;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m154414b(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C89219l.m154716b(singletonMap, "");
        return singletonMap;
    }
}
