package com.p2082ss.android.ugc.aweme.feed.p2952k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.k.b */
public final /* synthetic */ class CallableC49718b implements Callable {

    /* renamed from: a */
    private final JSONObject f114418a;

    /* renamed from: b */
    private final Aweme f114419b;

    /* renamed from: c */
    private final String f114420c;

    /* renamed from: d */
    private final String f114421d;

    /* renamed from: e */
    private final String f114422e;

    /* renamed from: f */
    private final String f114423f;

    /* renamed from: g */
    private final String f114424g;

    static {
        Covode.recordClassIndex(58567);
    }

    CallableC49718b(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, String str4, String str5) {
        this.f114418a = jSONObject;
        this.f114419b = aweme;
        this.f114420c = str;
        this.f114421d = str2;
        this.f114422e = str3;
        this.f114423f = str4;
        this.f114424g = str5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C49717a.m93131a(this.f114418a, this.f114419b, this.f114420c, this.f114421d, this.f114422e, this.f114423f, this.f114424g);
    }
}
