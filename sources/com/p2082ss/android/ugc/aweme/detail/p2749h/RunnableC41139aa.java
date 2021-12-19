package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;

/* renamed from: com.ss.android.ugc.aweme.detail.h.aa */
final /* synthetic */ class RunnableC41139aa implements Runnable {

    /* renamed from: a */
    private final AbstractC41220y f96143a;

    /* renamed from: b */
    private final ViewGroup f96144b;

    /* renamed from: c */
    private final TextView f96145c;

    static {
        Covode.recordClassIndex(49022);
    }

    RunnableC41139aa(AbstractC41220y yVar, ViewGroup viewGroup, TextView textView) {
        this.f96143a = yVar;
        this.f96144b = viewGroup;
        this.f96145c = textView;
    }

    public final void run() {
        ViewGroup viewGroup = this.f96144b;
        TextView textView = this.f96145c;
        int width = viewGroup.getWidth();
        int a = C34728n.m70946a(150.0d);
        if (width > a) {
            int width2 = width - textView.getWidth();
            if (AbstractC41220y.m83084a(textView, a, width2, 13) && AbstractC41220y.m83084a(textView, a, width2, 12)) {
                textView.setMaxWidth(a - width2);
            }
        }
    }
}
