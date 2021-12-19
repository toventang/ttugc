package p4600h.p4601a;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.a.aa */
final class C89035aa implements AbstractC89196a, Serializable, Map {

    /* renamed from: a */
    public static final C89035aa f202765a = new C89035aa();
    private static final long serialVersionUID = 8246714829545688274L;

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    private C89035aa() {
    }

    private final Object readResolve() {
        return f202765a;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C89036ab.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return C89036ab.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C89086z.INSTANCE;
    }

    static {
        Covode.recordClassIndex(105119);
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C89219l.m154721d(obj, "");
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Map) || !((Map) obj).isEmpty()) {
            return false;
        }
        return true;
    }
}
