package com.facebook.imagepipeline.p1871a.p1874c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.AbstractC24092j;
import com.facebook.common.p1832d.C24088h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1879d.C24382h;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.facebook.imagepipeline.a.c.c */
public final class C24338c {

    /* renamed from: a */
    public final AbstractC24026e f57713a;

    /* renamed from: b */
    public final C24382h<AbstractC24026e, AbstractC24454c> f57714b;

    /* renamed from: c */
    private final C24382h.AbstractC24387c<AbstractC24026e> f57715c = new C24382h.AbstractC24387c<AbstractC24026e>() {
        /* class com.facebook.imagepipeline.p1871a.p1874c.C24338c.C243391 */

        static {
            Covode.recordClassIndex(28481);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, boolean] */
        @Override // com.facebook.imagepipeline.p1879d.C24382h.AbstractC24387c
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo40140a(AbstractC24026e eVar, boolean z) {
            C24338c.this.mo40136a(eVar, z);
        }
    };

    /* renamed from: d */
    private final LinkedHashSet<AbstractC24026e> f57716d = new LinkedHashSet<>();

    static {
        Covode.recordClassIndex(28480);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.a.c.c$a */
    public static class C24341a implements AbstractC24026e {

        /* renamed from: a */
        private final AbstractC24026e f57720a;

        /* renamed from: b */
        private final int f57721b;

        static {
            Covode.recordClassIndex(28483);
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        /* renamed from: a */
        public final String mo39543a() {
            return null;
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final int hashCode() {
            return (this.f57720a.hashCode() * 1013) + this.f57721b;
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final String toString() {
            return C24088h.m45610a(this).mo39647a("imageCacheKey", this.f57720a).mo39646a("frameIndex", this.f57721b).toString();
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        /* renamed from: a */
        public final boolean mo39544a(Uri uri) {
            return this.f57720a.mo39544a(uri);
        }

        @Override // com.facebook.p1826c.p1827a.AbstractC24026e
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C24341a) {
                C24341a aVar = (C24341a) obj;
                if (this.f57721b != aVar.f57721b || !this.f57720a.equals(aVar.f57720a)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public C24341a(AbstractC24026e eVar, int i) {
            this.f57720a = eVar;
            this.f57721b = i;
        }
    }

    /* renamed from: a */
    public final synchronized AbstractC24026e mo40134a() {
        AbstractC24026e eVar;
        MethodCollector.m26663i(2782);
        eVar = null;
        Iterator<AbstractC24026e> it = this.f57716d.iterator();
        if (it.hasNext()) {
            eVar = it.next();
            it.remove();
        }
        MethodCollector.m26664o(2782);
        return eVar;
    }

    /* renamed from: b */
    public final C24341a mo40138b(int i) {
        return new C24341a(this.f57713a, i);
    }

    /* renamed from: c */
    public final void mo40139c(final int i) {
        if (i != -1) {
            this.f57714b.mo40206b(new AbstractC24092j<AbstractC24026e>() {
                /* class com.facebook.imagepipeline.p1871a.p1874c.C24338c.C243402 */

                static {
                    Covode.recordClassIndex(28482);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.facebook.common.p1832d.AbstractC24092j
                /* renamed from: a */
                public final /* synthetic */ boolean mo39650a(AbstractC24026e eVar) {
                    if (new C24341a(C24338c.this.f57713a, i).equals(eVar)) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    /* renamed from: a */
    public final boolean mo40137a(int i) {
        return this.f57714b.mo40208c(mo40138b(i));
    }

    /* renamed from: a */
    public final C24117a<AbstractC24454c> mo40135a(int i, C24117a<AbstractC24454c> aVar) {
        return this.f57714b.mo40203a(mo40138b(i), aVar, this.f57715c);
    }

    public C24338c(AbstractC24026e eVar, C24382h<AbstractC24026e, AbstractC24454c> hVar) {
        this.f57713a = eVar;
        this.f57714b = hVar;
    }

    /* renamed from: a */
    public final synchronized void mo40136a(AbstractC24026e eVar, boolean z) {
        MethodCollector.m26663i(2772);
        if (z) {
            this.f57716d.add(eVar);
            MethodCollector.m26664o(2772);
            return;
        }
        this.f57716d.remove(eVar);
        MethodCollector.m26664o(2772);
    }
}
