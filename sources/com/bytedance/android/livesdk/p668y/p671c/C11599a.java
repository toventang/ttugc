package com.bytedance.android.livesdk.p668y.p671c;

import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdk.p668y.p670b.C11596a;
import com.bytedance.android.livesdk.p668y.p670b.C11597b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.bytedance.android.livesdk.y.c.a */
public final class C11599a {

    /* renamed from: a */
    public boolean f27752a;

    /* renamed from: b */
    public long f27753b;

    /* renamed from: c */
    public long f27754c;

    /* renamed from: d */
    public AbstractC88412b f27755d;

    static {
        Covode.recordClassIndex(13265);
    }

    /* renamed from: com.bytedance.android.livesdk.y.c.a$a */
    public static class C11601a {

        /* renamed from: a */
        public static final C11599a f27757a = new C11599a();

        static {
            Covode.recordClassIndex(13267);
        }
    }

    /* renamed from: b */
    public final void mo18398b() {
        this.f27752a = false;
        AbstractC88412b bVar = this.f27755d;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    /* renamed from: a */
    public final void mo18397a() {
        mo18398b();
        if (this.f27753b >= 0) {
            AbstractC88979t.m154282a(0, 1, TimeUnit.SECONDS).mo143276b((this.f27753b / 1000) + 1).mo143292d(new C11602b(this)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new AbstractC88986z<Long>() {
                /* class com.bytedance.android.livesdk.p668y.p671c.C11599a.C116001 */

                static {
                    Covode.recordClassIndex(13266);
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onComplete() {
                    C6779a.m14563a().mo13053a(new C11597b());
                    C11599a.this.mo18398b();
                }

                @Override // p4560f.p4561a.AbstractC88986z
                public final void onSubscribe(AbstractC88412b bVar) {
                    C11599a.this.f27755d = bVar;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88986z
                public final /* synthetic */ void onNext(Long l) {
                    Long l2 = l;
                    if (l2.longValue() > 0) {
                        C11599a.this.f27754c = l2.longValue();
                        C6779a.m14563a().mo13053a(new C11596a(l2.longValue()));
                    }
                }
            });
        }
    }
}
