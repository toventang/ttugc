package com.p2082ss.android.ugc.aweme.feed.p2979x;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.x.q */
public final /* synthetic */ class CallableC50549q implements Callable {

    /* renamed from: a */
    private final boolean f116822a;

    /* renamed from: b */
    private final String f116823b;

    /* renamed from: c */
    private final String f116824c;

    /* renamed from: d */
    private final String f116825d;

    /* renamed from: e */
    private final String f116826e;

    /* renamed from: f */
    private final C49812b f116827f;

    static {
        Covode.recordClassIndex(59696);
    }

    public CallableC50549q(boolean z, String str, String str2, String str3, String str4, C49812b bVar) {
        this.f116822a = z;
        this.f116823b = str;
        this.f116824c = str2;
        this.f116825d = str3;
        this.f116826e = str4;
        this.f116827f = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C50546n.m94773a(this.f116822a, this.f116823b, this.f116824c, this.f116825d, this.f116826e, this.f116827f);
    }
}
