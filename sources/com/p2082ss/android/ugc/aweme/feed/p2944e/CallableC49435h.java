package com.p2082ss.android.ugc.aweme.feed.p2944e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.e.h */
final /* synthetic */ class CallableC49435h implements Callable {

    /* renamed from: a */
    private final C49433f f113613a;

    /* renamed from: b */
    private final Aweme f113614b;

    /* renamed from: c */
    private final String f113615c;

    /* renamed from: d */
    private final Context f113616d;

    /* renamed from: e */
    private final String f113617e;

    /* renamed from: f */
    private final int f113618f;

    /* renamed from: g */
    private final AbstractC49849am f113619g;

    /* renamed from: h */
    private final JSONObject f113620h;

    /* renamed from: i */
    private final String f113621i;

    static {
        Covode.recordClassIndex(58248);
    }

    CallableC49435h(C49433f fVar, Aweme aweme, String str, Context context, String str2, int i, AbstractC49849am amVar, JSONObject jSONObject, String str3) {
        this.f113613a = fVar;
        this.f113614b = aweme;
        this.f113615c = str;
        this.f113616d = context;
        this.f113617e = str2;
        this.f113618f = i;
        this.f113619g = amVar;
        this.f113620h = jSONObject;
        this.f113621i = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113613a.mo81066a(this.f113614b, this.f113615c, this.f113616d, this.f113617e, this.f113618f, this.f113619g, this.f113620h, this.f113621i);
    }
}
