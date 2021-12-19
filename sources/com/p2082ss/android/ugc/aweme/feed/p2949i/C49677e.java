package com.p2082ss.android.ugc.aweme.feed.p2949i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;

/* renamed from: com.ss.android.ugc.aweme.feed.i.e */
public final class C49677e implements AbstractC81914b {

    /* renamed from: d */
    public static String f114336d = "FUNCTION_FROM_DEFAULT";

    /* renamed from: e */
    public static String f114337e = "FUNCTION_FROM_NOT_INTERESTED";

    /* renamed from: a */
    public final Aweme f114338a;

    /* renamed from: b */
    public final String f114339b;

    /* renamed from: c */
    public final String f114340c;

    static {
        Covode.recordClassIndex(58524);
    }

    public C49677e(Aweme aweme) {
        this(aweme, "homepage_hot", f114336d);
    }

    public C49677e(Aweme aweme, String str) {
        this(aweme, str, f114336d);
    }

    public C49677e(Aweme aweme, String str, String str2) {
        this.f114338a = aweme;
        this.f114339b = str;
        this.f114340c = str2;
    }
}
