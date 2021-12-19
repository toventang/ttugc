package com.p2082ss.android.ugc.aweme.feed.p2979x;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.x.b */
public final /* synthetic */ class RunnableC50533b implements Runnable {

    /* renamed from: a */
    private final AccessibilityManager f116800a;

    /* renamed from: b */
    private final AccessibilityEvent f116801b;

    static {
        Covode.recordClassIndex(59680);
    }

    RunnableC50533b(AccessibilityManager accessibilityManager, AccessibilityEvent accessibilityEvent) {
        this.f116800a = accessibilityManager;
        this.f116801b = accessibilityEvent;
    }

    public final void run() {
        this.f116800a.sendAccessibilityEvent(this.f116801b);
    }
}
