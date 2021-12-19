package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;

/* renamed from: h.a.aj */
public class C89044aj extends C89043ai {
    static {
        Covode.recordClassIndex(105128);
    }

    /* renamed from: a */
    public static final <K, V> void m154425a(Map<? super K, ? super V> map, C89378p<? extends K, ? extends V>[] pVarArr) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(pVarArr, "");
        for (C89378p<? extends K, ? extends V> pVar : pVarArr) {
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> void m154424a(Map<? super K, ? super V> map, Iterable<? extends C89378p<? extends K, ? extends V>> iterable) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(iterable, "");
        Iterator<? extends C89378p<? extends K, ? extends V>> it = iterable.iterator();
        while (it.hasNext()) {
            C89378p pVar = (C89378p) it.next();
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m154415a() {
        C89035aa aaVar = C89035aa.f202765a;
        Objects.requireNonNull(aaVar, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return aaVar;
    }

    /* renamed from: d */
    public static final <K, V> Map<K, V> m154431d(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        return new LinkedHashMap(map);
    }

    /* renamed from: c */
    public static final <K, V> HashMap<K, V> m154428c(C89378p<? extends K, ? extends V>... pVarArr) {
        C89219l.m154721d(pVarArr, "");
        HashMap<K, V> hashMap = new HashMap<>(C89041ag.m154411a(pVarArr.length));
        C89041ag.m154425a(hashMap, pVarArr);
        return hashMap;
    }

    /* renamed from: d */
    public static final <K, V> LinkedHashMap<K, V> m154430d(C89378p<? extends K, ? extends V>... pVarArr) {
        C89219l.m154721d(pVarArr, "");
        return (LinkedHashMap) C89041ag.m154422a(pVarArr, new LinkedHashMap(C89041ag.m154411a(1)));
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m154417a(Iterable<? extends C89378p<? extends K, ? extends V>> iterable) {
        C89219l.m154721d(iterable, "");
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C89041ag.m154415a();
        }
        if (size != 1) {
            return C89041ag.m154418a(iterable, new LinkedHashMap(C89041ag.m154411a(collection.size())));
        }
        return C89041ag.m154412a((C89378p) ((List) iterable).get(0));
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m154427b(C89378p<? extends K, ? extends V>... pVarArr) {
        C89219l.m154721d(pVarArr, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C89041ag.m154411a(pVarArr.length));
        C89041ag.m154425a(linkedHashMap, pVarArr);
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m154429c(Map<? extends K, ? extends V> map) {
        C89219l.m154721d(map, "");
        int size = map.size();
        if (size == 0) {
            return C89041ag.m154415a();
        }
        if (size != 1) {
            return C89041ag.m154431d(map);
        }
        return C89041ag.m154414b(map);
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m154421a(C89378p<? extends K, ? extends V>... pVarArr) {
        C89219l.m154721d(pVarArr, "");
        if (pVarArr.length > 0) {
            return C89041ag.m154422a(pVarArr, new LinkedHashMap(C89041ag.m154411a(pVarArr.length)));
        }
        return C89041ag.m154415a();
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m154416a(AbstractC89306h<? extends C89378p<? extends K, ? extends V>> hVar, M m) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(m, "");
        C89041ag.m154423a(m, hVar);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m154418a(Iterable<? extends C89378p<? extends K, ? extends V>> iterable, M m) {
        C89219l.m154721d(iterable, "");
        C89219l.m154721d(m, "");
        C89041ag.m154424a(m, iterable);
        return m;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m154426b(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(map2, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.LinkedHashMap */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <K, V> Map<K, V> m154419a(Map<? extends K, ? extends V> map, C89378p<? extends K, ? extends V> pVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(pVar, "");
        if (map.isEmpty()) {
            return C89041ag.m154412a(pVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pVar.getFirst(), pVar.getSecond());
        return linkedHashMap;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m154420a(Map<? extends K, ? extends V> map, M m) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(m, "");
        m.putAll(map);
        return m;
    }

    /* renamed from: a */
    public static final <K, V, M extends Map<? super K, ? super V>> M m154422a(C89378p<? extends K, ? extends V>[] pVarArr, M m) {
        C89219l.m154721d(pVarArr, "");
        C89219l.m154721d(m, "");
        C89041ag.m154425a(m, pVarArr);
        return m;
    }

    /* renamed from: a */
    public static final <K, V> void m154423a(Map<? super K, ? super V> map, AbstractC89306h<? extends C89378p<? extends K, ? extends V>> hVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(hVar, "");
        Iterator<? extends C89378p<? extends K, ? extends V>> a = hVar.mo2926a();
        while (a.hasNext()) {
            C89378p pVar = (C89378p) a.next();
            map.put((Object) pVar.component1(), (Object) pVar.component2());
        }
    }
}
