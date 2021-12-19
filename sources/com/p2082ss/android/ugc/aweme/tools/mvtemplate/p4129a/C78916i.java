package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a;

import android.content.Context;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.i */
public final class C78916i extends Scroller {

    /* renamed from: a */
    public int f177388a = 1500;

    static {
        Covode.recordClassIndex(92065);
    }

    public C78916i(Context context) {
        super(context);
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.f177388a);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f177388a);
    }
}
