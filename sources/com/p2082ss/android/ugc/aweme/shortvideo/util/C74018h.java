package com.p2082ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.h */
public final /* synthetic */ class C74018h implements AbstractC89172b {

    /* renamed from: a */
    private final Activity f166134a;

    /* renamed from: b */
    private final Intent f166135b;

    static {
        Covode.recordClassIndex(86768);
    }

    C74018h(Activity activity, Intent intent) {
        this.f166134a = activity;
        this.f166135b = intent;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        return C74007f.m130163a(this.f166134a, this.f166135b, (List) obj);
    }
}
