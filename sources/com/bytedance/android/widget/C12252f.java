package com.bytedance.android.widget;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.C12243c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.widget.f */
public final /* synthetic */ class C12252f implements C12243c.AbstractC12248d {

    /* renamed from: a */
    private final WidgetManager f29526a;

    /* renamed from: b */
    private final Widget f29527b;

    /* renamed from: c */
    private final WidgetContainer f29528c;

    static {
        Covode.recordClassIndex(13987);
    }

    C12252f(WidgetManager widgetManager, Widget widget, WidgetContainer widgetContainer) {
        this.f29526a = widgetManager;
        this.f29527b = widget;
        this.f29528c = widgetContainer;
    }

    @Override // com.bytedance.android.widget.C12243c.AbstractC12248d
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.f29526a.lambda$loadNew$0$WidgetManager(this.f29527b, this.f29528c, view, i, viewGroup);
    }
}
