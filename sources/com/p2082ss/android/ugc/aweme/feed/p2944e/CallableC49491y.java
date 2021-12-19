package com.p2082ss.android.ugc.aweme.feed.p2944e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2963q.AbstractC49849am;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.e.y */
public final /* synthetic */ class CallableC49491y implements Callable {

    /* renamed from: a */
    private final C49445o f113830a;

    /* renamed from: b */
    private final int f113831b;

    /* renamed from: c */
    private final AbstractC48149ai f113832c;

    /* renamed from: d */
    private final int f113833d;

    /* renamed from: e */
    private final int f113834e;

    /* renamed from: f */
    private final String f113835f;

    /* renamed from: g */
    private final JSONObject f113836g = null;

    /* renamed from: h */
    private final Aweme f113837h;

    /* renamed from: i */
    private final AbstractC49849am f113838i;

    /* renamed from: j */
    private final String f113839j;

    static {
        Covode.recordClassIndex(58304);
    }

    CallableC49491y(C49445o oVar, int i, AbstractC48149ai aiVar, int i2, int i3, String str, Aweme aweme, AbstractC49849am amVar, String str2) {
        this.f113830a = oVar;
        this.f113831b = i;
        this.f113832c = aiVar;
        this.f113833d = i2;
        this.f113834e = i3;
        this.f113835f = str;
        this.f113837h = aweme;
        this.f113838i = amVar;
        this.f113839j = str2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f113830a.mo81177a(this.f113831b, this.f113833d, this.f113834e, this.f113835f, this.f113836g, this.f113837h, this.f113838i, this.f113839j);
    }
}
