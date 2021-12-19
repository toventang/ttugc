package com.airbnb.epoxy.p092a;

import android.content.Context;
import android.view.View;
import com.airbnb.epoxy.AbstractC1931d;
import com.airbnb.epoxy.AbstractC1956s;
import com.airbnb.epoxy.C1906aa;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.airbnb.epoxy.a.g */
public final class C1901g {

    /* renamed from: a */
    final Map<C1902a, List<C1903h<?>>> f5740a = new LinkedHashMap();

    /* renamed from: b */
    public final AbstractC1931d f5741b;

    /* renamed from: c */
    public final AbstractC89183m<Context, RuntimeException, C89391z> f5742c;

    static {
        Covode.recordClassIndex(2092);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends AbstractC1956s<?>> C1902a mo5644a(T t) {
        int i;
        if (this.f5741b.mo5726d()) {
            this.f5741b.getItemCount();
            i = t.mo5801g();
        } else {
            i = 1;
        }
        Class<?> cls = t.getClass();
        int a = C1906aa.m6084a(t);
        C89219l.m154719c(t, "");
        return new C1902a(cls, i, a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.airbnb.epoxy.a.g */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <T extends View> List<View> mo5645a(T t) {
        if (!(t instanceof AbstractC1900f)) {
            return C89070n.m154516a(t);
        }
        List<View> a = ((AbstractC1900f) t).mo5643a();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            C89070n.m154535a((Collection) arrayList, (Iterable) mo5645a((View) it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.m<? super android.content.Context, ? super java.lang.RuntimeException, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C1901g(AbstractC1931d dVar, AbstractC89183m<? super Context, ? super RuntimeException, C89391z> mVar) {
        C89219l.m154719c(dVar, "");
        C89219l.m154719c(mVar, "");
        this.f5741b = dVar;
        this.f5742c = mVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.airbnb.epoxy.a.g$a */
    public static final class C1902a {

        /* renamed from: a */
        public final Class<? extends AbstractC1956s<?>> f5743a;

        /* renamed from: b */
        public final int f5744b;

        /* renamed from: c */
        public final int f5745c;

        /* renamed from: d */
        public final Object f5746d = null;

        static {
            Covode.recordClassIndex(2093);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1902a)) {
                return false;
            }
            C1902a aVar = (C1902a) obj;
            return C89219l.m154714a(this.f5743a, aVar.f5743a) && this.f5744b == aVar.f5744b && this.f5745c == aVar.f5745c && C89219l.m154714a(this.f5746d, aVar.f5746d);
        }

        public final int hashCode() {
            Class<? extends AbstractC1956s<?>> cls = this.f5743a;
            int i = 0;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f5744b) * 31) + this.f5745c) * 31;
            Object obj = this.f5746d;
            if (obj != null) {
                i = obj.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "CacheKey(epoxyModelClass=" + this.f5743a + ", spanSize=" + this.f5744b + ", viewType=" + this.f5745c + ", signature=" + this.f5746d + ")";
        }

        public C1902a(Class<? extends AbstractC1956s<?>> cls, int i, int i2) {
            C89219l.m154719c(cls, "");
            this.f5743a = cls;
            this.f5744b = i;
            this.f5745c = i2;
        }
    }
}
