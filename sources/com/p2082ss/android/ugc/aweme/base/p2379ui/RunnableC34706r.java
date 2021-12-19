package com.p2082ss.android.ugc.aweme.base.p2379ui;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tag.TuxTag;

/* renamed from: com.ss.android.ugc.aweme.base.ui.r */
final /* synthetic */ class RunnableC34706r implements Runnable {

    /* renamed from: a */
    private final Bitmap f81984a;

    /* renamed from: b */
    private final TuxTag f81985b;

    static {
        Covode.recordClassIndex(41693);
    }

    RunnableC34706r(Bitmap bitmap, TuxTag tuxTag) {
        this.f81984a = bitmap;
        this.f81985b = tuxTag;
    }

    public final void run() {
        Bitmap bitmap = this.f81984a;
        TuxTag tuxTag = this.f81985b;
        if (bitmap != null) {
            tuxTag.setTagIconBitmap(bitmap);
        }
    }
}
