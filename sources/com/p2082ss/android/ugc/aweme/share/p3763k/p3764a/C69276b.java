package com.p2082ss.android.ugc.aweme.share.p3763k.p3764a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.setting.api.RestrictApi;
import com.p2082ss.android.ugc.aweme.setting.model.C68176f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.k.a.b */
public final class C69276b extends AbstractC35320a<C68176f> {
    static {
        Covode.recordClassIndex(81606);
    }

    /* renamed from: a */
    public final void mo109586a(final String str) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.share.p3763k.p3764a.C69276b.CallableC692771 */

            static {
                Covode.recordClassIndex(81607);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RestrictApi.m120307c(str);
            }
        }, 0);
    }
}
