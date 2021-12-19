package com.p2082ss.android.ugc.aweme.infoSticker;

import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;

/* renamed from: com.ss.android.ugc.aweme.infoSticker.b */
public final class C56660b {

    /* renamed from: a */
    private ActivityC0945e f129133a;

    /* renamed from: b */
    private String f129134b;

    static {
        Covode.recordClassIndex(66508);
    }

    /* renamed from: a */
    public final void mo93542a(AbstractC56659a aVar) {
        String str = this.f129134b;
        C1213t tVar = new C1213t();
        C63244g.m114602a().mo73296x().mo93808a(str, new C56718d(tVar));
        tVar.observe(this.f129133a, new C56661c(aVar));
    }

    public C56660b(ActivityC0945e eVar, String str) {
        this.f129133a = eVar;
        this.f129134b = str;
    }
}
