package p4519d.p4520a.p4521a;

import com.bytedance.covode.number.Covode;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89201f;

/* renamed from: d.a.a.b */
public final class C87989b<K, V> implements AbstractC89201f, Map<K, V> {

    /* renamed from: a */
    private final /* synthetic */ Map f199868a;

    static {
        Covode.recordClassIndex(104015);
    }

    public /* synthetic */ C87989b() {
        this(false);
    }

    public final void clear() {
        this.f199868a.clear();
    }

    public final boolean containsKey(Object obj) {
        return this.f199868a.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f199868a.containsValue(obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f199868a.get(obj);
    }

    public final boolean isEmpty() {
        return this.f199868a.isEmpty();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        return (V) this.f199868a.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        C89219l.m154719c(map, "");
        this.f199868a.putAll(map);
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        return (V) this.f199868a.remove(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return this.f199868a.entrySet();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return this.f199868a.keySet();
    }

    public final /* bridge */ int size() {
        return this.f199868a.size();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return this.f199868a.values();
    }

    public C87989b(boolean z) {
        Map linkedHashMap;
        if (z) {
            linkedHashMap = new ConcurrentHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(0, 0.75f, true);
        }
        this.f199868a = linkedHashMap;
    }
}
