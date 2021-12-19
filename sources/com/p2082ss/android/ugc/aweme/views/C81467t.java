package com.p2082ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.views.t */
public final class C81467t extends ViewOutlineProvider {

    /* renamed from: a */
    private int f182123a;

    static {
        Covode.recordClassIndex(94839);
    }

    public C81467t(int i) {
        this.f182123a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f182123a);
    }
}
