package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: h.a.ak */
public class C89045ak extends C89044aj {
    static {
        Covode.recordClassIndex(105129);
    }

    /* renamed from: f */
    public static final <K, V> AbstractC89306h<Map.Entry<K, V>> m154433f(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        return C89070n.m154598r(map.entrySet());
    }

    /* renamed from: e */
    public static final <K, V> List<C89378p<K, V>> m154432e(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        if (map.size() == 0) {
            return C89086z.INSTANCE;
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return C89086z.INSTANCE;
        }
        Map.Entry<? extends K, ? extends V> next = it.next();
        if (!it.hasNext()) {
            return C89070n.m154516a(new C89378p(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C89378p(next.getKey(), next.getValue()));
        do {
            Map.Entry<? extends K, ? extends V> next2 = it.next();
            arrayList.add(new C89378p(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }
}
