package com.p2082ss.android.ugc.aweme.feed;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.api.AwemeStatsApi;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.d */
public final /* synthetic */ class C49417d implements AbstractC88983w {

    /* renamed from: a */
    private final int f113574a;

    /* renamed from: b */
    private final String f113575b;

    /* renamed from: c */
    private final int f113576c;

    static {
        Covode.recordClassIndex(58230);
    }

    C49417d(int i, String str, int i2) {
        this.f113574a = i;
        this.f113575b = str;
        this.f113576c = i2;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        int i = this.f113574a;
        String str = this.f113575b;
        int i2 = this.f113576c;
        if (i != 14000) {
            try {
                C51423a.m95786a((Exception) new IllegalArgumentException("wrong pageType argument"));
            } catch (Exception unused) {
            } finally {
                vVar.mo143023a();
            }
        } else {
            AwemeStatsApi.f111976a.awemeFastStatsReport(str, 21, i2, "").get();
            vVar.mo143023a();
        }
    }
}
