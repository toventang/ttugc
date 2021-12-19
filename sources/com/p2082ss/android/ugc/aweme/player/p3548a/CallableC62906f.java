package com.p2082ss.android.ugc.aweme.player.p3548a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.player.a.f */
public final /* synthetic */ class CallableC62906f implements Callable {

    /* renamed from: a */
    private final C62904e f142786a;

    /* renamed from: b */
    private final boolean f142787b;

    /* renamed from: c */
    private final int f142788c;

    /* renamed from: d */
    private final int f142789d;

    /* renamed from: e */
    private final VideoUrlModel f142790e;

    /* renamed from: f */
    private final boolean f142791f;

    /* renamed from: g */
    private final String f142792g;

    /* renamed from: h */
    private final int f142793h;

    /* renamed from: i */
    private final String f142794i;

    /* renamed from: j */
    private final String f142795j;

    /* renamed from: k */
    private final Aweme f142796k;

    /* renamed from: l */
    private final long f142797l;

    /* renamed from: m */
    private final long f142798m;

    static {
        Covode.recordClassIndex(73741);
    }

    CallableC62906f(C62904e eVar, boolean z, int i, int i2, VideoUrlModel videoUrlModel, boolean z2, String str, int i3, String str2, String str3, Aweme aweme, long j, long j2) {
        this.f142786a = eVar;
        this.f142787b = z;
        this.f142788c = i;
        this.f142789d = i2;
        this.f142790e = videoUrlModel;
        this.f142791f = z2;
        this.f142792g = str;
        this.f142793h = i3;
        this.f142794i = str2;
        this.f142795j = str3;
        this.f142796k = aweme;
        this.f142797l = j;
        this.f142798m = j2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f142786a.mo100910a(this.f142787b, this.f142788c, this.f142789d, this.f142790e, this.f142791f, this.f142792g, this.f142793h, this.f142794i, this.f142795j, this.f142796k, this.f142797l, this.f142798m);
    }
}
