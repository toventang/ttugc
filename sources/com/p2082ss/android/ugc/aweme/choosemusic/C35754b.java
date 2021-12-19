package com.p2082ss.android.ugc.aweme.choosemusic;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.b */
public final class C35754b {

    /* renamed from: a */
    public String f84347a;

    /* renamed from: b */
    public String f84348b;

    /* renamed from: c */
    public String f84349c;

    /* renamed from: d */
    public String f84350d;

    /* renamed from: e */
    public String f84351e;

    /* renamed from: f */
    public String f84352f;

    /* renamed from: g */
    public String f84353g;

    /* renamed from: h */
    public boolean f84354h;

    /* renamed from: i */
    public LogPbBean f84355i;

    /* renamed from: j */
    public String f84356j;

    static {
        Covode.recordClassIndex(42992);
    }

    /* renamed from: a */
    public final void mo62804a(String str) {
        this.f84351e = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            this.f84348b = "recommend";
        }
    }

    public C35754b(String str, String str2, String str3, String str4) {
        this.f84347a = str;
        this.f84348b = str2;
        this.f84349c = str3;
        this.f84350d = str4;
    }
}
