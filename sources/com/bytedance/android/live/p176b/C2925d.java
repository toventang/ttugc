package com.bytedance.android.live.p176b;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28022o;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.b.d */
public final class C2925d implements AbstractC89196a, Map<String, Object> {

    /* renamed from: a */
    private final C28022o f8678a;

    static {
        Covode.recordClassIndex(3364);
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.util.function.BiFunction] */
    @Override // java.util.Map
    public final /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // java.util.Map
    public final /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: com.bytedance.android.live.b.d$a */
    public static final class C2926a implements AbstractC89196a, Map.Entry<String, Object> {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f8679a;

        static {
            Covode.recordClassIndex(3365);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Map.Entry
        public final /* synthetic */ String getKey() {
            Object key = this.f8679a.getKey();
            C89219l.m154716b(key, "");
            return key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            Object value = this.f8679a.getValue();
            C89219l.m154716b(value, "");
            return C2940n.m8270b((AbstractC28019l) value);
        }

        C2926a(Map.Entry entry) {
            this.f8679a = entry;
        }
    }

    public final boolean isEmpty() {
        if (this.f8678a.f65804a.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        Set<String> keySet = this.f8678a.f65804a.keySet();
        C89219l.m154716b(keySet, "");
        return keySet;
    }

    public final /* bridge */ int size() {
        return this.f8678a.f65804a.size();
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        Set<Map.Entry<String, AbstractC28019l>> entrySet = this.f8678a.f65804a.entrySet();
        C89219l.m154716b(entrySet, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new C2926a(it.next()));
        }
        return linkedHashSet;
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        Set<Map.Entry<String, AbstractC28019l>> entrySet = this.f8678a.f65804a.entrySet();
        C89219l.m154716b(entrySet, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            C89219l.m154716b(value, "");
            linkedHashSet.add(C2940n.m8270b((AbstractC28019l) value));
        }
        return linkedHashSet;
    }

    public C2925d(C28022o oVar) {
        C89219l.m154721d(oVar, "");
        this.f8678a = oVar;
    }

    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        C89219l.m154721d(obj, "");
        return this.f8678a.f65804a.keySet().contains(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C89219l.m154721d(str, "");
        AbstractC28019l c = this.f8678a.mo46803c(str);
        if (c != null) {
            return C2940n.m8270b(c);
        }
        return null;
    }

    public final boolean containsValue(Object obj) {
        Set<Map.Entry<String, AbstractC28019l>> entrySet = this.f8678a.f65804a.entrySet();
        C89219l.m154716b(entrySet, "");
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            if (C89219l.m154714a(it.next().getValue(), obj)) {
                return true;
            }
        }
        return false;
    }
}
