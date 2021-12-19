package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4141f;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.f.c */
final /* synthetic */ class RunnableC78958c implements Runnable {

    /* renamed from: a */
    private final C78957b f177464a;

    /* renamed from: b */
    private final ViewGroup f177465b;

    static {
        Covode.recordClassIndex(92107);
    }

    RunnableC78958c(C78957b bVar, ViewGroup viewGroup) {
        this.f177464a = bVar;
        this.f177465b = viewGroup;
    }

    public final void run() {
        C78957b bVar = this.f177464a;
        ViewGroup viewGroup = this.f177465b;
        if (viewGroup != null) {
            int b = (C70636dh.m124831b(bVar.f177454c.getContext()) - bVar.f177454c.getMeasuredWidth()) / 2;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.leftMargin = b;
            layoutParams.rightMargin = b;
            viewGroup.setLayoutParams(layoutParams);
        }
    }
}
