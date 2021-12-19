package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p218f.C3888a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p456as.C6876j;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC18334e;
import com.bytedance.ies.web.jsbridge2.C18338g;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aj */
public final class C7088aj extends AbstractC18334e<Object, Object> {

    /* renamed from: a */
    public AbstractC88412b f17700a;

    static {
        Covode.recordClassIndex(7834);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void onTerminate() {
        AbstractC88412b bVar = this.f17700a;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18334e
    public final void invoke(Object obj, C18338g gVar) {
        if (C3888a.m9505a(gVar.f43859a) == null) {
            finishWithFailure();
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        Context context = gVar.f43859a;
        C6876j.C6877a a = C6876j.m14732a();
        a.f17232a = C3966y.m9657a((int) R.string.gsw);
        b.mo13149a(context, a.mo13173a()).mo143062b(new AbstractC88986z<AbstractC2994b>() {
            /* class com.bytedance.android.livesdk.browser.jsbridge.newmethods.C7088aj.C70891 */

            static {
                Covode.recordClassIndex(7835);
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onComplete() {
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onError(Throwable th) {
                C7088aj.this.finishWithFailure(th);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.AbstractC88986z
            public final /* synthetic */ void onNext(AbstractC2994b bVar) {
                C7088aj.this.finishWithSuccess();
            }

            @Override // p4560f.p4561a.AbstractC88986z
            public final void onSubscribe(AbstractC88412b bVar) {
                C7088aj.this.f17700a = bVar;
            }
        });
    }
}
