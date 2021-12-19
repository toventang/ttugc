package com.p2082ss.android.ugc.aweme.translation.p4142a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.translation.api.TranslationApi;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.translation.a.b */
public final class C79028b extends AbstractC35320a<C79030c> {
    static {
        Covode.recordClassIndex(92199);
    }

    /* renamed from: a */
    public final void mo122856a(String str, String str2, String str3, String str4) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable(str, str2, str3, str4, 1) {
            /* class com.p2082ss.android.ugc.aweme.translation.p4142a.C79028b.CallableC790291 */

            /* renamed from: a */
            final /* synthetic */ String f177635a;

            /* renamed from: b */
            final /* synthetic */ String f177636b;

            /* renamed from: c */
            final /* synthetic */ String f177637c;

            /* renamed from: d */
            final /* synthetic */ String f177638d;

            /* renamed from: e */
            final /* synthetic */ int f177639e = 1;

            static {
                Covode.recordClassIndex(92200);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return TranslationApi.m137861a(this.f177635a, this.f177636b, this.f177637c, this.f177638d, this.f177639e);
            }

            {
                this.f177635a = r3;
                this.f177636b = r4;
                this.f177637c = r5;
                this.f177638d = r6;
            }
        }, 0);
    }
}
