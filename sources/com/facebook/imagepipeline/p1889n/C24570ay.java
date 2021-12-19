package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;

/* renamed from: com.facebook.imagepipeline.n.ay */
public final class C24570ay<T> implements AbstractC24544ak<T> {

    /* renamed from: a */
    public final AbstractC24544ak<T> f58378a;

    /* renamed from: b */
    public final C24573az f58379b;

    static {
        Covode.recordClassIndex(28714);
    }

    public C24570ay(AbstractC24544ak<T> akVar, C24573az azVar) {
        this.f58378a = (AbstractC24544ak) C24091i.m45617a(akVar);
        this.f58379b = azVar;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24544ak
    /* renamed from: a */
    public final void mo40379a(final AbstractC24596k<T> kVar, final AbstractC24545al alVar) {
        final AbstractC24547an c = alVar.mo40416c();
        final String b = alVar.mo40415b();
        final C245711 r1 = new AbstractC24562av<T>("BackgroundThreadHandoffProducer", c, b, kVar) {
            /* class com.facebook.imagepipeline.p1889n.C24570ay.C245711 */

            static {
                Covode.recordClassIndex(28715);
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: b */
            public final void mo39640b(T t) {
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h
            /* renamed from: c */
            public final T mo39641c() {
                return null;
            }

            @Override // com.facebook.common.p1830b.AbstractRunnableC24073h, com.facebook.imagepipeline.p1889n.AbstractC24562av
            /* renamed from: a */
            public final void mo39638a(T t) {
                c.onProducerFinishWithSuccess(b, "BackgroundThreadHandoffProducer", null);
                C24570ay.this.f58378a.mo40379a(kVar, alVar);
            }
        };
        alVar.mo40414a(new C24587e() {
            /* class com.facebook.imagepipeline.p1889n.C24570ay.C245722 */

            static {
                Covode.recordClassIndex(28716);
            }

            @Override // com.facebook.imagepipeline.p1889n.AbstractC24546am, com.facebook.imagepipeline.p1889n.C24587e
            /* renamed from: a */
            public final void mo34237a() {
                r1.mo39636a();
                C24570ay.this.f58379b.mo40430b(r1);
            }
        });
        this.f58379b.mo40428a(r1);
    }
}
