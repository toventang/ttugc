package com.bytedance.ies.ugc.aweme.commercialize.splash.topview;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.topview.i */
final /* synthetic */ class CallableC18029i implements Callable {

    /* renamed from: a */
    private final C18027h f42910a;

    /* renamed from: b */
    private final List f42911b;

    /* renamed from: c */
    private final Context f42912c;

    static {
        Covode.recordClassIndex(20655);
    }

    CallableC18029i(C18027h hVar, List list, Context context) {
        this.f42910a = hVar;
        this.f42911b = list;
        this.f42912c = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f42910a.mo28761a(this.f42911b);
    }
}
