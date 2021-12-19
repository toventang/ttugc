package com.p2082ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.search.p3691g.C67437b;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.model.aj */
public final class C35890aj {

    /* renamed from: a */
    public String f84696a;

    /* renamed from: b */
    public int f84697b;

    /* renamed from: c */
    public String f84698c;

    /* renamed from: d */
    public boolean f84699d;

    /* renamed from: e */
    public int f84700e;

    /* renamed from: f */
    public boolean f84701f = true;

    /* renamed from: g */
    public C67437b f84702g;

    /* renamed from: h */
    public long f84703h;

    /* renamed from: i */
    public long f84704i;

    static {
        Covode.recordClassIndex(43130);
    }

    /* renamed from: b */
    public final long mo62983b() {
        long j = this.f84704i;
        if (j > 0) {
            return j;
        }
        return this.f84703h;
    }

    /* renamed from: c */
    public final boolean mo62984c() {
        if (this.f84704i > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo62982a() {
        int i = this.f84697b;
        if (i == 1) {
            return "normal_search";
        }
        if (i == 2) {
            return "search_history";
        }
        if (i != 3) {
            return "";
        }
        return "search_sug";
    }
}
