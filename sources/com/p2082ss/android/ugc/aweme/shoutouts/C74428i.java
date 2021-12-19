package com.p2082ss.android.ugc.aweme.shoutouts;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.i */
public final class C74428i {
    @AbstractC27891c(mo46611a = "order_video_review_time")

    /* renamed from: a */
    public String f167375a;
    @AbstractC27891c(mo46611a = "set_price_url")

    /* renamed from: b */
    String f167376b;
    @AbstractC27891c(mo46611a = "wallet_url")

    /* renamed from: c */
    String f167377c;
    @AbstractC27891c(mo46611a = "request_order_limit")

    /* renamed from: d */
    public int f167378d;
    @AbstractC27891c(mo46611a = "intro_video_review_time")

    /* renamed from: e */
    private String f167379e;

    static {
        Covode.recordClassIndex(87206);
    }

    /* renamed from: a */
    public final String mo117056a() {
        if (TextUtils.isEmpty(this.f167379e)) {
            return "24";
        }
        String str = this.f167379e;
        if (str == null) {
            C89219l.m154715b();
        }
        return str;
    }
}
