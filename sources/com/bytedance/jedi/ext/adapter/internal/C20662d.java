package com.bytedance.jedi.ext.adapter.internal;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.AbstractC20640c;
import com.bytedance.jedi.ext.adapter.internal.C20659c;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.d */
public final class C20662d {

    /* renamed from: d */
    public static final C20664a f48863d = new C20664a((byte) 0);

    /* renamed from: a */
    public C20659c f48864a;

    /* renamed from: b */
    public C20658b f48865b;

    /* renamed from: c */
    public C20668g f48866c;

    /* renamed from: e */
    private final CopyOnWriteArraySet<AbstractC20640c> f48867e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    private final AbstractC1196i f48868f;

    static {
        Covode.recordClassIndex(24198);
    }

    /* renamed from: com.bytedance.jedi.ext.adapter.internal.d$a */
    public static final class C20664a {
        static {
            Covode.recordClassIndex(24200);
        }

        private C20664a() {
        }

        public /* synthetic */ C20664a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C20662d m38915a(AbstractC1196i iVar, C20659c cVar) {
            C20662d a = cVar.mo33916a(iVar);
            if (a != null) {
                return a;
            }
            C20662d dVar = new C20662d(iVar, cVar);
            cVar.mo33917a(iVar, dVar);
            return dVar;
        }

        /* renamed from: a */
        public static C20662d m38914a(ActivityC0945e eVar, Fragment fragment) {
            C20659c a = C20659c.C20660a.m38911a(eVar, fragment);
            AbstractC1196i lifecycle = a.getLifecycle();
            C89219l.m154709a((Object) lifecycle, "");
            return m38915a(lifecycle, a);
        }
    }

    /* renamed from: a */
    public final C20662d mo33918a(AbstractC20640c cVar) {
        C89219l.m154719c(cVar, "");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) cVar;
        if (this.f48867e.add(jediViewHolderProxy)) {
            jediViewHolderProxy.f48842d = this;
            this.f48868f.mo4012a(jediViewHolderProxy);
        }
        return this;
    }

    /* renamed from: b */
    public final C20662d mo33919b(AbstractC20640c cVar) {
        C89219l.m154719c(cVar, "");
        JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) cVar;
        this.f48868f.mo4013b(jediViewHolderProxy);
        int i = C20665e.f48870a[this.f48868f.mo4011a().ordinal()];
        if (i != 2) {
            if (i == 3) {
                jediViewHolderProxy.onDestroy();
            } else if (i == 4) {
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
            } else if (i == 5) {
                jediViewHolderProxy.onStop();
                jediViewHolderProxy.onDestroy();
            }
        } else if (!jediViewHolderProxy.f48843e) {
            jediViewHolderProxy.onDestroy();
        }
        jediViewHolderProxy.f48842d = null;
        this.f48867e.remove(jediViewHolderProxy);
        return this;
    }

    public C20662d(AbstractC1196i iVar, C20659c cVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(cVar, "");
        this.f48868f = iVar;
        this.f48864a = cVar;
        C206631 r1 = new AbstractC89171a<C89391z>(this) {
            /* class com.bytedance.jedi.ext.adapter.internal.C20662d.C206631 */

            /* renamed from: a */
            final /* synthetic */ C20662d f48869a;

            static {
                Covode.recordClassIndex(24199);
            }

            {
                this.f48869a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f48869a.f48864a = null;
                C20658b bVar = this.f48869a.f48865b;
                if (bVar != null) {
                    bVar.mo33914a();
                }
                C20668g gVar = this.f48869a.f48866c;
                if (gVar != null) {
                    gVar.mo33920a();
                }
                return C89391z.f203057a;
            }
        };
        C89219l.m154719c(r1, "");
        cVar.f48859b.add(r1);
    }
}
