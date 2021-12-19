package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a */
public final class C18017a implements AbstractC81914b {

    /* renamed from: a */
    public final int f42891a;

    /* renamed from: b */
    public final Aweme f42892b;

    static {
        Covode.recordClassIndex(20643);
    }

    /* renamed from: a */
    public static String m33568a(int i) {
        return "S-".concat(String.valueOf(i));
    }

    public C18017a(int i, Aweme aweme) {
        this.f42891a = i;
        this.f42892b = aweme;
    }

    /* renamed from: a */
    public static void m33569a(int i, Aweme aweme) {
        AbstractC81915c.m141874a(new C18017a(i, aweme));
        m33568a(i);
        aweme.getDesc();
    }
}
