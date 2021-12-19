package com.p2082ss.android.ugc.aweme.comment;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.c */
public final /* synthetic */ class View$OnClickListenerC36384c implements View.OnClickListener {

    /* renamed from: a */
    private final C36274b f86054a;

    /* renamed from: b */
    private final String f86055b;

    /* renamed from: c */
    private final String f86056c;

    static {
        Covode.recordClassIndex(43679);
    }

    View$OnClickListenerC36384c(C36274b bVar, String str, String str2) {
        this.f86054a = bVar;
        this.f86055b = str;
        this.f86056c = str2;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f86054a.mo63469a(view, this.f86055b, this.f86056c);
    }
}
