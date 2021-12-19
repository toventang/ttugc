package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.utils.C84912r;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.e */
final /* synthetic */ class RunnableC46218e implements Runnable {

    /* renamed from: a */
    private final C46216c f107658a;

    /* renamed from: b */
    private final View f107659b;

    static {
        Covode.recordClassIndex(54780);
    }

    RunnableC46218e(C46216c cVar, View view) {
        this.f107658a = cVar;
        this.f107659b = view;
    }

    public final void run() {
        C46216c cVar = this.f107658a;
        View view = this.f107659b;
        cVar.smoothScrollTo((view.getLeft() - (cVar.getWidth() / 2)) - ((int) C84912r.m145930a(view.getContext(), (float) C46216c.f107655a)), 0);
    }
}
