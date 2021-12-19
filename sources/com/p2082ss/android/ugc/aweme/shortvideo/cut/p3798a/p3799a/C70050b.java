package com.p2082ss.android.ugc.aweme.shortvideo.cut.p3798a.p3799a;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.a.b */
public final class C70050b extends ViewOutlineProvider {

    /* renamed from: a */
    private int f156657a;

    static {
        Covode.recordClassIndex(82470);
    }

    public C70050b(int i) {
        this.f156657a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f156657a);
    }
}
