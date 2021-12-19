package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.x.p */
public final /* synthetic */ class CallableC50548p implements Callable {

    /* renamed from: a */
    private final JSONObject f116815a;

    /* renamed from: b */
    private final Aweme f116816b;

    /* renamed from: c */
    private final String f116817c;

    /* renamed from: d */
    private final Context f116818d;

    /* renamed from: e */
    private final String f116819e;

    /* renamed from: f */
    private final String f116820f;

    /* renamed from: g */
    private final C49812b f116821g;

    static {
        Covode.recordClassIndex(59695);
    }

    CallableC50548p(JSONObject jSONObject, Aweme aweme, String str, Context context, String str2, String str3, C49812b bVar) {
        this.f116815a = jSONObject;
        this.f116816b = aweme;
        this.f116817c = str;
        this.f116818d = context;
        this.f116819e = str2;
        this.f116820f = str3;
        this.f116821g = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return C50546n.m94772a(this.f116815a, this.f116816b, this.f116817c, this.f116819e, this.f116820f, this.f116821g);
    }
}
