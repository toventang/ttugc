package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.e */
public final /* synthetic */ class RunnableC49548e implements Runnable {

    /* renamed from: a */
    private final AbstractC49544a f113969a;

    /* renamed from: b */
    private final int f113970b;

    /* renamed from: c */
    private final C33942b f113971c;

    static {
        Covode.recordClassIndex(58389);
    }

    RunnableC49548e(AbstractC49544a aVar, int i, C33942b bVar) {
        this.f113969a = aVar;
        this.f113970b = i;
        this.f113971c = bVar;
    }

    public final void run() {
        this.f113969a.mo80935b(this.f113971c);
    }
}
