package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.k */
public final class C40544k {

    /* renamed from: a */
    Activity f94867a;

    /* renamed from: b */
    AbstractC40547m f94868b;

    /* renamed from: c */
    String f94869c = "first jump: in allowlist\nsecond jump：no limit";

    /* renamed from: d */
    private C40535c f94870d;

    static {
        Covode.recordClassIndex(48365);
    }

    /* renamed from: a */
    public final void mo69668a() {
        C40535c cVar;
        if (!C13603b.m24435a((Collection) C40538e.f94857a) && (cVar = this.f94870d) != null) {
            cVar.mo69664a(C40538e.f94857a);
        }
    }

    C40544k(Activity activity, AbstractC40547m mVar) {
        this.f94867a = activity;
        this.f94868b = mVar;
    }
}
