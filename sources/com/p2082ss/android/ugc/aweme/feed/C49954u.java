package com.p2082ss.android.ugc.aweme.feed;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.cache.AbstractC49331j;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.feed.u */
final /* synthetic */ class C49954u implements AbstractC89171a {

    /* renamed from: a */
    private final int f115146a;

    /* renamed from: b */
    private final long f115147b;

    /* renamed from: c */
    private final long f115148c;

    /* renamed from: d */
    private final int f115149d;

    /* renamed from: e */
    private final Integer f115150e;

    /* renamed from: f */
    private final String f115151f;

    /* renamed from: g */
    private final int f115152g;

    /* renamed from: h */
    private final int f115153h;

    /* renamed from: i */
    private final String f115154i;

    /* renamed from: j */
    private final String f115155j;

    /* renamed from: k */
    private final String f115156k;

    /* renamed from: l */
    private final long f115157l;

    /* renamed from: m */
    private final AbstractC49331j f115158m;

    /* renamed from: n */
    private final Bundle f115159n;

    /* renamed from: o */
    private final Boolean f115160o;

    static {
        Covode.recordClassIndex(59066);
    }

    C49954u(int i, long j, long j2, int i2, Integer num, String str, int i3, int i4, String str2, String str3, String str4, long j3, AbstractC49331j jVar, Bundle bundle, Boolean bool) {
        this.f115146a = i;
        this.f115147b = j;
        this.f115148c = j2;
        this.f115149d = i2;
        this.f115150e = num;
        this.f115151f = str;
        this.f115152g = i3;
        this.f115153h = i4;
        this.f115154i = str2;
        this.f115155j = str3;
        this.f115156k = str4;
        this.f115157l = j3;
        this.f115158m = jVar;
        this.f115159n = bundle;
        this.f115160o = bool;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        return FeedApiService.m91023a(this.f115146a, this.f115147b, this.f115148c, this.f115149d, this.f115150e, this.f115151f, this.f115152g, this.f115153h, this.f115154i, this.f115155j, this.f115156k, this.f115158m, this.f115160o);
    }
}
