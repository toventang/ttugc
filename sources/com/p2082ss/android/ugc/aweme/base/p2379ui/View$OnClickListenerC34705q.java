package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.base.ui.q */
public final /* synthetic */ class View$OnClickListenerC34705q implements View.OnClickListener {

    /* renamed from: a */
    private final AwemeHybridLabelModel f81983a;

    static {
        Covode.recordClassIndex(41692);
    }

    View$OnClickListenerC34705q(AwemeHybridLabelModel awemeHybridLabelModel) {
        this.f81983a = awemeHybridLabelModel;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C36125t.m73598a(C36125t.m73591a(), this.f81983a.getRefUrl());
    }
}
