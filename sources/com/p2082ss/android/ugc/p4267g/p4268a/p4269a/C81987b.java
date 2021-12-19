package com.p2082ss.android.ugc.p4267g.p4268a.p4269a;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.g.a.a.b */
public final class C81987b {
    @AbstractC27891c(mo46611a = "start_timeout")

    /* renamed from: a */
    public int f183469a = 5000;
    @AbstractC27891c(mo46611a = "dns_timeout")

    /* renamed from: b */
    public int f183470b = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    @AbstractC27891c(mo46611a = "ping_timeout")

    /* renamed from: c */
    public int f183471c = 3000;
    @AbstractC27891c(mo46611a = "tcp_timeout")

    /* renamed from: d */
    public int f183472d = 4000;
    @AbstractC27891c(mo46611a = "black_timeout")

    /* renamed from: e */
    public int f183473e = 300000;
    @AbstractC27891c(mo46611a = "frequency_limit")

    /* renamed from: f */
    public int f183474f = 4;
    @AbstractC27891c(mo46611a = "target_list")

    /* renamed from: g */
    public String[] f183475g = {"8.8.8.8:443", "35.244.141.111:443", "graph.facebook.com:443"};

    static {
        Covode.recordClassIndex(95802);
    }

    public C81987b() {
    }

    public C81987b(String[] strArr) {
        C89219l.m154719c(strArr, "");
        this.f183475g = strArr;
    }
}
