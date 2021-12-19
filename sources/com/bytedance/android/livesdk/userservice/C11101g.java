package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.livesdk.event.C8461n;
import com.bytedance.android.livesdkapi.depend.p684f.AbstractC11671b;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.userservice.g */
final /* synthetic */ class C11101g implements AbstractC11671b {

    /* renamed from: a */
    private final C11092c f26699a;

    /* renamed from: b */
    private final IHostUser f26700b;

    static {
        Covode.recordClassIndex(12724);
    }

    C11101g(C11092c cVar, IHostUser iHostUser) {
        this.f26699a = cVar;
        this.f26700b = iHostUser;
    }

    @Override // com.bytedance.android.livesdkapi.depend.p684f.AbstractC11671b
    /* renamed from: a */
    public final void mo17913a(boolean z) {
        C11092c cVar = this.f26699a;
        IHostUser iHostUser = this.f26700b;
        if (z) {
            cVar.mo17908b(iHostUser.getCurUser());
            cVar.mo13169i().mo116431a_(new AbstractC88406ae<AbstractC2994b>() {
                /* class com.bytedance.android.livesdk.userservice.C11092c.C110952 */

                static {
                    Covode.recordClassIndex(12718);
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onError(Throwable th) {
                }

                @Override // p4560f.p4561a.AbstractC88406ae
                public final void onSubscribe(AbstractC88412b bVar) {
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4560f.p4561a.AbstractC88406ae
                public final /* synthetic */ void onSuccess(AbstractC2994b bVar) {
                    C11092c.this.mo17908b(bVar);
                }
            });
            return;
        }
        cVar.mo17908b(new C11091b());
        cVar.f26672c.onNext(new C8461n(AbstractC2994b.EnumC2995a.Logout, cVar.f26670a));
    }
}
