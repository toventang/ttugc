package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.livesdk.p456as.C6861a;
import com.bytedance.android.livesdk.p456as.C6878k;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.android.livesdkapi.host.p695c.AbstractC11801b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.userservice.i */
final /* synthetic */ class C11103i implements AbstractC88983w {

    /* renamed from: a */
    private final C11092c f26702a;

    /* renamed from: b */
    private final C6878k f26703b;

    /* renamed from: c */
    private final C6861a f26704c;

    static {
        Covode.recordClassIndex(12726);
    }

    C11103i(C11092c cVar, C6878k kVar, C6861a aVar) {
        this.f26702a = cVar;
        this.f26703b = kVar;
        this.f26704c = aVar;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        C11092c cVar = this.f26702a;
        C6878k kVar = this.f26703b;
        cVar.f26671b.unFollowWithConfirm(kVar.f17240d, kVar.f17238b, kVar.f17204a, new AbstractC11801b(this.f26704c, kVar, vVar) {
            /* class com.bytedance.android.livesdk.userservice.C11092c.C110963 */

            /* renamed from: a */
            final /* synthetic */ C6861a f26685a;

            /* renamed from: b */
            final /* synthetic */ C6878k f26686b;

            /* renamed from: c */
            final /* synthetic */ AbstractC88982v f26687c;

            static {
                Covode.recordClassIndex(12719);
            }

            @Override // com.bytedance.android.livesdkapi.host.p695c.AbstractC11801b
            /* renamed from: a */
            public final void mo17910a() {
                C11092c.this.mo17907a(0, this.f26685a.f17204a, this.f26686b.f17241e).mo143062b(new AbstractC88986z<C11688a>() {
                    /* class com.bytedance.android.livesdk.userservice.C11092c.C110963.C110971 */

                    static {
                        Covode.recordClassIndex(12720);
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onSubscribe(AbstractC88412b bVar) {
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onComplete() {
                        C110963.this.f26687c.mo143023a();
                    }

                    @Override // p4560f.p4561a.AbstractC88986z
                    public final void onError(Throwable th) {
                        C110963.this.f26687c.mo143024a(th);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4560f.p4561a.AbstractC88986z
                    public final /* synthetic */ void onNext(C11688a aVar) {
                        C110963.this.f26687c.mo143031a(aVar);
                        C110963.this.f26687c.mo143023a();
                    }
                });
            }

            {
                this.f26685a = r2;
                this.f26686b = r3;
                this.f26687c = r4;
            }
        });
    }
}
