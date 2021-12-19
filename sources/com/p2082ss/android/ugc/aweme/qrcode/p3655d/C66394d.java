package com.p2082ss.android.ugc.aweme.qrcode.p3655d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.qrcode.api.RiskApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.d */
public final class C66394d extends AbstractC35320a<C66393c> {
    static {
        Covode.recordClassIndex(77926);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a
    public final /* bridge */ /* synthetic */ void handleData(C66393c cVar) {
        super.handleData(cVar);
        this.mData = cVar;
    }

    /* renamed from: a */
    public final void mo105314a(final String str) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66394d.CallableC663951 */

            static {
                Covode.recordClassIndex(77927);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RiskApi.m118059a(str);
            }
        }, 0);
    }
}
