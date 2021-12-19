package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.f.d */
public final /* synthetic */ class View$OnClickListenerC63774d implements View.OnClickListener {

    /* renamed from: a */
    private final C63757a f144556a;

    /* renamed from: b */
    private final View f144557b;

    static {
        Covode.recordClassIndex(75102);
    }

    View$OnClickListenerC63774d(C63757a aVar, View view) {
        this.f144556a = aVar;
        this.f144557b = view;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f144556a.mo102319b(this.f144557b);
    }
}
