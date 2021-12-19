package com.p2082ss.android.ugc.aweme.kids.choosemusic;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a */
public final class C57171a {

    /* renamed from: a */
    public String f130159a;

    /* renamed from: b */
    public String f130160b;

    /* renamed from: c */
    public String f130161c;

    /* renamed from: d */
    public String f130162d;

    /* renamed from: e */
    public String f130163e;

    /* renamed from: f */
    public String f130164f;

    /* renamed from: g */
    public String f130165g;

    /* renamed from: h */
    public boolean f130166h;

    /* renamed from: i */
    public LogPbBean f130167i;

    static {
        Covode.recordClassIndex(67072);
    }

    /* renamed from: a */
    public final void mo94370a(String str) {
        this.f130163e = str;
        if (TextUtils.equals(str, "recommend_mc_id")) {
            this.f130160b = "recommend";
        }
    }

    public C57171a(String str, String str2, String str3, String str4) {
        this.f130159a = str;
        this.f130160b = str2;
        this.f130161c = str3;
        this.f130162d = str4;
    }
}
