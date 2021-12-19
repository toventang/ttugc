package com.p2082ss.android.ugc.aweme.flowfeed.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.utils.C80314ct;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.utils.b */
public final class C51053b {

    /* renamed from: a */
    public Aweme f117757a;

    /* renamed from: b */
    public int f117758b;

    /* renamed from: c */
    public C80314ct f117759c = new C80314ct();

    /* renamed from: d */
    public long f117760d = -1;

    /* renamed from: e */
    public boolean f117761e;

    /* renamed from: f */
    public AbstractC80747i f117762f;

    /* renamed from: g */
    public String f117763g;

    /* renamed from: h */
    public boolean f117764h = false;

    /* renamed from: i */
    private long f117765i = -1;

    static {
        Covode.recordClassIndex(60238);
    }

    public final int hashCode() {
        return this.f117763g.hashCode();
    }

    /* renamed from: a */
    public final void mo86389a() {
        if (this.f117760d == -1) {
            this.f117760d = System.currentTimeMillis();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51053b) || !TextUtils.equals(this.f117763g, ((C51053b) obj).f117763g)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m95442a(String str, String str2) {
        return str + "_" + str2;
    }

    public C51053b(Aweme aweme, C80314ct ctVar, String str) {
        this.f117757a = aweme;
        this.f117759c = ctVar;
        this.f117763g = str;
    }
}
