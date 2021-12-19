package com.bytedance.ies.sdk.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.p022b.p023a.C0464a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class WidgetManager$$Lambda$0 implements C0464a.AbstractC0469d {
    private final WidgetManager arg$1;
    private final Widget arg$2;
    private final ViewGroup arg$3;

    static {
        Covode.recordClassIndex(20455);
    }

    WidgetManager$$Lambda$0(WidgetManager widgetManager, Widget widget, ViewGroup viewGroup) {
        this.arg$1 = widgetManager;
        this.arg$2 = widget;
        this.arg$3 = viewGroup;
    }

    @Override // androidx.p022b.p023a.C0464a.AbstractC0469d
    public final void onInflateFinished(View view, int i, ViewGroup viewGroup) {
        this.arg$1.lambda$load$0$WidgetManager(this.arg$2, this.arg$3, view, i, viewGroup);
    }
}
