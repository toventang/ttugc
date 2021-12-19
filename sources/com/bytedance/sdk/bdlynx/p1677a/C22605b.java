package com.bytedance.sdk.bdlynx.p1677a;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.a.b */
public final class C22605b {

    /* renamed from: a */
    public C22607a f53409a = new C22607a();

    /* renamed from: b */
    public Activity f53410b;

    /* renamed from: c */
    public final Context f53411c;

    /* renamed from: d */
    private final ConcurrentHashMap<String, Object> f53412d;

    /* renamed from: e */
    private final ConcurrentHashMap<String, Object> f53413e;

    static {
        Covode.recordClassIndex(26421);
    }

    public C22605b(Context context) {
        C89219l.m154719c(context, "");
        this.f53411c = context;
        this.f53410b = (Activity) (!(context instanceof Activity) ? null : context);
        this.f53412d = new ConcurrentHashMap<>();
        this.f53413e = new ConcurrentHashMap<>();
    }
}
