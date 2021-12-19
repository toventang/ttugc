package com.p2082ss.android.ugc.aweme.following.p3002a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.following.a.c */
public final class C51104c extends BaseResponse {
    @AbstractC27891c(mo46611a = "followings")

    /* renamed from: a */
    public List<User> f117918a = new ArrayList();
    @AbstractC27891c(mo46611a = "max_time")

    /* renamed from: b */
    public long f117919b;
    @AbstractC27891c(mo46611a = "has_more")

    /* renamed from: c */
    public boolean f117920c;
    @AbstractC27891c(mo46611a = "total")

    /* renamed from: d */
    public int f117921d;
    @AbstractC27891c(mo46611a = "min_time")

    /* renamed from: e */
    public long f117922e;
    @AbstractC27891c(mo46611a = "offset")

    /* renamed from: f */
    public int f117923f;
    @AbstractC27891c(mo46611a = "rec_has_more")

    /* renamed from: g */
    public boolean f117924g = true;
    @AbstractC27891c(mo46611a = "vcd_count")

    /* renamed from: h */
    public int f117925h;
    @AbstractC27891c(mo46611a = "hotsoon_text")

    /* renamed from: i */
    public String f117926i;
    @AbstractC27891c(mo46611a = "hotsoon_has_more")

    /* renamed from: j */
    public int f117927j;

    static {
        Covode.recordClassIndex(60301);
    }

    /* renamed from: a */
    public final boolean mo86513a() {
        if (this.f117927j == 1) {
            return true;
        }
        return false;
    }
}
