package com.bytedance.sdk.p1665b.p1669d.p1674e;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1665b.p1669d.p1671b.AbstractC22559b;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.bytedance.sdk.b.d.e.a */
public abstract class AbstractRunnableC22576a<T> implements Runnable {

    /* renamed from: a */
    private SoftReference<AbstractC22559b<T>> f53348a;

    /* renamed from: d */
    public final String f53349d;

    /* renamed from: e */
    public final Map<String, String> f53350e;

    /* renamed from: f */
    public AbstractC22577a<T> f53351f;

    /* renamed from: g */
    public T f53352g;

    /* renamed from: h */
    public Exception f53353h;

    /* renamed from: i */
    public boolean f53354i = true;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.b.d.e.a$a */
    public interface AbstractC22577a<T> {
        static {
            Covode.recordClassIndex(26393);
        }

        /* renamed from: a */
        void mo36857a(Exception exc);

        /* renamed from: a */
        void mo36858a(T t);
    }

    static {
        Covode.recordClassIndex(26392);
    }

    /* renamed from: a */
    public abstract T mo36849a(String str);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC22559b<T> mo36851a() {
        return this.f53348a.get();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f53349d;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        Map<String, String> map = this.f53350e;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        AbstractC22577a<T> aVar = this.f53351f;
        if (aVar != null) {
            i3 = aVar.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        SoftReference<AbstractC22559b<T>> softReference = this.f53348a;
        if (softReference != null) {
            i4 = softReference.hashCode();
        }
        return i7 + i4;
    }

    /* renamed from: a */
    public final void mo36852a(AbstractC22559b<T> bVar) {
        this.f53348a = new SoftReference<>(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36853a(Exception exc) {
        AbstractC22577a<T> aVar = this.f53351f;
        if (aVar != null) {
            aVar.mo36857a(exc);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36854a(T t) {
        AbstractC22577a<T> aVar = this.f53351f;
        if (aVar != null) {
            aVar.mo36858a((Object) t);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractRunnableC22576a aVar = (AbstractRunnableC22576a) obj;
            String str = this.f53349d;
            if (str == null ? aVar.f53349d != null : !str.equals(aVar.f53349d)) {
                return false;
            }
            Map<String, String> map = this.f53350e;
            if (map == null ? aVar.f53350e != null : !map.equals(aVar.f53350e)) {
                return false;
            }
            AbstractC22577a<T> aVar2 = this.f53351f;
            if (aVar2 == null ? aVar.f53351f != null : !aVar2.equals(aVar.f53351f)) {
                return false;
            }
            SoftReference<AbstractC22559b<T>> softReference = this.f53348a;
            SoftReference<AbstractC22559b<T>> softReference2 = aVar.f53348a;
            if (softReference != null) {
                return softReference.equals(softReference2);
            }
            if (softReference2 == null) {
                return true;
            }
        }
        return false;
    }

    public AbstractRunnableC22576a(String str, Map<String, String> map) {
        this.f53349d = str;
        this.f53350e = map;
    }
}
