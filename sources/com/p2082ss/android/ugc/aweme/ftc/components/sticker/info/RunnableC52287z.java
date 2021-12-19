package com.p2082ss.android.ugc.aweme.ftc.components.sticker.info;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.info.z */
final /* synthetic */ class RunnableC52287z implements Runnable {

    /* renamed from: a */
    private final C52264i f120482a;

    /* renamed from: b */
    private final int f120483b;

    /* renamed from: c */
    private final int f120484c;

    /* renamed from: d */
    private final int[] f120485d;

    static {
        Covode.recordClassIndex(61675);
    }

    RunnableC52287z(C52264i iVar, int i, int i2, int[] iArr) {
        this.f120482a = iVar;
        this.f120483b = i;
        this.f120484c = i2;
        this.f120485d = iArr;
    }

    public final void run() {
        C52264i iVar = this.f120482a;
        int i = this.f120483b;
        int i2 = this.f120484c;
        int[] iArr = this.f120485d;
        if (i != 0 && i2 != 0 && iArr != null) {
            iVar.f120414E = new Rect(0, iArr[1], i, i2 + iArr[1]);
        }
    }
}
