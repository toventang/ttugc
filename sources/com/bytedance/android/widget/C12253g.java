package com.bytedance.android.widget;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.widget.C12243c;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.widget.g */
public final /* synthetic */ class C12253g implements C12243c.AbstractC12248d {

    /* renamed from: a */
    private final WidgetManager f29529a;

    /* renamed from: b */
    private final Widget f29530b;

    /* renamed from: c */
    private final ViewGroup f29531c;

    static {
        Covode.recordClassIndex(13988);
    }

    C12253g(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.f29529a = widgetManager;
        this.f29530b = widget;
        this.f29531c = viewGroup;
    }

    @Override // com.bytedance.android.widget.C12243c.AbstractC12248d
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.f29529a.lambda$loadOld$1$WidgetManager(this.f29530b, this.f29531c, view, i, viewGroup);
    }
}
