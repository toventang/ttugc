package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.b.c */
public final class C55335c implements AbstractC55336d {

    /* renamed from: a */
    static final AbstractC55336d f126549a = new C55335c();

    static {
        Covode.recordClassIndex(65100);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.AbstractC55336d
    /* renamed from: a */
    public final void mo92403a(C55329b bVar) {
        bVar.f126521g.setVisibility(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget.p3197b.AbstractC55336d
    /* renamed from: a */
    public final void mo92402a(ViewGroup viewGroup, C55329b bVar) {
        MethodCollector.m26663i(2936);
        View view = bVar.f126521g;
        view.setVisibility(8);
        viewGroup.removeView(view);
        MethodCollector.m26664o(2936);
    }
}
