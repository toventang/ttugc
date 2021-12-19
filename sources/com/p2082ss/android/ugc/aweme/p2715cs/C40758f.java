package com.p2082ss.android.ugc.aweme.p2715cs;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p2715cs.C40750c;

/* renamed from: com.ss.android.ugc.aweme.cs.f */
public final class C40758f {

    /* renamed from: a */
    public final int f95411a;

    /* renamed from: b */
    public final Aweme f95412b;

    /* renamed from: c */
    String f95413c;

    /* renamed from: d */
    public final C40750c.EnumC40751a f95414d;

    /* renamed from: e */
    public volatile int f95415e;

    static {
        Covode.recordClassIndex(48610);
    }

    /* renamed from: a */
    public final void mo69991a() {
        int i = this.f95415e;
        if (i == 0 || i == 1) {
            mo69992a(2);
        } else if (i == 3) {
            mo69992a(6);
        } else if (i == 4) {
            mo69992a(5);
        }
    }

    /* renamed from: a */
    public final void mo69992a(int i) {
        if (i > this.f95415e && this.f95415e != 2 && this.f95415e != 5 && this.f95415e != 6) {
            this.f95415e = i;
        }
    }

    public C40758f(Aweme aweme, int i, String str, C40750c.EnumC40751a aVar) {
        this.f95412b = aweme;
        this.f95411a = i;
        this.f95414d = aVar;
        this.f95413c = str;
    }
}
