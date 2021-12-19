package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.c */
public final class C46216c extends HorizontalScrollView {

    /* renamed from: a */
    static int f107655a = 16;

    static {
        Covode.recordClassIndex(54778);
    }

    public C46216c(Context context) {
        super(context, null);
        MethodCollector.m26663i(11691);
        setOverScrollMode(2);
        MethodCollector.m26664o(11691);
    }

    /* renamed from: a */
    public final void mo78470a(View view) {
        if (getWidth() == 0) {
            postDelayed(new RunnableC46217d(this, view), 100);
        } else {
            smoothScrollTo(((view.getLeft() + view.getRight()) / 2) - (getWidth() / 2), 0);
        }
    }
}
