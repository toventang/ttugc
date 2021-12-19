package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24083b;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.aa */
public abstract class AbstractC24514aa implements AbstractC24544ak<C24456e> {

    /* renamed from: a */
    private final Executor f58223a;

    /* renamed from: b */
    private final AbstractC24113i f58224b;

    static {
        Covode.recordClassIndex(28658);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C24456e mo40380a(C24636b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo40382a();

    protected AbstractC24514aa(Executor executor, AbstractC24113i iVar) {
        this.f58223a = executor;
        this.f58224b = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C24456e mo40383b(InputStream inputStream, int i) {
        return mo40381a(inputStream, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C24456e mo40381a(InputStream inputStream, int i) {
        C24117a aVar;
        if (i <= 0) {
            try {
                aVar = C24117a.m45706a(this.f58224b.mo39678a(inputStream));
            } catch (Throwable th) {
                C24083b.m45600a(inputStream);
                C24117a.m45712c(null);
                throw th;
            }
        } else {
            aVar = C24117a.m45706a(this.f58224b.mo39679a(inputStream, i));
        }
        C24456e eVar = new C24456e(aVar);
        C24083b.m45600a(inputStream);
        C24117a.m45712c(aVar);
        return eVar;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(AbstractC24596k<C24456e> kVar, AbstractC24545al alVar) {
        final AbstractC24547an c = alVar.mo40416c();
        final String b = alVar.mo40415b();
        final C24636b a = alVar.mo40413a();
        final C245151 r1 = new AbstractC24562av<C24456e>(kVar, mo40382a(), c, b) {
            /* class com.facebook.imagepipeline.p1889n.AbstractC24514aa.C245151 */

            static {
                Covode.recordClassIndex(28659);
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
            /* renamed from: c */
            public final /* synthetic */ Object mo39641c() {
                C24456e a = AbstractC24514aa.this.mo40380a(a);
                if (a == null) {
                    c.onUltimateProducerReached(b, AbstractC24514aa.this.mo40382a(), false);
                    return null;
                }
                a.mo40311j();
                c.onUltimateProducerReached(b, AbstractC24514aa.this.mo40382a(), true);
                return a;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: b */
            public final /* synthetic */ void mo39640b(C24456e eVar) {
                C24456e.m46681d(eVar);
            }
        };
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.AbstractC24514aa.C245162 */

            static {
                Covode.recordClassIndex(28660);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                r1.mo39636a();
            }
        });
        this.f58223a.execute(r1);
    }
}
