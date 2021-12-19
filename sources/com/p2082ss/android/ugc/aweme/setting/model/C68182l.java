package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.setting.api.RestrictApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.model.l */
public final class C68182l extends AbstractC35320a<C68181k> {
    static {
        Covode.recordClassIndex(80381);
    }

    /* renamed from: a */
    public final void mo108722a(final String str) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.setting.model.C68182l.CallableC681831 */

            static {
                Covode.recordClassIndex(80382);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return RestrictApi.m120305a(str);
            }
        }, 0);
    }
}
