package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.f.r */
public final /* synthetic */ class View$OnClickListenerC63795r implements View.OnClickListener {

    /* renamed from: a */
    private final C63787p f144612a;

    /* renamed from: b */
    private final Activity f144613b;

    /* renamed from: c */
    private final int f144614c = 0;

    static {
        Covode.recordClassIndex(75123);
    }

    View$OnClickListenerC63795r(C63787p pVar, Activity activity, int i) {
        this.f144612a = pVar;
        this.f144613b = activity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f144612a.mo102349a(this.f144613b, this.f144614c);
    }
}
