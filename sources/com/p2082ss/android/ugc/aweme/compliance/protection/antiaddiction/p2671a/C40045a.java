package com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.p2671a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.compliance.protection.antiaddiction.C40046b;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.antiaddiction.a.a */
public final class C40045a {

    /* renamed from: a */
    public int f94069a;

    /* renamed from: b */
    public int f94070b;

    /* renamed from: c */
    public int f94071c;

    /* renamed from: d */
    private final String f94072d;

    static {
        Covode.recordClassIndex(47813);
    }

    public C40045a() {
        this("05:00");
    }

    /* renamed from: a */
    public static long m81003a() {
        C40046b.m81004a().mo69207b();
        return C40046b.m81004a().mo69207b();
    }

    private C40045a(String str) {
        this.f94072d = str;
        try {
            String[] split = str.split(":");
            this.f94069a = Integer.parseInt(split[0]);
            this.f94070b = Integer.parseInt(split[1]);
        } catch (Exception unused) {
            this.f94069a = 5;
            this.f94070b = 0;
        }
        this.f94071c = 0;
    }
}
