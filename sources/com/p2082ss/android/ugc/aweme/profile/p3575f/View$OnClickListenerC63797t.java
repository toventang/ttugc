package com.p2082ss.android.ugc.aweme.profile.p3575f;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.f.t */
public final /* synthetic */ class View$OnClickListenerC63797t implements View.OnClickListener {

    /* renamed from: a */
    private final C63787p f144617a;

    /* renamed from: b */
    private final Activity f144618b;

    /* renamed from: c */
    private final View f144619c;

    /* renamed from: d */
    private final String f144620d;

    /* renamed from: e */
    private final User f144621e;

    static {
        Covode.recordClassIndex(75125);
    }

    View$OnClickListenerC63797t(C63787p pVar, Activity activity, View view, String str, User user) {
        this.f144617a = pVar;
        this.f144618b = activity;
        this.f144619c = view;
        this.f144620d = str;
        this.f144621e = user;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        this.f144617a.mo102351a(this.f144618b, this.f144619c, this.f144620d, this.f144621e);
    }
}
