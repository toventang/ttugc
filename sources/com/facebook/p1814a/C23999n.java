package com.facebook.p1814a;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.p1894a.p1896b.C24677a;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: com.facebook.a.n */
final class C23999n implements Serializable {
    private static final long serialVersionUID = 20160629001L;

    /* renamed from: a */
    private HashMap<C23866a, List<C23909c>> f56809a;

    static {
        Covode.recordClassIndex(28120);
    }

    /* renamed from: com.facebook.a.n$a */
    static class C24000a implements Serializable {
        private static final long serialVersionUID = 20160629001L;

        /* renamed from: a */
        private final HashMap<C23866a, List<C23909c>> f56810a;

        static {
            Covode.recordClassIndex(28121);
        }

        private Object readResolve() {
            return new C23999n(this.f56810a);
        }

        private C24000a(HashMap<C23866a, List<C23909c>> hashMap) {
            this.f56810a = hashMap;
        }

        /* synthetic */ C24000a(HashMap hashMap, byte b) {
            this(hashMap);
        }
    }

    public C23999n() {
        this.f56809a = new HashMap<>();
    }

    private Object writeReplace() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return new C24000a(this.f56809a, (byte) 0);
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public final Set<C23866a> mo39481a() {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f56809a.keySet();
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    public C23999n(HashMap<C23866a, List<C23909c>> hashMap) {
        HashMap<C23866a, List<C23909c>> hashMap2 = new HashMap<>();
        this.f56809a = hashMap2;
        hashMap2.putAll(hashMap);
    }

    /* renamed from: a */
    public final List<C23909c> mo39480a(C23866a aVar) {
        if (C24677a.m47209a(this)) {
            return null;
        }
        try {
            return this.f56809a.get(aVar);
        } catch (Throwable th) {
            C24677a.m47208a(th, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo39482a(C23866a aVar, List<C23909c> list) {
        if (!C24677a.m47209a(this)) {
            try {
                if (!this.f56809a.containsKey(aVar)) {
                    this.f56809a.put(aVar, list);
                } else {
                    this.f56809a.get(aVar).addAll(list);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }
}
