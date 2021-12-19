package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.utils.gp */
public final class C80508gp extends ViewOutlineProvider {

    /* renamed from: a */
    private int f180105a;

    static {
        Covode.recordClassIndex(93781);
    }

    public C80508gp(int i) {
        this.f180105a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f180105a);
    }
}
