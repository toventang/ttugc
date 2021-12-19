package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.detail.p2743b.AbstractC41111a;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.detail.ui.ai */
public final /* synthetic */ class C41357ai implements AbstractC41111a {

    /* renamed from: a */
    private final C41426z f96521a;

    static {
        Covode.recordClassIndex(49252);
    }

    C41357ai(C41426z zVar) {
        this.f96521a = zVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.p2743b.AbstractC41111a
    /* renamed from: a */
    public final void mo70368a(float f) {
        C41426z zVar = this.f96521a;
        if (zVar.f96631b != null) {
            zVar.f96631b.setAlpha(f);
            zVar.f96631b.setVisibility(f > 0.0f ? 0 : 8);
        }
    }
}
