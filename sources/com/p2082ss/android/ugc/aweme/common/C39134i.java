package com.p2082ss.android.ugc.aweme.common;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.i */
public final class C39134i<DATA> {

    /* renamed from: a */
    public final C33943c<C39138j<DATA>> f92339a = new C39135a(this);

    /* renamed from: b */
    private final AbstractC89244h f92340b = C89250i.m154773a((AbstractC89171a) C39137c.f92343a);

    static {
        Covode.recordClassIndex(46752);
    }

    /* renamed from: a */
    public final Map<C39139k<DATA>, AbstractC1214u<C39138j<DATA>>> mo67890a() {
        return (Map) this.f92340b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.i$c */
    static final class C39137c extends AbstractC89220m implements AbstractC89171a<Map<C39139k<DATA>, AbstractC1214u<C39138j<DATA>>>> {

        /* renamed from: a */
        public static final C39137c f92343a = new C39137c();

        static {
            Covode.recordClassIndex(46755);
        }

        C39137c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Object invoke() {
            return new LinkedHashMap();
        }
    }

    /* renamed from: b */
    public final void mo67891b() {
        for (AbstractC1214u<C39138j<DATA>> uVar : mo67890a().values()) {
            this.f92339a.removeObserver(uVar);
        }
        mo67890a().clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.i$a */
    public static final class C39135a extends C33943c<C39138j<DATA>> {

        /* renamed from: b */
        final /* synthetic */ C39134i f92341b;

        static {
            Covode.recordClassIndex(46753);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39135a(C39134i iVar) {
            this.f92341b = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c, androidx.lifecycle.LiveData
        public final void removeObserver(AbstractC1214u<? super C39138j<DATA>> uVar) {
            C89219l.m154721d(uVar, "");
            Iterator<Map.Entry<C39139k<DATA>, AbstractC1214u<C39138j<DATA>>>> it = this.f92341b.mo67890a().entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == uVar) {
                    it.remove();
                }
            }
            super.removeObserver(uVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.i$b */
    static final class C39136b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39139k f92342a;

        static {
            Covode.recordClassIndex(46754);
        }

        C39136b(C39139k kVar) {
            this.f92342a = kVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C39138j jVar = (C39138j) obj;
            if (jVar.f92344a != null) {
                this.f92342a.f92347b.invoke(jVar.f92344a);
                return;
            }
            AbstractC89172b<Throwable, C89391z> bVar = this.f92342a.f92348c;
            if (bVar != null) {
                bVar.invoke(jVar.f92345b);
            }
        }
    }
}
